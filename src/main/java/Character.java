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

    // Recibir daño
    @Override
    public void receiveDamage(int damage) {

        this.health -= damage;
        System.out.println("Vida actual: " + this.health);
        System.out.println("Recibíste " + damage + " puntos de daño");

        if(this.health <= 0){
            this.health = 0;
            this.status = Status.DEAD;
        }
    }

    // Verificar si el combatiente está vivo
    @Override
    public boolean isAlive() {

        return this.health > 0;

    }

    // Obtener la salud actual
    @Override
    public int getCurrentHealth() {
        return this.health;
    }

    // Obtener el nombre
    @Override
    public String getName() {
        return this.name;
    }

    // Obtener el estado (Vivo, Muerto, etc.)
    @Override
    public String getStatus() {
        return this.status.name();
    }
}