package belajar.oop;

public class FlyingWyvern {
	String nama;
	int health;
	int attack_power;
	int defense;
	float size;
	String[] special_ability;
	String[] elemental_weakness;
	String vulnerability;
	
	String getNama() {
		return nama;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getAttackPower() {
		return attack_power;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public float getSize() {
		return size;
	}
	
	public String[] getSpecialAbility() {
		return special_ability;
	}
	
	public String[] getElementalWeakness() {
		return elemental_weakness;
	}
	
	public String getVulnerability() {
		return vulnerability;
	}
	
	public void cetakStatistik() {
		System.out.println("Nama Monster: " + nama);
		System.out.println("Health: " + health);
		System.out.println("Attack Power: " + attack_power);
		System.out.println("Defense: " + defense);
		System.out.println("Size: " + size);
		System.out.println("Special Ability: " + String.join(", ", special_ability));
		System.out.println("Elemental Weakness: " + String.join(", ", elemental_weakness));
		System.out.println("Vulnerability: " + vulnerability);
	}
	
}
