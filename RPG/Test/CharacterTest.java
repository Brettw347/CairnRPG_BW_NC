import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    // Hero Class Unit Tests
    @Test
    @DisplayName("Normal Fight")
    void FightTest1(){
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 100, 30, true, 30);
        assertEquals(true, Hero.Fight(enemy));
    }

    @Test
    @DisplayName("Normal useItem")
    void useItemTest1(){
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 100, 30, true, 30);
        assertEquals(0, Hero.useItem(0));

    }

    @Test
    @DisplayName("Hero has enough experience to level up")
    void levelUpTest1(){
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals(true, Hero.levelUp());
    }

    @Test
    @DisplayName("Hero does not have enough experience to level up")
    void levelUpTest2(){
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals(false, Hero.levelUp());
    }

    @Test
    @DisplayName("Normal addToInventory")
    void addToInventoryTest1(){
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals(true, Hero.addToInventory("Potion"));
    }

    @Test
    @DisplayName("Normal showInventory")
    void showInventoryTest1(){
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals("Potion, Potion", Hero.showInventory());
    }
    @Test
    @DisplayName("Display Hero Info")
    void InfoTest1(){
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals("Hero, 100, 10, true", Hero.Info());
    }

    //Enemy Class Unit Tests
    @Test
    @DisplayName("Normal Enemy Fight")
    void enemyFightTest1(){
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 100, 30, true, 30);
        assertEquals(true, Enemy.Fight(hero));
    }
    @Test
    @DisplayName("Display Enemy Info")
    void enemyInfoTest1(){
        Enemy enemy = new Enemy("Enemy", 100, 30, true, 30);
        assertEquals("Enemy, 100, 10, 30, true", Enemy.Info());
    }

    //Boss Class Unit Test
    @Test
    @DisplayName("Normal Boss Fight")
    void bossFightTest1(){
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Boss boss = new Boss("Final Boss", 100, 10, true, 30,3);
        assertEquals(true, Boss.Fight(hero));
    }

    @Test
    @DisplayName("Display Boss Info")
    void bossInfoTest1(){
        Boss boss = new Boss("Final Boss", 100, 10, true, 30,3);
        assertEquals("Boss, 100, 10, 30, 3, true", Boss.Info());
    }

}