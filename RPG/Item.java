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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }
}

