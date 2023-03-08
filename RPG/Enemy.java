import java.util.Random;

public class Enemy extends RPG.Character {
    Enemy(float health, float attackPower, boolean isAlive) {
        super(health, attackPower, isAlive);
        String name = "Goblin";
    }
    int magicPower = 30;

    Enemy(String n, int h, int ap, boolean ia){
        super(n, h, ap, ia);
    }
    boolean Fight(Enemy){
        Random randI = new Random();
        int myRandInt = randI.nextInt(20);
        if (myRandInt <=10){
            RPG.Hero.health-=attackPower;
            System.out.println(name+" attacked you for "+attackPower+" damage!");
            return true;
        }
        else if(myRandInt >10){
            RPG.Hero.health-=magicPower;
            System.out.println(name+" landed a magic attack on you for "+magicPower+" damage!");
            return true;
        }
        else if(myRandInt >18){
            System.out.println("Enemy attack missed!");
            return false;
        }
        return true;
    }

}
