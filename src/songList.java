
import java.util.Collection;

public class songList {
    Collection<song> songs;

    public songList() {
        this.songs = songs;
    }

    public Collection<song> getSongs() {
        return songs;
    }

    public void setSongs(Collection<song> songs) {
        this.songs = songs;
    }

    public static song[] shuffle3(song[] songs){
        song[] shuffled = new song[songs.length];
        int start=0;
        int currentEnd;
        if(songs.length<=1) return songs;
        while(start<=songs.length-1){
            currentEnd = songs.length-1-start;
            int i = (int) (Math.random()*currentEnd+1);
            shuffled[start] = songs[i-1];
            song temp = songs[i-1];
            songs[i-1] = songs[currentEnd];
            songs[currentEnd] = temp;
            start++;
        }
        return shuffled;
    }
    public static void main(String[] args) {
        song[] songs = new song[5];
        song butterflies = new song("butterflies");
        song blake = new song("blake");
        song river = new song("river");
        song blink = new song("blink");
        song great = new song("great");
        songs[0]= butterflies;
        songs[1] = blake;
        songs[2] = river;
        songs[3] = blink;
        songs[4] = great;
        for(int j=0;j<15;j++) {
            song[] newarr = shuffle3(songs);
            System.out.println("shuffle number " + j);
            for (int i = 0; i <= newarr.length - 1; i++) {
                System.out.println(i+". " + newarr[i].getName());
            }

        }
    }
}