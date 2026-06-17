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
		// TODO Auto-generated method stub
		if(this.health - damage > 0)
			this.health -= damage;
		else
		{
			this.health = 0;
			this.status = Status.DEAD;
		}
	}
	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		
		return this.health > 0;
	}
	@Override
	public int getCurrentHealth() {
		// TODO Auto-generated method stub
		return this.health;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return this.status.name();
	}

}