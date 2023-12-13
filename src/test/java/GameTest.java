
import com.aor.hero.Game;
import com.aor.hero.states.MainMenuState;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void createLanternaGUI() throws FontFormatException, IOException, URISyntaxException {
        Game game = new Game();

        assertNotNull(game.gui);

    }


    @Test
    public void initialStateIsMainMenuState() throws IOException, URISyntaxException, FontFormatException {
        Game game = new Game();
        assertEquals(MainMenuState.class, game.state.getClass());
    }



}