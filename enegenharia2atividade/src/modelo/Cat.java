package modelo;

import controle.Pet;

public class Cat extends Animal implements Pet {
	public String Cat;
	private String name;

	public Cat() {
		super(4);
	
	}

	public String getCat() {
		return Cat;
	}

	public void setCat(String cat) {
		Cat = cat;
	}

	@Override
	public void eat() {
		System.out.println("Gatos comem ração");
		
		
		
	}
	
	public void play() {
		System.out.println("Gatos gostam de correr");
	}
	
	public String getName() {
		System.out.println("Felicio");
		return name;
	}

	@Override
	public void Setename(String name) {
		this.name = name;
		// TODO Auto-generated method stub
		
	}
	
}



