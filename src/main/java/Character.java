class Character implements Combatant {
    // 🗒️ PROPIEDADES
    protected String name;
    protected int health;
    // le falta el status

    // 🏗️ CONSTRUCTOR
    protected Character(String name, int health) {
        this.name = name;
        this.health = health;
        // el status inicial debe ser siempre REGULAR
    }

}