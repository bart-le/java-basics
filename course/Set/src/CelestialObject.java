import java.util.HashSet;
import java.util.Set;

public final class CelestialObject {
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

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		System.out.println("this.getClass(): " + this.getClass());
		System.out.println("object.getClass(): " + object.getClass());
		if ((object == null) || (object.getClass() != this.getClass())) {
			return false;
		}

		String objectName = ((CelestialObject) object).getName();
		return this.name.equals(objectName);
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode();");
		return this.name.hashCode() + 42;
	}
}
