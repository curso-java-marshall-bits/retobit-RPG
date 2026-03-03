public abstract class Character implements Combatant {
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
    public void receiveDamage(int damage) {
        health -=damage;
        if (health<=0){
            health=0;
            status = Status.DEAD;
        }else{
            status = Status.REGULAR;
        }
    }

    @Override
    public boolean isAlive() {
        if (this.health>0){
            System.out.println("El personaje esta con vida aun.");
            return true;
        }else{
            System.out.println("El personaje ha muerto");
            status=Status.DEAD;
        return false;
        }
    }

    @Override
    public int getCurrentHealth() {
        System.out.println("La vida actual del personaje es "+health);
        return health;
    }

    @Override
    public String getName() {
        System.out.println("Nombre del personaje "+name);
        return name;
    }

    @Override
    public String getStatus() {


        return status.toString();
    }
}