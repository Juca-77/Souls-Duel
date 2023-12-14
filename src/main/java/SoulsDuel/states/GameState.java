package SoulsDuel.states;

import SoulsDuel.controller.Controller;
import SoulsDuel.controller.game.ArenaController;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.viewer.Viewer;
import SoulsDuel.viewer.game.GameViewer;

public class GameState extends State<Arena> {
    public GameState(Arena arena) {
        super(arena);
    }

    @Override
    protected Viewer<Arena> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<Arena> getController() {
        return new ArenaController(getModel());
    }
}
