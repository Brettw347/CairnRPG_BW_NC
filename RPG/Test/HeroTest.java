import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    @DisplayName("Normal Fight Method")
    void fightTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 100, 10,true,30);
        assertEquals(true, hero.Fight(enemy));
    }

    @Test
    @DisplayName("fight method with enemy taking damage that would defeat it")
    void fightTest2() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 10, 10,true,30);
        assertEquals(true, hero.Fight(enemy));
    }

    @Test
    @DisplayName("Normal useItem method")
    void useItemTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 100, 10,true,30);
        assertEquals(true, hero.useItem(0));
    }

    @Test
    @DisplayName("useItem with no items in inventory")
    void useItemTest2() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{null});
        Enemy enemy = new Enemy("Enemy", 100, 10,true,30);
        assertEquals(false, hero.useItem(0));
    }

    @Test
    @DisplayName("Normal levelUp method")
    void levelUpTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 100,0.0, new String[]{"Potion"});
        assertEquals(true, hero.levelUp());
    }

    @Test
    @DisplayName("levelUp with not enouogh experience to level up")
    void levelUpTest2() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals(false, hero.levelUp());
    }

    @Test
    @DisplayName("levelUp with higher leve, health, and attack power values")
    void levelUpTest3() {
        Hero hero = new Hero("Hero", 110, 11, true, 2, 100,0.0, new String[]{"Potion"});
        assertEquals(true, hero.levelUp());
    }

    @Test
    @DisplayName("addToInventory with 1 item in the inventory")
    void addToInventoryTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion", null});
        assertEquals(true, hero.addToInventory("Potion"));
    }

    @Test
    @DisplayName("addToInvetory with full inventory")
    void addToInventoryTest2() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion", "Potion", "Potion", "Potion", "Potion", "Potion"});
        assertEquals(false, hero.addToInventory("Potion"));
    }

    @Test
    @DisplayName("Normal addToInventory method; adding to an empty inventory")
    void addToInventoryTest3() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{null});
        assertEquals(true, hero.addToInventory("Potion"));
    }

    @Test
    @DisplayName("Normal showInventory method; Not Working")
    void showInventoryTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals("Inventory:\n" + "Potion" + "\n", hero.showInventory());
    }

    @Test
    @DisplayName("Normal info method")
    void infoTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals(true, hero.info());
    }
}