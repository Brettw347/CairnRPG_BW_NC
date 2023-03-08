import java.util.Random;
public class Character {
    static String name = "Character";
    static double health = 100;
    static double attackPower = 10;
    static boolean isAlive = true;

    Character(String n, double h, double ap, boolean ia) {
        this.name = n;
        this.health = h;
        this.attackPower = ap;
        this.isAlive = ia;
    }

    boolean runAway() {
        Random randI = new Random();
        int myRandInt = randI.nextInt(100);
        if (myRandInt >= 75) {
            return true;
        } else
            return false;
    }

    String Info() {
        return "Character Name: " + name + "Health: " + health + "Attack Power: " + attackPower + "Alive?: " + isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(float attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}

    public class Hero extends Character {
        int level = 1;
        int experience = 0;
        double money = 0.0;
        String[] inventory = new String[5];
        public Hero(String n, double h, double ap, boolean ia, int l, int e, double m, String[] inv) {
            super(name, health, attackPower, isAlive);
            name = "David the Hero";
    }

        Item potion = new Item("Potion", 20);

        boolean Fight(Enemy){
            Random randI = new Random();
            int myRandInt = randI.nextInt(20);
            if (myRandInt <=10){
                Enemy.health-=attackPower;
                System.out.println("You attacked "+ Enemy.name+" for "+attackPower+" damage!");
                return true;
            }
            else if(myRandInt >10){
                Enemy.health-=(attackPower*3);
                System.out.println("You landed a special attack on "+ Enemy.name+" for "+attackPower*3+" damage!");
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

        String info(){
            return "This class encompasses the player's character. The class Hero is a child of\n " +
                    "the character class and carries out all the actions of the player.\n " +
                    "These actions range from fighting, to using potions, and so on.\n ";
        }

    }

public class Boss extends Enemy {
    int ultrasLeft = 3;
    Boss(String n, double h, double ap, boolean ia, int mp, int ul){
        super(name, health, attackPower, isAlive, magicPower);
        name = "Final Boss";
        }
        boolean Fight(Hero){
            Random randI = new Random();
            int myRandInt = randI.nextInt(20);
            if (myRandInt <=10){
                Hero.health-=attackPower;
                System.out.println(name+" attacked you for "+attackPower+" damage!");
                return true;
            }
            else if(myRandInt >10){
                if(ultrasLeft > 0) {
                    Hero.health -= (attackPower*3);
                    System.out.println(name + " landed a magic attack on you for " + magicPower + " damage!");
                    return true;
                }
                else{
                    System.out.println("Enemy attack missed!");
                    return false;
                }
            }
            else if(myRandInt >18){
                System.out.println("Enemy attack missed!");
                return false;
            }
            return true;
        }

        String info(){
            return "This class encompasses the Boss character. The Boss class is a child of\n " +
                    "the Enemy class and carries out all the fighting actions of the Boss.\n " +
                    "The fight method acts similarly to that of the Enemy and Hero.\n ";
        }
    }