import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	private static Map<String, CelestialObject> solarSystem = new HashMap<>();
	private static Set<CelestialObject> planets = new HashSet<>();

	public static void main(String[] args) {
		CelestialObject tempPlanet = new CelestialObject("Mercury", 88);
		solarSystem.put(tempPlanet.getName(), tempPlanet);
		planets.add(tempPlanet);

		tempPlanet = new CelestialObject("Venus", 225);
		solarSystem.put(tempPlanet.getName(), tempPlanet);
		planets.add(tempPlanet);

		tempPlanet = new CelestialObject("Earth", 365);
		solarSystem.put(tempPlanet.getName(), tempPlanet);
		planets.add(tempPlanet);

		CelestialObject tempMoon = new CelestialObject("Moon", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		tempPlanet.addMoon(tempMoon);

		tempPlanet = new CelestialObject("Mars", 687);
		solarSystem.put(tempPlanet.getName(), tempPlanet);
		planets.add(tempPlanet);

		tempMoon = new CelestialObject("Deimos", 1.3);
		solarSystem.put(tempMoon.getName(), tempMoon);
		tempPlanet.addMoon(tempMoon);

		tempMoon = new CelestialObject("Phobos", 0.3);
		solarSystem.put(tempMoon.getName(), tempMoon);
		tempPlanet.addMoon(tempMoon);

		tempPlanet = new CelestialObject("Jupiter", 4332);
		solarSystem.put(tempPlanet.getName(), tempPlanet);
		planets.add(tempPlanet);

		tempMoon = new CelestialObject("Io", 1.8);
		solarSystem.put(tempMoon.getName(), tempMoon);
		tempPlanet.addMoon(tempMoon);

		tempMoon = new CelestialObject("Europa", 3.5);
		solarSystem.put(tempMoon.getName(), tempMoon);
		tempPlanet.addMoon(tempMoon);

		tempMoon = new CelestialObject("Ganymede", 7.1);
		solarSystem.put(tempMoon.getName(), tempMoon);
		tempPlanet.addMoon(tempMoon);

		tempMoon = new CelestialObject("Callisto", 16.7);
		solarSystem.put(tempMoon.getName(), tempMoon);
		tempPlanet.addMoon(tempMoon);

		tempPlanet = new CelestialObject("Saturn", 10759);
		solarSystem.put(tempPlanet.getName(), tempPlanet);
		planets.add(tempPlanet);

		tempPlanet = new CelestialObject("Uranus", 30660);
		solarSystem.put(tempPlanet.getName(), tempPlanet);
		planets.add(tempPlanet);

		tempPlanet = new CelestialObject("Neptune", 165);
		solarSystem.put(tempPlanet.getName(), tempPlanet);
		planets.add(tempPlanet);

		tempPlanet = new CelestialObject("Pluto", 248);
		solarSystem.put(tempPlanet.getName(), tempPlanet);
		planets.add(tempPlanet);

		System.out.println("Planets:");
		for (CelestialObject planet : planets)
			System.out.println("\t" + planet.getName());

		CelestialObject mars = solarSystem.get("Mars");
		System.out.println(mars.getName() + " moons:");
		for (CelestialObject marsMoon : mars.getSatellites())
			System.out.println("\t" + marsMoon.getName());

		Set<CelestialObject> moons = new HashSet<>();
		for (CelestialObject planet : planets)
			moons.addAll(planet.getSatellites());
		System.out.println("All moons:");
		for (CelestialObject moon : moons) {
			System.out.println("\t" + moon.getName());
		}

		CelestialObject pluto = new CelestialObject("Pluto", 842);
		planets.add(pluto);
		for (CelestialObject planet : planets)
			System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());

		Object o = new Object();
		o.equals(o);
		"pluto".equals("");
	}
}
