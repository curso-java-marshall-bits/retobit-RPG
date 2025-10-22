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
        // el status inicial debe ser siempre REGULAR
    }

    @Override
    public void receiveDamage(int damage) {
        if (health-damage > 0){
            health -= damage;
        } else {
            health = 0;
            status = Status.DEAD;
        }

    }

    @Override
    public boolean isAlive() {
        return health > 0;
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
        return status.name();
    }
}