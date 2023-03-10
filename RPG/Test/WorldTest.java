import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorldTest {

    @Test
    void Info() {
        World world = new World();
        assertEquals("The World class creates the environment for the user by establishing a game name and being able to provide information about the publishers.", world.Info());
    }
}