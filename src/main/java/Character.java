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
        this.health -= damage;

        if (!this.isAlive()) {
            this.status = Status.DEAD;
            this.health = 0;
        }
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
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
        return this.status.name();
    }
}