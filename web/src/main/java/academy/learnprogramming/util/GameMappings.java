package academy.learnprogramming.util;

import org.springframework.stereotype.Component;

@Component
public final class GameMappings {
    //==constants==
    public static final String PLAY = "play";
    public static final String HOME = "/";
    public static final String REDIRECT_PLAY = "redirect:/" + PLAY;
    public static final String RESTART = "restart";
    //==constructor ==
    private GameMappings() {
    }
}
