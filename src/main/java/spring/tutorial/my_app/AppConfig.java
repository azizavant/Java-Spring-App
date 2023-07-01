package spring.tutorial.my_app;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class AppConfig {

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public HipHopMusic hipHopMusic() {
        return new HipHopMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(rapMusic());
        musicList.add(hipHopMusic());
        musicList.add(classicalMusic());

        return new MusicPlayer(musicList);
    }
}
