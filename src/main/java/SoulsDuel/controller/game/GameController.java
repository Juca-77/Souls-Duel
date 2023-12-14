package SoulsDuel.controller.game;

import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.controller.Controller;

public abstract class GameController extends Controller<Arena> {
    public GameController(Arena arena) {
        super(arena);
    }
}
