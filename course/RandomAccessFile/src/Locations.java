import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer, Location> {
	private static Map<Integer, Location> locations = new HashMap<>();
	private static Map<Integer, IndexRecord> index = new LinkedHashMap<>();
	private static RandomAccessFile raf;

	public static void main(String[] args) throws IOException {
		try (RandomAccessFile rao = new RandomAccessFile("locations_rand.dat", "rwd")) {
			rao.writeInt(locations.size());
			int indexSize = locations.size() * 3 * Integer.BYTES;
			int locationStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);
			rao.writeInt(locationStart);

			long indexStart = rao.getFilePointer();
			int startPointer = locationStart;
			rao.seek(startPointer);

			for (Location location : locations.values()) {
				rao.writeInt(location.getLocationId());
				rao.writeUTF(location.getDescription());
				StringBuilder builder = new StringBuilder();

				for (String direction : location.getExits().keySet())
					if (!direction.equalsIgnoreCase("Q")) {
						builder.append(direction);
						builder.append(",");
						builder.append(location.getExits().get(direction));
						builder.append(",");
					}

				rao.writeUTF(builder.toString());

				IndexRecord record = new IndexRecord(startPointer, (int) (rao.getFilePointer() - startPointer));
				index.put(location.getLocationId(), record);

				startPointer = (int) rao.getFilePointer();
			}

			rao.seek(indexStart);
			for (Integer locationId : index.keySet()) {
				rao.writeInt(locationId);
				rao.writeInt(locationId);
				rao.writeInt(index.get(locationId).getStartByte());
				rao.writeInt(index.get(locationId).getLength());
			}
		}
	}

	static {
		try {
			raf = new RandomAccessFile("locations_rand.dat", "rwd");
			int numLocations = raf.readInt();
			long locationStartPoint = raf.readInt();

			while (raf.getFilePointer() < locationStartPoint) {
				int locationId = raf.readInt();
				int locationStart = raf.readInt();
				int locationLength = raf.readInt();

				IndexRecord record = new IndexRecord(locationStart, locationLength);
				index.put(locationId, record);
			}
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}

	public void close() throws IOException {
		raf.close();
	}

	public Location getLocation(int locationId) throws IOException {
		IndexRecord record = index.get(locationId);
		raf.seek(record.getStartByte());
		int id = raf.readInt();
		String description = raf.readUTF();
		String exits = raf.readUTF();
		String[] exitPart = exits.split(",");
		Location location = new Location(locationId, description, null);

		if (locationId != 0)
			for (int i = 0; i < exitPart.length; i++) {
				String direction = exitPart[i];
				int destination = Integer.parseInt(exitPart[++i]);
				location.addExit(direction, destination);
			}

		return location;
	}

	@Override
	public int size() {
		return locations.size();
	}

	@Override
	public boolean isEmpty() {
		return locations.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return locations.containsValue(value);
	}

	@Override
	public Location get(Object key) {
		return locations.get(key);
	}

	@Override
	public Location put(Integer key, Location value) {
		return locations.put(key, value);
	}

	@Override
	public Location remove(Object key) {
		return locations.remove(key);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location> m) {

	}

	@Override
	public void clear() {
		locations.clear();
	}

	@Override
	public Set<Integer> keySet() {
		return locations.keySet();
	}

	@Override
	public Collection<Location> values() {
		return locations.values();
	}

	@Override
	public Set<Entry<Integer, Location>> entrySet() {
		return locations.entrySet();
	}
}
