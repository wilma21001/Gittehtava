
public class Gitti {

	public static void main(String[] args) {
		
		Auto auto = new Auto ("BMW", "Coupe", 5);
		


	}

}

class Auto {
	
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	
	public void jarruta() {
		
		System.out.println("Auto jarruttaa");
	}
	
	public void kiihdyta() {
		
		System.out.println("Auto kiihtyy " + bensanMaara-1);
		
	}
	
	public void naytaTiedot() {
		
		System.out.println("Merkki: " + merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan määrä: " + bensanMaara);
		
	}
	
}