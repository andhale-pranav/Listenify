package spotifyclone;

import java.util.ArrayList;
import java.util.LinkedList;
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

    //find song in album
    //taking input of song name, returning boolean
    public boolean findSongInAlbum(String title) {

        for(Song song : songList) {
            if(song.name.equals(title)) return true;
        }

        return false;
    }

    //add song to album
    //input of songname and duration
    //first check if the song is present in songlist
    //if not, create new obj and add to songList
    //if already present, return the msg
    public String addSongToAlbum(String title, double duration) {

        if(findSongInAlbum(title)){
            return "Song " + title + " is already present in the playlist";
        }

        Song newSong = new Song(title, duration);
        songList.add(newSong);
        return "Song " + title + " is added to the playlist";

    }

    //add song to playlist - with index
    //input of index and playlist name
    //check if index is valid
    //add song if valid
    public String addSongToPlayList(int trackNo, LinkedList<Song> playList){

        int idx = trackNo - 1;

        if(idx >= 0 && idx < songList.size()) {
            Song currSong = songList.get(idx);
            playList.add(currSong);
            return "Song " + currSong.name + " with track number " +trackNo+ " added to the playlist " + playList ;
        }

        return "Invalid track number";

    }

    //add song to playlist - with name
    //input of name and playlist
    //check if song exists
    //add
    public String addSongToPlayList(String title, LinkedList<Song> playList) {

        if(findSongInAlbum(title)){
            return "Song " + title + " is already present in the playlist";
        }

        for(Song song : songList) {
            if(song.name.equals(title)){
                playList.add(song);
                return "Song " + song.name + " added to the playlist " + playList ;
            }
        }

        return "this is not supposed to happen";
    }




}
