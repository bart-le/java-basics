import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {
		Album album = new Album("Najebawszy EP", "Smarki Smark");
		album.addSong("Kawałek O Rapie", 3.59);
		album.addSong("Kawałek O Pieniądzach", 3.36);
		album.addSong("Kawałek O Miłości", 2.57);
		album.addSong("Kawałek O Niczym Konkretnym", 4.56);
		album.addSong("Kawałek O Ściemnianiu Panien", 5.20);
		album.addSong("Kawałek O Wspomnieniach", 4.32);
		album.addSong("Kawałek O Życiu", 4.17);
		albums.add(album);

		album = new Album("Muzyka Klasyczna", "Pezet/Noon");
		album.addSong("To Tylko Ja", 2.58);
		album.addSong("Re-Fleksje", 3.27);
		album.addSong("5-10-15", 4.06);
		album.addSong("Fraza 01", 0.19);
		album.addSong("Bez Twarzy", 2.25);
		album.addSong("Seniorita", 3.10);
		album.addSong("Slang", 3.08);
		album.addSong("Forma 02", 0.27);
		album.addSong("Zimnafuzja", 3.11);
		album.addSong("Wibracja 03", 0.27);
		album.addSong("Rap Robię", 4.00);
		album.addSong("Ukryty W Mieście Krzyk", 3.21);
		album.addSong("Te Same Dni, Te Same Sny", 4.25);
		album.addSong("Muzyka Instrumentalna", 1.14);
		albums.add(album);

		LinkedList<Song> playlist = new LinkedList<Song>();
		albums.get(0).addSongToPlaylist("Kawałek O Niczym Konkretnym", playlist);
		albums.get(0).addSongToPlaylist("Kawałek O Pieniądzach", playlist);
		albums.get(0).addSongToPlaylist("Kawałek O Brudnych Sercach W Wigilię", playlist);
		albums.get(0).addSongToPlaylist(3, playlist);
		albums.get(1).addSongToPlaylist(6, playlist);
		albums.get(1).addSongToPlaylist(12, playlist);
		albums.get(1).addSongToPlaylist(20, playlist);

		play(playlist);
	}

	private static void play(LinkedList<Song> playlist) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playlist.listIterator();

		if (playlist.size() > 0) {
			System.out.println("Now playing - " + listIterator.next().toString());
			printMenu();
		} else {
			System.out.println("No songs in playlist");
		}

		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
				case 0:
					System.out.println("Playlist complete");
					quit = true;
					break;
				case 1:
					if (!forward) {
						if (listIterator.hasNext())
							listIterator.next();
					}
					forward = true;
					if (listIterator.hasNext()) {
						System.out.println("Now playing - " + listIterator.next().toString());
					} else {
						System.out.println("End of playlist");
						forward = false;
					}
					break;
				case 2:
					if (forward) {
						if (listIterator.hasPrevious())
							listIterator.previous();
					}
					forward = false;
					if (listIterator.hasPrevious()) {
						System.out.println("Now playing - " + listIterator.previous().toString());
					} else {
						System.out.println("Start of playlist");
						forward = true;
					}
					break;
				case 3:
					if (forward) {
						if (listIterator.hasPrevious()) {
							System.out.println("Now replaying - " + listIterator.previous().toString());
							forward = false;
						} else {
							System.out.println("Start of playlist");
						}
					} else {
						if (listIterator.hasNext()) {
							System.out.println("Now replaying - " + listIterator.next().toString());
							forward = true;
						} else {
							System.out.println("End of playlist");
						}
					}
					break;
				case 4:
					if (playlist.size() > 0) {
						printList(playlist);
					} else {
						System.out.println("No songs in playlist");
					}
				case 5:
					printMenu();
					break;
				case 6:
					if (playlist.size() > 0) {
						listIterator.remove();
						if (listIterator.hasNext()) {
							System.out.println("Now replaying - " + listIterator.next().toString());
						} else if (listIterator.hasPrevious()) {
							System.out.println("Now replaying - " + listIterator.previous().toString());
						}
					} else {
						System.out.println("No songs in playlist");
					}
					break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available actions:");
		System.out.println("0 - to quit");
		System.out.println("1 - play the next song");
		System.out.println("2 - play the previous song");
		System.out.println("3 - replay the current song");
		System.out.println("4 - list songs in the playlist");
		System.out.println("5 - print available actions");
		System.out.println("6 - delete current song from playlist");
	}

	private static void printList(LinkedList<Song> playlist) {
		Iterator<Song> iterator = playlist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
