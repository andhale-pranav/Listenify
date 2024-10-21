package spotifyclone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

//        SpiralMatrix sm = new SpiralMatrix();
//        sm.printMatrix(3, 3);
        System.out.println("Hello world!");

        Album album = new Album("Old Hindi Songs","Arijit Singh");

        album.addSongToAlbum("Pathaan",4.5);
        album.addSongToAlbum("Channa mereya",3.5);
        album.addSongToAlbum("Naina",5.0);

        albums.add(album);

        album = new Album("New Songs","Prateek Kuhad");

        album.addSongToAlbum("Kasoor",4.5);
        album.addSongToAlbum("Tum mile",3.5);
        album.addSongToAlbum("Baarishein",4.5);

        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addSongToPlayList("Pathaan",playList_1);
        albums.get(0).addSongToPlayList("Naina",playList_1);
        albums.get(1).addSongToPlayList("Kasoor",playList_1);
        albums.get(1).addSongToPlayList("Baarishein",playList_1);

        //print the playList that has been added
        //play(playList_1);



    }
}
