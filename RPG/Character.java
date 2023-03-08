import java.util.Random;
public class Character {
    String name = "Character";
    float health = 100;
    float attackPower = 10;
    boolean isAlive = true;

    Character(String n, float h, float a, boolean i){
        this.name = n;
        this.health = h;
        this.attackPower = a;
        this.isAlive = i;
    }

    boolean runAway(){
        Random randI = new Random();
        int myRandInt = randI.nextInt(100);
        if(myRandInt >= 75){
            return true;
        }else
            return false;
    }
    String Info(){
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
