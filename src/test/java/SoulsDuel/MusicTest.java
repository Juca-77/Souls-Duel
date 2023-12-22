package SoulsDuel;

import SoulsDuel.controller.game.SoulController;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.Soul;
import SoulsDuel.viewer.Music;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class MusicTest {
    Music music;
    @BeforeEach
    void setUp(){
        music=new Music("sounds/gameplaysong.wav");
    }

    @Test
    public void loadSoundTest(){
        assertEquals(null, music.loadSound("a.wav"));
    }

    @Test
    public void musictest(){
        Clip sound=mock(Clip.class);
        music.setSound(sound);
        assertEquals(false, music.isPlaying());
        when(sound.isRunning()).thenReturn(true);
        music.start();
        assertEquals(true, music.isPlaying());
        Mockito.verify(sound, times(1)).setMicrosecondPosition(0);
        Mockito.verify(sound, times(1)).start();
        Mockito.verify(sound, times(1)).loop(Clip.LOOP_CONTINUOUSLY);
    }

    @Test
    void createAndLoadSound() {
        String path = "sounds/gameplaysong.wav";
        music = new Music(path);
        FloatControl floatControl = (FloatControl) music.getSound().getControl(FloatControl.Type.MASTER_GAIN);
        assertNotNull(music);
        assertEquals(-25.0f, floatControl.getValue());
    }

    @Test
    void testStart() {
        // Arrange
        Music music = new Music("testSound.wav");
        Clip mockClip = mock(Clip.class);
        music.setSound(mockClip);

        // Act
        music.start();

        // Assert
        verify(mockClip).setMicrosecondPosition(0);
        verify(mockClip).start();
        verify(mockClip).loop(Clip.LOOP_CONTINUOUSLY);
    }



    @Test
    void testSleep() {
        // Arrange
        Music music = new Music("testSound.wav");

        // Act and Assert
        assertDoesNotThrow(() -> music.sleep());
    }

    @Test
    void testStop() {
        // Arrange
        Music music = new Music("testSound.wav");
        Clip mockClip = mock(Clip.class);
        music.setSound(mockClip);

        // Act
        music.stop();

        // Assert
        verify(mockClip).stop();
    }


}

