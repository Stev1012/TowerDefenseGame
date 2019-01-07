
public class Tower {

	private int hp;
	private int damage;
	private int attackSpeed;
	private int rangeX; 
	private int rangeY;
	private Tower targetEnemy;
	private int towerPositionR;
	private int towerPositionC;
	private boolean isDown;
	
	/**
	 * @param hp
	 * @param damage
	 * @param attackSpeed
	 * @param rangeX
	 * @param rangeY
	 * @param targetTower
	 * @param enemyPositionR
	 * @param enemyPositionC
	 * @param isDead
	 */
	public Tower(int hp, int damage, int attackSpeed, int rangeX, int rangeY, Tower targetEnemy, int towerPositionR,
			int towerPositionC) {
		this.hp = hp;
		this.damage = damage;
		this.attackSpeed = attackSpeed;
		this.rangeX = rangeX;
		this.rangeY = rangeY;
		this.targetEnemy = targetEnemy;
		this.towerPositionR = towerPositionR;
		this.towerPositionC = towerPositionC;
		this.isDown = false; 
	}

	
	public int getHp() {
		return hp;
	}

	public int getDamage() {
		return damage;
	}

	public int getAttackSpeed() {
		return attackSpeed;
	}

	public int getRangeX() {
		return rangeX;
	}

	public int getRangeY() {
		return rangeY;
	}

	public Tower getTargetEnemy() {
		return targetEnemy;
	}

	public int getTowerPositionR() {
		return towerPositionR;
	}

	public int getTowerPositionC() {
		return towerPositionC;
	}

	public boolean isDown() {
		return isDown;
	}
	
	
	
}
