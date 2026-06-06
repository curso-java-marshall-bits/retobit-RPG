abstract class  Character implements Combatant {
    // 🗒️ PROPIEDADES
    protected String name;
    protected int health;
    // le falta el status
    protected Status status;

    // 🏗️ CONSTRUCTOR
    protected Character(String name, int health) {
        this.name = name;
        this.health = health;
        // el status inicial debe ser siempre REGULAR
        this.status = Status.REGULAR;
    }

    //propiedades
    @Override
    public void receiveDamage(int damage){
     this.health -= damage;
     if(this.health <= 0){
         this.health = 0;
         this.status = Status.DEAD;
        }
    }

    @Override
    public boolean isAlive(){
        return this.health > 0;
    }

    @Override
    public int getCurrentHealth(){
        return this.health;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String getStatus(){
        return this.status.name();
    }
    /*
    public void receiveDamage(int damage){
        if(damage <= this.health){
            this.health -= damage;

        }

        if(damage > this.health){
            this.health = 0;
        }
        if(this.health == 0){
            status = Status.DEAD;
        }


    }

    public boolean isAlive(){
       if(this.health <= 0){

           return false;
       }

       else{
           return true;
        }
    }

    public int getCurrentHealth(){
        return this.health;
    }

    public String getName(){
       return this.name;
    }

    public String getStatus(){
        if(this.health == 0){
            //status = Status.DEAD;
            return status.DEAD.name();
        }

        return status.name();
    }

    */

}

/*
class Warrior extends Character{
    private int defense;

    public Warrior(String name,int health,int defense){
        super(name,health);
        this.defense = defense;

    }
}

*/

/*
class Mage extends Character{
    private int mana;


    public Mage(String name,int health,int mana){
        super(name,health);
        this.mana = mana;
    }
}


 */