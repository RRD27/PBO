package Titik;




public class Titik {
	int absis;
	int ordinat;
	
	
	static double counterTitik;
	
	Titik () {
		absis = 0;
		 ordinat = 0;
		counterTitik++;
		
	}
	
	void setAbsis(int abs){
		absis = abs;
	}
	
	void setOrdinat(int ord) {
		ordinat = ord;
	}
	
	double getOrdinat() {
		return ordinat;
	}
	
	double getAbsis () {
		return absis;
	}
	
	double getCounterTitik() {
		return counterTitik;
	}
	
	Titik (int newAbsis, int newOrdinat) {
		absis = newAbsis;
		ordinat = newOrdinat;
		counterTitik++;
	}
	
	
	public static void main(String[]args ) {
		Titik t1, t2;
		Titik t3;
		
		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik(5,6);
		t1.setAbsis(5);
		t1.setOrdinat(6);
		t2.setAbsis(4);
		t2.setOrdinat(7);
	
		System.out.println("Jumlah objek Titik = " + t1.getCounterTitik());
		System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
		System.out.println("t3(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
		
		
		
	}
	
}

