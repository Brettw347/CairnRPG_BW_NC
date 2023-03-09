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

    static String info() {
        return "Character Name: " + Character.name + "\n" + "Health: " +
                health + "\n" + "Attack Power: " + attackPower + "\n" + "Alive: " + isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public double getAttackPower() {
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

