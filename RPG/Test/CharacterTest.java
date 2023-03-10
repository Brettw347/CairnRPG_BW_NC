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

    @Test
    void info2() {
        Character steve = new Character("Steve", 200.0, 25.0, false);
        assertEquals("Character Name: Steve\nHealth: 200.0\nAttack Power: 25.0\nAlive: false", steve.info());
    }
}