import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    @DisplayName("Normal fight method")
    void fightTest1() {
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Boss boss = new Boss("Boss", 100, 10,true,30, 3);
        assertEquals(true, boss.Fight(hero));
    }

    @Test
    @DisplayName("fight method where Boss deals damage that would defeat Hero")
    void fightTest2(){
        Hero hero = new Hero("Hero", 100, 10, true, 1, 0,0.0, new String[]{"Potion"});
        Boss boss = new Boss("Boss", 10, 10,true,30, 3);
        assertEquals(true, boss.Fight(hero));
    }

    @Test
    @DisplayName("Normal info method")
    void TestInfo1() {

    }
}