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
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 100, 10,true,30);
        assertEquals(true, hero.useItem(0));
    }

    @Test
    void levelUpTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 100,0.0, new String[]{"Potion"});
        assertEquals(true, hero.levelUp());
    }
    @Test
    void levelUpTest2() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals(false, hero.levelUp());
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