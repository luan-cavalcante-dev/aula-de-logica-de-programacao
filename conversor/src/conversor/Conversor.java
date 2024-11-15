package conversor;

public class Conversor {
	public double converter(int metros) {
		return metros * 100;
		
	}
	
	public double converter(double celsius) {
		return (celsius *(9/5) + 32);
		
	}
	
	public double converter (double dolar, String moeda) {
		if(moeda.equalsIgnoreCase("euro")) {
		return dolar*0.92;
		
	}else {
		return dolar*1.8;
	}


}
}
