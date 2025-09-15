//Errores detectados
//Falta de implementacion de metodos de la interface
//Falta de modificador de clase (abstract)
abstract class Character implements Combatant {
    // 🗒️ PROPIEDADES
    protected String name;
    protected int health;
    protected Status status;

    // 🏗️ CONSTRUCTOR
    protected Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.status = Status.REGULAR;
    }

    @Override
    public void receiveDamage(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            this.health = 0;
            this.status = Status.DEAD;
        }
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
        /* OR
        if ( this.health > 0 ) {
            return true;
        } else {
            return false;
        }
        */
    }

    @Override
    public int getCurrentHealth() {
        return this.health;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getStatus() {
        return this.status.toString();
    }
}