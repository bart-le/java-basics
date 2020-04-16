import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	private static Map<CelestialObject.Key, CelestialObject> solarSystem = new HashMap<>();
	private static Set<CelestialObject> planets = new HashSet<>();

	public static void main(String[] args) {
		CelestialObject tempPlanet = new Planet("Mercury", 88);
		solarSystem.put(tempPlanet.getKey(), tempPlanet);
		planets.add(tempPlanet);

		tempPlanet = new Planet("Venus", 225);
		solarSystem.put(tempPlanet.getKey(), tempPlanet);
		planets.add(tempPlanet);

		tempPlanet = new Planet("Earth", 365);
		solarSystem.put(tempPlanet.getKey(), tempPlanet);
		planets.add(tempPlanet);

		CelestialObject tempMoon = new Moon("Moon", 27);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		tempPlanet.addSatellite(tempMoon);

		tempPlanet = new Planet("Mars", 687);
		solarSystem.put(tempPlanet.getKey(), tempPlanet);
		planets.add(tempPlanet);

		tempMoon = new Moon("Deimos", 1.3);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		tempPlanet.addSatellite(tempMoon);

		tempMoon = new Moon("Phobos", 0.3);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		tempPlanet.addSatellite(tempMoon);

		tempPlanet = new Planet("Jupiter", 4332);
		solarSystem.put(tempPlanet.getKey(), tempPlanet);
		planets.add(tempPlanet);

		tempMoon = new Moon("Io", 1.8);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		tempPlanet.addSatellite(tempMoon);

		tempMoon = new Moon("Europa", 3.5);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		tempPlanet.addSatellite(tempMoon);

		tempMoon = new Moon("Ganymede", 7.1);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		tempPlanet.addSatellite(tempMoon);

		tempMoon = new Moon("Callisto", 16.7);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		tempPlanet.addSatellite(tempMoon);

		tempPlanet = new Planet("Saturn", 10759);
		solarSystem.put(tempPlanet.getKey(), tempPlanet);
		planets.add(tempPlanet);

		tempPlanet = new Planet("Uranus", 30660);
		solarSystem.put(tempPlanet.getKey(), tempPlanet);
		planets.add(tempPlanet);

		tempPlanet = new Planet("Neptune", 165);
		solarSystem.put(tempPlanet.getKey(), tempPlanet);
		planets.add(tempPlanet);

		tempPlanet = new Planet("Pluto", 248);
		solarSystem.put(tempPlanet.getKey(), tempPlanet);
		planets.add(tempPlanet);

		System.out.println("Planets:");
		for (CelestialObject planet : planets)
			System.out.println("\t" + planet.getKey());

		CelestialObject mars = solarSystem.get(CelestialObject.makeKey("Mars", CelestialObject.BodyType.PLANET));
		System.out.println(mars.getKey() + " moons:");
		for (CelestialObject marsMoon : mars.getSatellites())
			System.out.println("\t" + marsMoon.getKey());

		Set<CelestialObject> moons = new HashSet<>();
		for (CelestialObject planet : planets)
			moons.addAll(planet.getSatellites());
		System.out.println("All moons:");
		for (CelestialObject moon : moons) {
			System.out.println("\t" + moon.getKey());
		}

		CelestialObject pluto = new DwarfPlanet("Pluto", 842);
		planets.add(pluto);
		for (CelestialObject planet : planets)
			System.out.println(planet);

		CelestialObject earth1 = new Planet("Earth", 365);
		CelestialObject earth2 = new Planet("Earth", 365);
		System.out.println(earth1.equals(earth2));
		System.out.println(earth2.equals(earth1));
		System.out.println(earth1.equals(pluto));
		System.out.println(pluto.equals(earth1));

		solarSystem.put(pluto.getKey(), pluto);
		System.out.println(solarSystem.get(CelestialObject.makeKey("Pluto", CelestialObject.BodyType.PLANET)));
		System.out.println(solarSystem.get(CelestialObject.makeKey("Pluto", CelestialObject.BodyType.DWARF_PLANET)));

		System.out.println("The Solar System contains:");
		for (CelestialObject celestialObject : solarSystem.values())
			System.out.println(celestialObject);
	}
}
