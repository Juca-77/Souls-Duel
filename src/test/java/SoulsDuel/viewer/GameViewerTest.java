package SoulsDuel.viewer;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.*;

import SoulsDuel.viewer.game.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.mockito.Mockito.*;


public class GameViewerTest {

    @Test
    void testDrawElements() {
        // Arrange
        Arena arena = mock(Arena.class);
        GUI gui = mock(GUI.class);

        // Mock arena elements
        Soul soul = mock(Soul.class);
        Enemy enemy = mock(Enemy.class);
        List<Blade> blades = new ArrayList<>();
        List<Grenade> grenades = new ArrayList<>();

        // Set up arena mock
        when(arena.getWalls()).thenReturn(new ArrayList<>());
        when(arena.getSoul()).thenReturn(soul);
        when(arena.getEnemy()).thenReturn(enemy);
        when(arena.getBlades()).thenReturn(blades);
        when(arena.getGrenades()).thenReturn(grenades);
        when(arena.getWidth()).thenReturn(100); // Replace with the actual width value
        when(arena.getLevel()).thenReturn(1); // Replace with the actual level value

        // Create GameViewer instance
        GameViewer gameViewer = new GameViewer(arena);

        // Act
        gameViewer.drawElements(gui);

        // Assert
        // Verify that the necessary methods are called
        verify(gui, times(2)).drawText(any(), any(), any());
        verify(soul, times(1)).getHp();
        verify(arena, times(1)).getLevel();

    }


    private GameViewer gameViewer;
    private Arena arena;
    private GUI mockGui;


    @BeforeEach
    void setUp() {
        arena = Mockito.mock(Arena.class);
        gameViewer = new GameViewer(arena);
        mockGui = Mockito.mock(GUI.class);
    }

    @Test
    void testDrawElements2() {
        // Set up mock objects for elements
        Soul mockSoul = mock(Soul.class);
        Enemy mockEnemy = mock(Enemy.class);
        Blade mockBlade1 = mock(Blade.class);
        Blade mockBlade2 = mock(Blade.class);
        Grenade mockGrenade1 = mock(Grenade.class);
        Grenade mockGrenade2 = mock(Grenade.class);

        // Set up model with mock elements
        when(arena.getSoul()).thenReturn(mockSoul);
        when(arena.getEnemy()).thenReturn(mockEnemy);
        when(arena.getBlades()).thenReturn(List.of(mockBlade1, mockBlade2));
        when(arena.getGrenades()).thenReturn(List.of(mockGrenade1, mockGrenade2));
        when(arena.getWidth()).thenReturn(50);
        when(mockSoul.getHp()).thenReturn(20);
        when(arena.getLevel()).thenReturn(2);

        // Execute the drawElements method
        gameViewer.drawElements(mockGui);

        // Verify that the expected methods are called with the correct arguments
        verify(mockGui, times(1)).drawText(new Position(50 / 2 - 15, 41), "HP: 20/30", "#FFFFFF");
        verify(mockGui, times(1)).drawText(new Position(50 / 2 + 9, 41), "LEVEL:2", "#FFFFFF");
    }

}
