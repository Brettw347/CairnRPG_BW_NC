import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    // Hero Class Unit Tests
    @Test
    @DisplayName("Normal Fight")
    void FightTest1(){
        Hero[] hero = new Hero(100, 10.0, true);
        Enemy[] monster = new Enemy(100, 10, true);
        assertEqual(true, Fight(monster);
    }

    @Test
    @DisplayName("Normal useItem")
    void useItemTest1(){

    }

    @Test
    @DisplayName("Hero has enough experience to level up")
    void levelUpTest1(){
        Hero[] hero = new Hero(100, 10.0, true);
    }

    @Test
    @DisplayName("Hero does not have enough experience to level up")
    void levelUpTest2(){
        Hero[] hero = new Hero(100, 10.0, true);
    }

    @Test
    @DisplayName("Normal addToInventory")
    void addToInventoryTest1(){

    }

    @Test
    @DisplayName("Normal showInventory")
    void showInventoryTest1(){

    }
    @Test
    @DisplayName("Display Hero Info")
    void InfoTest1(){

    }

    //Enemy Class Unit Tests
    @Test
    @DisplayName("Normal Enemy Fight")
    void enemyFightTest1(){

    }
    @Test
    @DisplayName("Display Enemy Info")
    void enemyInfoTest1(){

    }

    //Boss Class Unit Test
    @Test
    @DisplayName("Normal Boss Fight")
    void bossFightTest1(){

    }

    @Test
    @DisplayName("Display Boss Info")
    void bossInfoTest1(){

    }
}