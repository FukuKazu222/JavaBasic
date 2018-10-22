package practice13.common;

public class SuperHero extends practice13.common.Hero {
	private Item equipment;

	public int attack() {
		return super.attack() + this.equipment.getAdditionalDamage();
	}

	public Item getEquipment () {
		return equipment;
	}
	public void setEquipment (Item equipment) {
		this.equipment = equipment;
	}
}
