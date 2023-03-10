import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    @DisplayName("Normal fight method")
    void fightTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 100, 10,true,30);
        assertEquals(true, enemy.Fight(hero));
    }

    @Test
    @DisplayName("fight method with hero taking damage that would defeat him")
    void fightTest2() {
        Hero hero = new Hero("Hero", 10, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 100, 10,true,30);
        assertEquals(true, enemy.Fight(hero));
    }
    @Test
    @DisplayName("Normal info method")
    void testInfo1() {
        Enemy enemy = new Enemy("Enemy", 100, 10,true,30);
        assertEquals("Name: " + "Enemy" + "\n" + "Health: " + "100.0" + "\n" + "Attack Power: " + "10.0" + "\n" + "Alive: " +
                "true" + "\n" + "Magic Power: " + "30" + "\n", enemy.info());
    }
}