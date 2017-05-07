package eKTP;

public class Manusia {
	protected static String nama;
	protected static char jenisKelamin;
	
	public Manusia(){
	}
	public static void setNama(String nama) {
		Manusia.nama = nama;
	}
	public static void setJenisKelamin(char jenisKelamin) {
		Manusia.jenisKelamin = jenisKelamin;
	}
	public String getNama() {
		return nama;
	}
	public char getJenisKelamin() {
		return jenisKelamin;
	}

}
