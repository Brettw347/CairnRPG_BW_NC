package RPG;
import java.util.Random;
public class Hero extends Character {
    Hero(float health, float attackPower, boolean isAlive) {
        super();
    }
    int level = 1;
    int experience = 0;
    double money = 0.0;
    String[] inventory = new String[5];

    new Item("Potion", 20);

    boolean Fight(Enemy){
        Random randI = new Random();
        int myRandInt = randI.nextInt(20);
        if (myRandInt <=10){
            Enemy.health-=attackPower;
            System.out.println("You attacked "+Enemy.name+" for "+attackPower+" damage!");
            return true;
        }
        else if(myRandInt >10){
            Enemy.health-=(attackPower*3);
            System.out.println("You landed a special attack on "+Enemy.name+" for "+attackPower*3+" damage!");
            return true;
        }
        else if(myRandInt >18){
            System.out.println("Your attack missed!");
            return false;
        }
        return true;
    }
    void useItem(int slot){
        if(inventory[slot] != null) {
            System.out.println("A " + Item.getItemName() + " healed " + name + " " + Item.getHealingPower());
            health += Item.getHealingPower();
        }
        else{
            System.out.println("There is nothing in that slot!");
        }
    }
    void levelUp(){
        if(experience<=100){
            level+=1;
            experience=0;
            attackPower = attackPower+(attackPower/10);
            health = health+(health/10);
            System.out.println("You leveled up to level: "+level);
            System.out.println("Your attack power is now at: "+attackPower);
            System.out.println("Your health is now at: "+health);
        }
        else{
            System.out.println("You only have "+experience+" experience and you need 100 to level up!");
        }
    }
    boolean addToInventory(String Item){
        for(int i = 0; i<=5; i++){
            if(inventory[i] == null) {
                inventory[i] = Item;
                System.out.println(Item+" was placed at slot "+i);
                return true;
            }
        }
        return false;
    }
    String showInventory(){
        String inventoryToShow = "Inventory:\n";
        for(int i = 0; i<=inventory.length;i++){
            if(inventory[i] != null){
                inventoryToShow = inventoryToShow + inventory[i]+"\n";
            }
        }
        return inventoryToShow;
    }

}
