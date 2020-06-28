package pl.marcisz.patryk.sda.zdjavapol12.inheritance.exercise;

public class Animal {
    public static void main(String[] args) {
        Zwierze zwierze = new Zwierze();
        Object obiektoweZwierze = zwierze;
        Object obiektoweZwierze2 = new Zwierze();
        //Ssak ssak = zwierze; nie da sie bo zwierze nie jest ssakiem
        //Ssak ssak = (Ssak)zwierze; to samo, rzuca java.lang.ClassCastException:
        try {
            Ssak ssak = (Ssak)zwierze; //tak czy inaczej nie robcie tego w domu
        } catch (ClassCastException e){
            System.out.println("no nie da sie tego rzutowac, sorry");
        }
        //Gad gad = zwierze; itd. ta sama historia

        Gad gad = new Gad();
        Zwierze gadZwierze = gad;
        Object gadObject = gad;
        //Ssak ssakGad = gad;

        MusicPlayer p1 = new MP3Player();
        MusicPlayer p2 = new Phone();

        p1.playSong("track");
        p2.playSong("track");

        //MusicPlayer player = new MusicPlayer();
        System.out.println(p1.playerName());
        System.out.println(p2.playerName());
    }
}

class Zwierze {

}

class Ssak extends Zwierze {
}

class Gad extends Zwierze {
}

interface MusicPlayer {
    public abstract void playSong(String track);

    default String playerName() {
        return "Music";
    }
}

class MP3Player implements MusicPlayer {
    @Override
    public void playSong(String songName){
        System.out.println("MP3 playing the song: " + songName);
    }

    @Override
    public String playerName() {
        return "MP3#";
    }
}
class Phone implements MusicPlayer {
    @Override
    public void playSong(String songName){
        System.out.println("Phone playing the song " + songName);
    }
}