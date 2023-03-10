import java.util.Random;

public class Enemy extends Character {
    static int magicPower = 30;
    Enemy(String name, double health, double attackPower, boolean isAlive, int mp) {
        super(name, health, attackPower, isAlive);
        this.magicPower = mp;
    }

    boolean Fight(Hero h) {
        Random randI = new Random();
        int myRandInt = randI.nextInt(20);
        if (myRandInt <= 10) {
            h.health -= attackPower;
            System.out.println(name + " attacked you for " + attackPower + " damage!");
            if (h.health <= 0){
                h.isAlive = false;
            }
            return true;
        } else if (myRandInt > 10) {
            h.health -= magicPower;
            System.out.println(name + " landed a magic attack on you for " + magicPower + " damage!");
            if (h.health <= 0){
                h.isAlive = false;
            }
            return true;
        } else if (myRandInt > 18) {
            System.out.println("Enemy attack missed!");
            return false;
        }
        return true;
    }

    static String info() {
        return "Name: "+name+"\n"+"Health: "+health+"\n"+"Attack Power: "+attackPower+"\n"+"Alive: "+isAlive+"\n"+"Magic Power: "+magicPower+"\n";
    }
}
