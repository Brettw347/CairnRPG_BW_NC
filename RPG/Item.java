package RPG;

public class Item {
    String itemName = "";
    int healingPower = 0;

    Item(String i, int h){
        this.itemName = i;
        this.healingPower = h;
    }
    String Info(){
        return "Item name: " + itemName + "Healing Power: " + healingPower;
    }

}

