import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void info() {
        Item i = new Item("Potion ", 15);
        assertEquals("Item name: Potion Healing Power: 15", i.Info());
    }
}