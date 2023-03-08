package RPG;

import java.util.Random;

public class Boss extends RPG.Enemy{
    Boss(int h, int ap, boolean ia){
        super("Final Boss", h, ap, ia);
        this.ultrasLeft = 3;
    }
    boolean Fight(){
        Random randI = new Random();
        int myRandInt = randI.nextInt(20);
        if (myRandInt <=10){
            RPG.Hero.health-=attackPower;
            System.out.println(name+" attacked you for "+attackPower+" damage!");
            return true;
        }
        else if(myRandInt >10){
            if(ultrasLeft > 0) {
                RPG.Hero.health -= (attackPower*3);
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
