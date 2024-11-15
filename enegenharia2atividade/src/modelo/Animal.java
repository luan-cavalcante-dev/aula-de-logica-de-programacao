package modelo;

public abstract class Animal {
	
	protected int legs;
	
	public Animal(int legs) {
		this.legs = legs;
		
	}

	public void walk() {
		
		System.out.println("Este animal caminha sobre" + legs + "patas");
		
	}
	public abstract void eat();
	
}
