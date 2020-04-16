import java.util.HashSet;
import java.util.Set;

public abstract class CelestialObject {
	private final Key key;
	private final double orbitalPeriod;
	private final Set<CelestialObject> satellites;

	public enum BodyType {
		STAR,
		PLANET,
		DWARF_PLANET,
		MOON,
		COMET,
		ASTEROID
	}

	public CelestialObject(String name, double orbitalPeriod, BodyType bodyType) {
		this.key = new Key(name, bodyType);
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	public Key getKey() {
		return key;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public boolean addSatellite(CelestialObject moon) {
		return satellites.add(moon);
	}

	public Set<CelestialObject> getSatellites() {
		return new HashSet<>(satellites);
	}

	public static Key makeKey(String name, BodyType bodyType) {
		return new Key(name, bodyType);
	}

	@Override
	public final boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (object instanceof CelestialObject) {
			CelestialObject celestialObject = (CelestialObject) object;
			return this.key.equals(celestialObject.getKey());
		}

		return false;
	}

	@Override
	public final int hashCode() {
		return this.key.hashCode();
	}

	@Override
	public String toString() {
		return this.key.name + " [" + this.key.bodyType + "]: " + this.orbitalPeriod;
	}

	public static final class Key {
		private String name;
		private BodyType bodyType;

		private Key(String name, BodyType bodyType) {
			this.name = name;
			this.bodyType = bodyType;
		}

		public String getName() {
			return name;
		}

		public BodyType getBodyType() {
			return bodyType;
		}

		@Override
		public boolean equals(Object object) {
			Key key = (Key) object;

			if (this.name.equals(key.getName()))
				return (this.bodyType == key.getBodyType());
			else
				return false;
		}

		@Override
		public int hashCode() {
			return this.name.hashCode() + this.bodyType.hashCode() + 42;
		}

		@Override
		public String toString() {
			return this.name + " [" + this.bodyType + "]";
		}
	}
}
