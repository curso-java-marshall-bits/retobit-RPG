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
        this.status = Status.REGULAR;

    }

    @Override
    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) { // si es igual o menor a 0 está muerto
            this.health = 0;   // Nos aseguramos de que no sea negativo
            this.status = Status.DEAD;
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

        return this.status.toString();
    }
}
















// Solo estará obligada la clase hija a implementar los metodos
// de la clase padre si e padre no lo implementa, si solo lo declara.
/*
La regla definitiva

Una clase concreta solo está obligada a implementar los métodos abstractos que todavía no tengan implementación.

Si una clase abstracta o una clase padre ya proporcionó la implementación, la obligación desaparece y la clase hija decide si la reutiliza o la sobrescribe.

Creo que aquí encontraste uno de los puntos donde más se confunden los estudiantes. El problema no es "clase abstracta vs interfaz", sino entender que la obligación está ligada al método abstracto, no a la clase abstracta.

Es decir:

Clase abstracta → puede contener métodos normales y métodos abstractos.
Metodo abstracto → obliga a que alguna clase concreta de la jerarquía lo implemente. Esa obligación se mantiene hasta que alguien proporcione una implementación. Una vez implementado, las clases hijas ya pueden heredarlo normalmente.
 */