abstract class Character implements Combatant {
    // 🗒️ PROPIEDADES
    protected String name;
    protected int health;
    protected Status status;
    // le falta el status

    // 🏗️ CONSTRUCTOR
    protected Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.status = Status.REGULAR;
        // el status inicial debe ser siempre REGULAR
    }
    @Override
    public boolean isAlive(){
        return this.health > 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getStatus() {
        if(this.health>0) {
            return this.status.name();
        } else {
            this.status = Status.DEAD;
        }
        return this.status.name();
    }

    @Override
    public void receiveDamage(int damage) {
        if(!this.isAlive()){
            System.out.println("No puedes recibir daño si estas muerto.");
            return;
        } else if (health < damage){
            this.health = 0;
            return;
        }
        health-=damage;
    }

    @Override
    public int getCurrentHealth() {
        return this.health;
    }
}