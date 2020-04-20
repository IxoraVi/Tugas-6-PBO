class Kendaraan{
	boolean mesin;
	int kapasitas;
void jalan(){
	System.out.println("Mobil Berjalan");
	}
void berhenti(){
	System.out.println("Mobil Berhenti");
	}
}
class Mobil1 extends Kendaraan{
	public static void main(String args[]){
		Mobil1 sedan = new Mobil1();
		sedan.kapasitas = 60;
		sedan.jalan();
		System.out.println(+sedan.kapasitas+" Km");
	}
}