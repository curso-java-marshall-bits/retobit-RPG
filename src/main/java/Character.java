abstract class Character {
    // 🗒️ PROPIEDADES
    protected String name;
    protected int health;
    protected Status status;

    // 🏗️ CONSTRUCTOR
    protected Character(String name, int health){
        this.name = name;
        this.health = health;
        this.status = Status.REGULAR;
    }

}