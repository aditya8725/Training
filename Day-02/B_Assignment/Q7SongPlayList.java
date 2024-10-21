import java.util.*;
 
class Song{
        String tile;
        String artist;
        String duration;
 
        Song(String title,String artist, String duration){
            this.tile=title;
            this.artist=artist;
            this.duration=duration;
        }
        void display(){
            System.out.println("Song Title: "+this.tile+" Song artist: "+this.artist+" Song Duration: "+this.duration);
        }
}
 
class PlayList{
    List<Song>playList;
    PlayList(){
        playList=new ArrayList<Song>();
    }
 
    void addSong(Song s){
        playList.add(s);
    }
 
    void removeSong(){
        if(!playList.isEmpty())
        playList.remove(playList.size()-1);
    }
 
    void displayPlayList(){
        for(Song s: playList){
            s.display();
        }
    }
 
 
}
 
public class Q7SongPlayList {
 
    public static void main(String[] args) {
        PlayList pl=new PlayList();
        pl.addSong(new Song("abc", "Badsha", "5:00"));
        pl.addSong(new Song("xyz", "Honey singh", "4:00"));
        pl.addSong(new Song("klm", "Sundhi chauhan", "1:00"));
 
        pl.displayPlayList();
 
        pl.removeSong();
        pl.displayPlayList();
 
    }
    
}
