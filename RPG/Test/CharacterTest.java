import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    // Hero Class Unit Tests
    @Test
    @DisplayName("Normal Fight")
    void FightTest1(){
        Hero hero = new Character("Hero", 100, 10, true).new Hero(1, 0, 0);
        Enemy enemy = new Character ("Enemy", 100,10, true).new Enemy(30);
        assertEqual(true, hero.Fight(enemy));
    }

    @Test
    @DisplayName("Normal useItem")
    void useItemTest1(){
        Hero hero = new Character("Hero", 100, 10, true).new Hero(1, 0, 0, new String[]{"Potion"});
        Enemy enemy = new Character ("Enemy", 100,10, true).new Enemy(30);
        assertEquals(0, useItem(0));

    }

    @Test
    @DisplayName("Hero has enough experience to level up")
    void levelUpTest1(){
        Hero hero = new Character("Hero", 100, 10, true).new Hero(1, 100, 0);
        assertEqual(true, levelUp());
    }

    @Test
    @DisplayName("Hero does not have enough experience to level up")
    void levelUpTest2(){
        Hero hero = new Character("Hero", 100, 10, true).new Hero(1, 0, 0);
        assertEquals(false, levelUp());
    }

    @Test
    @DisplayName("Normal addToInventory")
    void addToInventoryTest1(){
        Hero hero = new Character("Hero", 100, 10, true).new Hero(1, 0, 0);
        assertEquals(true, addToInventory(0));
    }

    @Test
    @DisplayName("Normal showInventory")
    void showInventoryTest1(){
        Hero hero = new Character("Hero", 100, 10, true).new Hero(1, 0, 0,new String[]{"Potion", "Potion"});
        assertEquals("Potion, Potion", showInventory());
    }
    @Test
    @DisplayName("Display Hero Info")
    void InfoTest1(){
        Hero hero = new Character("Hero", 100, 10, true).new Hero(1, 0, 0);
        assertEquals("Hero, 100, 10, true", hero.Info());
    }

    //Enemy Class Unit Tests
    @Test
    @DisplayName("Normal Enemy Fight")
    void enemyFightTest1(){
        Hero hero = new Character("Hero", 100, 10, true).new Hero(1, 0, 0);
        Enemy enemy = new Character ("Enemy", 100,10, true).new Enemy(30);
        assertEquals(true, enemy.Fight(hero));
    }
    @Test
    @DisplayName("Display Enemy Info")
    void enemyInfoTest1(){
        Enemy enemy = new Character ("Enemy", 100,10, true).new Enemy(30);
        assertEquals("Enemy, 100, 10, 30, true", enemy.Info());
    }

    //Boss Class Unit Test
    @Test
    @DisplayName("Normal Boss Fight")
    void bossFightTest1(){
        Hero hero = new Character("Hero", 100, 10, true).new Hero(1, 0, 0);
        Boss boss = new Character ("Boss", 100,10, true).new Enemy(30).new Boss(3);
        assertEquals(true, boss.Fight(hero));
    }

    @Test
    @DisplayName("Display Boss Info")
    void bossInfoTest1(){
        Boss boss = new Character ("Boss", 100,10, true).new Enemy(30).new Boss(3);
        assertEquals("Boss, 100, 10, 30, 3, true", boss.Info());
    }
}