
public class Mammals {
	
	public Mammals(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}

	public int energyLevel = 100;
	
	public void displayEnergy() {
		System.out.println(energyLevel);
	}
	
	public void removeEnergy(int energyCost) {
		energyLevel -= energyCost;
	}
	
	public void addEnergy(int energyCost) {
		energyLevel += energyCost;
	}
}
