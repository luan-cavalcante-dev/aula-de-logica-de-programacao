package principal;
import modelo.Spider; 
import modelo.Cat;
import modelo.Fish;

public class Main {

	public static void main(String[] args) {
		
		 // Declarando meus metados 
		Spider spider  = new Spider();
		spider.walk();
		spider.eat();
		
		
		Cat cat = new Cat();
		cat.walk();
		cat.eat();
		cat.play();
		System.out.println("O nome gato é:" + cat.getName());
		
		Fish fish = new Fish();
		fish.Setename("Detonalta");
		fish.walk();
		fish.eat();
		fish.play();
		System.out.println("O nome do peixe é:" + fish.getName());

	}

}
