import java.util.Random;

public class Enemy extends RPG.Character {
    Enemy(int h, int ap, boolean ia) {
        super("Main enemy", h, ap, ia);
        String name = "Goblin";
    }
    int magicPower = 30;

    Enemy(String n, int h, int ap, boolean ia){
        super(n, h, ap, ia);
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

    String info(){
        return "This class encompasses an enemy that the player fights. The class Enemy is a child of\n " +
                "the character class and carries out the fighting action of the enemies.\n " +
                "The enemy has a similar fighting method as the hero.\n " +
                "The enemy also acts as the parent for the Boss class.";
    }

}
