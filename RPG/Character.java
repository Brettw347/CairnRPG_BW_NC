package RPG;

import java.util.Random;
public class Character {
    String name = "Character";
    float health = 100;
    float attackPower = 10;
    boolean isAlive = true;

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
}
