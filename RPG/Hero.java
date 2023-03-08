import java.util.Random;

public class Hero extends Character {
    static int level = 1;
    static int experience = 0;
    static double money = 0.0;
    static String[] inventory = new String[5];


    public Hero(String n, double h, double ap, boolean ia, int l, int e, double m, String[] inv) {
        super(name, health, attackPower, isAlive);
        name = "David the Hero";
    }

    Item potion = new Item("Potion", 20);

    boolean Fight(Enemy e) {
        Random randI = new Random();
        int myRandInt = randI.nextInt(20);
        if (myRandInt <= 10) {
            e.health -= attackPower;
            System.out.println("You attacked " + e.name + " for " + attackPower + " damage!");
            return true;
        } else if (myRandInt > 10) {
            e.health -= (attackPower * 3);
            System.out.println("You landed a special attack on " + e.name + " for " + attackPower * 3 + " damage!");
            return true;
        } else if (myRandInt > 18) {
            System.out.println("Your attack missed!");
            return false;
        }
        return true;
    }

    boolean useItem(int slot) {
        if (inventory[slot] != null) {
            System.out.println("A " + Item.getItemName() + " healed " + name + " " + Item.getHealingPower());
            health += Item.getHealingPower();
            return true;
        } else {
            System.out.println("There is nothing in that slot!");
            return false;
        }
    }

    boolean levelUp() {
        if (experience <= 100) {
            level += 1;
            experience = 0;
            attackPower = attackPower + (attackPower / 10);
            health = health + (health / 10);
            System.out.println("You leveled up to level: " + level);
            System.out.println("Your attack power is now at: " + attackPower);
            System.out.println("Your health is now at: " + health);
            return true;
        } else {
            System.out.println("You only have " + experience + " experience and you need 100 to level up!");
            return false;
        }
    }

    boolean addToInventory(String Item) {
        for (int i = 0; i <= 5; i++) {
            if (inventory[i] == null) {
                inventory[i] = Item;
                System.out.println(Item + " was placed at slot " + i);
                return true;
            }
        }
        return false;
    }

    String showInventory() {
        String inventoryToShow = "Inventory:\n";
        for (int i = 0; i <= inventory.length; i++) {
            if (inventory[i] != null) {
                inventoryToShow = inventoryToShow + inventory[i] + "\n";
            }
        }
        return inventoryToShow;
    }

    String info() {
        return "This class encompasses the player's character. The class Hero is a child of\n " +
                "the character class and carries out all the actions of the player.\n " +
                "These actions range from fighting, to using potions, and so on.\n ";
    }

}
