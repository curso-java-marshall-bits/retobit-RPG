abstract class Character implements Combatant {
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
        status = Status.REGULAR;
    }

    @Override
    public void receiveDamage(int damage) {
        if(health > 0) {
            this.health -= damage;
        }
        if (this.health <= 0) {
            this.status = Status.DEAD;
        }
        if (health < 0) {
            this.health = 0;
        }
    }

    @Override
    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        }
        return false;
    }

    @Override
    public int getCurrentHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getStatus() {
        return status.toString();
    }
}