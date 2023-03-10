import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorldTestv2 {

    @Test
    void getGameName() {
        World world = new World();
        assertEquals("Earth", world.getGameName());
    }

    @Test
    void getPublisher() {
        World world = new World();
        assertEquals("Brett & Nico", world.getPublisher());
    }
}