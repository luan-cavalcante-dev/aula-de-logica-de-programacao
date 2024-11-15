package modelo;

import controle.Pet;

public class Fish extends Animal implements Pet {
	private static final String Name = getName();
	public String Fish;
	private String Name1;
	private String name;

	public Fish() {
		super(0);
	
	}

	public String getFish() {
		return Fish;
	}

	public void setFish(String fish) {
		Fish = fish;
	}

	@Override
	public void eat() {
		System.out.println("Peixes comem plantas");
		
		
		
	}
	
	public void play() {
		System.out.println("O peixe nada");
	}
	
	public String getName() {
		System.out.println("Detonalta");
		return Name;
	}

	@Override
	public void Setename(String name) {
		this.name = Name;
		// TODO Auto-generated method stub
		
	}
	public void walk () {
		System.out.println("O peixe nada!");
	}
	
	
}
