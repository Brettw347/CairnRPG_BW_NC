import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    //Normal fight method
    @Test
    void fightTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 100, 10,true,30);
        assertEquals(true, hero.Fight(enemy));
    }
    //fight method with enemy taking damage that would defeat them
    @Test
    void fightTest2() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 10, 10,true,30);
        assertEquals(true, hero.Fight(enemy));
    }

    //Normal useItem method
    @Test
    void useItemTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Enemy enemy = new Enemy("Enemy", 100, 10,true,30);
        assertEquals(true, hero.useItem(0));
    }

    //useItem with no items in inventory
    @Test
    void useItemTest2() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{null});
        Enemy enemy = new Enemy("Enemy", 100, 10,true,30);
        assertEquals(false, hero.useItem(0));
    }

    //Normal levelUp method
    @Test
    void levelUpTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 100,0.0, new String[]{"Potion"});
        assertEquals(true, hero.levelUp());
    }

    //levelUp with not enough experience to level up
    @Test
    void levelUpTest2() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals(false, hero.levelUp());
    }

    //levelUp with higher level, health, and attack power
    @Test
    void levelUpTest3() {
        Hero hero = new Hero("Hero", 110, 11, true, 2, 100,0.0, new String[]{"Potion"});
        assertEquals(true, hero.levelUp());
    }

    //addToInventory with 1 item in the inventory
    @Test
    void addToInventoryTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion", null});
        assertEquals(true, hero.addToInventory("Potion"));
    }

    //addToInventory with full inventory
    @Test
    void addToInventoryTest2() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion", "Potion", "Potion", "Potion", "Potion", "Potion"});
        assertEquals(false, hero.addToInventory("Potion"));
    }

    //Normal addToInventory, adding to an empty inventory
    @Test
    void addToInventoryTest3() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{null});
        assertEquals(true, hero.addToInventory("Potion"));
    }

    //Not Working
    @Test
    void showInventoryTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals("Inventory:\n" + "Potion" + "\n", hero.showInventory());
    }

    @Test
    void infoTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        assertEquals(true, hero.info());
    }
}