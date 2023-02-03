
public class Gorilla extends Mammals {

	public Gorilla() {
		super(100);
	}
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}

	public void thowSomthing() {
		this.removeEnergy(5);
		System.out.println("Energy level minus 5 Gorilla thew an object");
	}
	
	public void eatBannanas() {
		this.addEnergy(10);
		System.out.println("Energy level plus 10 Gorilla ate a tasty Bannana");
	}
	
	public void climb() {
		this.removeEnergy(10);
		System.out.println("Energy level minus 10 Gorilla climbed a tree");
	}
	
}
