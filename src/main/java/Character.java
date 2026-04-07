abstract class Character implements Combatant {
    // 🗒️ PROPIEDADES
    protected String name;
    protected int health;
    protected Status status;

    //MÉTODOS
        @Override
        public String getName() {
            return name;
        }
        @Override
        public int getCurrentHealth() {
            return health;
        }
        @Override
         public boolean isAlive() {
            return health > 0;
        }
        @Override
        public String getStatus() {
            return status.toString();
        }
        @Override
        public void receiveDamage(int damage) {
            health -= damage;
            if (health <= 0) {
                health = 0;
                status = Status.DEAD;
            }
        }
    // 🏗️ CONSTRUCTOR
    protected Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.status = Status.REGULAR;
    }
}