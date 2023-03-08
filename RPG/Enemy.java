import java.util.Random;

public class Enemy extends Character {
    int magicPower = 30;
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
            return true;
        } else if (myRandInt > 10) {
            h.health -= magicPower;
            System.out.println(name + " landed a magic attack on you for " + magicPower + " damage!");
            return true;
        } else if (myRandInt > 18) {
            System.out.println("Enemy attack missed!");
            return false;
        }
        return true;
    }

    static String info() {
        return "This class encompasses an enemy that the player fights. The class Enemy is a child of\n " +
                "the character class and carries out the fighting action of the enemies.\n " +
                "The enemy has a similar fighting method as the hero.\n " +
                "The enemy also acts as the parent for the Boss class.";
    }
}
