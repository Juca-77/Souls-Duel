package model;

import com.aor.hero.model.game.arena.Arena;
import com.aor.hero.model.game.arena.ArenaBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Timer;
import java.util.TimerTask;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

public class ArenaBuilderSchedulleTest {
    @Mock
    private Arena mockArena;

    @Mock
    private Timer mockTimer;

    @InjectMocks
    private ArenaBuilder arenaBuilder;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        arenaBuilder.setArena(mockArena);
        arenaBuilder.setTimer(mockTimer);
    }

    @Test
    void scheduleGrenadesLast() {
        int seconds = 5000; // Adjust the delay as needed

        arenaBuilder.scheduleGrenadesLast(seconds);

        // Verify that the Timer's schedule method is called with the correct arguments
        verify(mockTimer).schedule(any(TimerTask.class), eq((long) seconds));

        // Verify that the addGrenadesLast method is called when the TimerTask runs

    }
    @Test
    void scheduleGrenade() {
        int seconds = 5000; // Adjust the delay as needed

        arenaBuilder.scheduleGrenade(seconds);

        // Verify that the Timer's schedule method is called with the correct arguments
        verify(mockTimer).schedule(any(TimerTask.class), eq((long) seconds));

        // Verify that the addGrenadesLast method is called when the TimerTask runs

    }
}
