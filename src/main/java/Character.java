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
		if(this.health <= 0) {
			this.health = 0;
			this.status  = Status.DEAD;
		}
	}

	@Override
	public boolean isAlive() {
		if(this.health>0) {
			return true;
		}else {
			return false;
		}
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
		return this.status.toString();
	}
    
}