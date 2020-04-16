import java.util.HashSet;
import java.util.Set;

public class CelestialObject {
	private final String name;
	private final double orbitalPeriod;
	private final Set<CelestialObject> satellites;

	public CelestialObject(String name, double orbitalPeriod) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public boolean addMoon(CelestialObject moon) {
		return satellites.add(moon);
	}

	public Set<CelestialObject> getSatellites() {
		return new HashSet<>(satellites);
	}
}
