public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + ": " + movie.getName() + "\nPlot: " + movie.plot());
		}
	}

	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number: " + randomNumber);
		switch (randomNumber) {
			case 1:
				return new HumanCentipede();
			case 2:
				return new JohnWick();
			case 3:
				return new Matrix();
			case 4:
				return new Shrek();
			case 5:
				return new Boring();
			default:
				return null;
		}
	}
}
