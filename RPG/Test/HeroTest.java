import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void fightTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 100, 10,true,30);
        assertEquals(true, hero.Fight(enemy));
    }

    @Test
    void useItemTest1() {
    }

    @Test
    void levelUp() {
    }

    @Test
    void addToInventory() {
    }

    @Test
    void showInventory() {
    }

    @Test
    void info() {
    }
}