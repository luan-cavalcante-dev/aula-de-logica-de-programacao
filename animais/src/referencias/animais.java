package referencias;

public class animais {

		protected int legs;
		
		public animais(int legs) {
			super();
			this.legs = legs;
			
		}
		public void walk() {
			System.out.println("Este animal caminha sobre" + legs + "patas");
			
		}
		public abstract void eat();
}
