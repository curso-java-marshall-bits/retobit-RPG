public class Warrior extends Character{
    private int defense;
    public Warrior(String name,int health,int defense){
        super( name, health);
        this.defense = defense;
    }
}