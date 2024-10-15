package spotifyclone;

import java.util.ArrayList;
import java.util.List;

public class Album {

    public String albumName;

    public String artistName;

    public List<Song> songList;

    Album (String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList = new ArrayList<>();
    }

}
