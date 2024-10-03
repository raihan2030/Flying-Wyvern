package belajar.oop;

public class Main {

	public static void main(String[] args) {
		
		FlyingWyvern wyvern1 = new FlyingWyvern();
		wyvern1.nama = "Rathalos";
		wyvern1.health = 5000;
		wyvern1.attack_power = 220;
		wyvern1.defense = 160;
		wyvern1.size = 1207.68f;
		
		String[] specialAbility = {"Fireball", "Poisonous Tail"};
		wyvern1.special_ability = specialAbility;
		
		String[] elemWeakness = {"Ice", "Water"};
		wyvern1.elemental_weakness = elemWeakness;
		
		wyvern1.vulnerability = "Paralysis";
		
		System.out.println("Saya akan melawan Flying Wyvern yang bernama " + wyvern1.getNama() + " dengan ukuran " + wyvern1.getSize() + ".");
		System.out.println("Kabarnya dia memiliki " + wyvern1.getHealth() + " health, " + wyvern1.getAttackPower() + " attack power, dan " + wyvern1.getDefense() + " defense.");
		System.out.println();
		
		wyvern1.cetakStatistik();
	}

}
