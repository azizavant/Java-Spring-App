package spring.tutorial.my_app;

import org.springframework.stereotype.Component;

public class HipHopMusic implements Music {

    @Override
    public String getSong() {
        return "Neffex Cold";
    }
}
