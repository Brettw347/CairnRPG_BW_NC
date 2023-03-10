import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void runAway() {
        Character bob = new Character("Bob", 100.0, 35.0, true);
        assertNotNull(bob.runAway());
    }

    @Test
    void info() {
        Character bob = new Character("Bob", 100.0, 35.0, true);
        assertEquals("Character Name: Bob\nHealth: 100.0\nAttack Power: 35.0\nAlive: true", bob.info());
    }
}