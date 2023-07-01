package spring.tutorial.my_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
//    @Value("${musicPlayer.name}")
    private String name;

//    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
//            System.out.println("Playing: " + classicalMusic.getSong());
//            System.out.println("Playing: " + hipHopMusic.getSong());
        for (int i = 0; i < musicList.size(); i++) {
            System.out.println("Playing: " + musicList.get(i).getSong());
        }

    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
