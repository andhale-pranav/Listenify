package spotifyclone;

import java.util.*;

public class Main {

    public static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

//        SpiralMatrix sm = new SpiralMatrix();
//        sm.printMatrix(3, 5);




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


        album.addSongToPlayList("Pathaan", playList_1 );
        //print the playList that has been added
        play(playList_1);

    }

    public static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("Empty playlist");
            return;
        }

        Scanner sc = new Scanner(System.in);

        printMenu();

        System.out.println("\nNow playing " + listIterator.next());

        boolean forward = true;
        boolean quit = false;

        while (quit==false){
            int choice = sc.nextInt();
            switch (choice) {

                case 0:
                    System.out.println("Exiting From App");
                    quit = true;
                    break;
                case 1:
                    if(forward==false){
                        if(listIterator.hasNext()){
                            listIterator.next();
                            forward = true;
                        }
                    }
                    if(listIterator.hasNext()){
                        System.out.println(listIterator.next().toString());
                    } else {
                        System.out.println("Last song hai bhai");
                    }
                    break;

                case 2:
                    if(forward){
                        listIterator.previous();
                        forward = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println(listIterator.previous().toString());
                    } else {
                        System.out.println("You are already at the first Song");
                    }
                    break;

                case 3:
                    if(forward){
                        System.out.println(listIterator.previous().toString());
                        forward = false;
                    }
                    else{
                        if(listIterator.hasNext()){
                            System.out.println(listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Hmm, strange...ListIterator is behind and still there's no next song");
                        }
                    }
                    break;

                case 4:
                    printAllSongs(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    //delete
                    break;


            }
        }
    }

    public static void printAllSongs(LinkedList<Song> songs) {

        ListIterator<Song> listIterator = songs.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }
    }

    public static void printMenu() {
        System.out.println("Available options\npress\n" +
                "0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list of all songs\n" +
                "5 - print all available options\n" +
                "6 - delete current song");

    }


}
