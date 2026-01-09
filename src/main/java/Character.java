class Character implements Combatant {
    // 🗒️ PROPIEDADES
    protected String name;
    protected int health;
    Status status = Status.REGULAR;
    // le falta el status

    // 🏗️ CONSTRUCTOR
    protected Character(String name, int health) {
        this.name = name;
        this.health = health;

        // el status inicial debe ser siempre REGULAR
    }

    @Override
    public void receiveDamage(int damage) {
        System.out.println("recibiendo Daño = " + damage);
    }

    @Override
    public boolean isAlive() {
        return false;
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


