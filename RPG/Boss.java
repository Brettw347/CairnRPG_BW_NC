import java.util.Random;

public class Boss extends Enemy {
    int ultrasLeft = 3;


    Boss(String name, double health, double attackPower, boolean isAlive, int magicPower, int ul) {
        super(name, health, attackPower, isAlive, magicPower);
        this.ultrasLeft = ul;
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
            if (ultrasLeft > 0) {
                h.health -= (attackPower * 3);
                System.out.println(name + " landed a magic attack on you for " + magicPower + " damage!");
                if (h.health <= 0){
                    h.isAlive = false;
                }
                return true;
            } else {
                System.out.println("Enemy attack missed!");
                return false;
            }
        } else if (myRandInt > 18) {
            System.out.println("Enemy attack missed!");
            return false;
        }
        return true;
    }

    static String info() {
        return "This class encompasses the Boss character. The Boss class is a child of\n " +
                "the Enemy class and carries out all the fighting actions of the Boss.\n " +
                "The fight method acts similarly to that of the Enemy and Hero.\n ";
    }
}
