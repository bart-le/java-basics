import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private SongList songs;

	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new SongList();
	}

	public boolean addSong(String title, double duration) {
		return this.songs.addSong(new Song(title, duration));
	}

	public boolean addSongToPlaylist(int trackNumber, LinkedList<Song> playlist) {
		Song song = this.songs.findSong(trackNumber);
		if (song != null) {
			playlist.add(song);
			return true;
		} else {
			System.out.println("This album does not have #" + trackNumber + " track");
			return false;
		}
	}

	public boolean addSongToPlaylist(String title, LinkedList<Song> playlist) {
		Song song = this.songs.findSong(title);
		if (song != null) {
			playlist.add(song);
			return true;
		} else {
			System.out.println("This album does not have a song titled " + title);
			return false;
		}
	}

	private class SongList {
		private ArrayList<Song> songs;

		public SongList() {
			this.songs = new ArrayList<Song>();
		}

		public boolean addSong(Song song) {
			if (this.songs.contains(song)) {
				return false;
			} else {
				this.songs.add(song);
				return true;
			}
		}

		private Song findSong(String title) {
			for (Song song : this.songs) {
				if (song.getTitle().equals(title))
					return song;
			}

			return null;
		}

		private Song findSong(int trackNumber) {
			int index = trackNumber - 1;
			if ((index >= 0) && (index < this.songs.size()))
				return this.songs.get(index);

			return null;
		}
	}
}
