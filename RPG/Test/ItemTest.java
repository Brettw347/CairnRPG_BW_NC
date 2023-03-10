import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void info() {
        Item i = new Item("Potion ", 15);
        assertEquals("Item name: Potion Healing Power: 15", i.Info());
    }

    @Test
    void info2() {
        Item i = new Item("Apple ", 30);
        assertEquals("Item name: Apple Healing Power: 30", i.Info());
    }
}