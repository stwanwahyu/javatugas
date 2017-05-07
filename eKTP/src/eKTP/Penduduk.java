package eKTP;

public class Penduduk extends Manusia {
	private String ttl;
	private String Alamat;
	private char Agama;
	private char rtrw;
	private char kel;
	private char kec;
	private char Kewarganegaraan;
	private char Status;
	private char Pekerjaan;
	
	
	public Penduduk() {
		super();
	}
	
	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	public void setAlamat(String alamat) {
		Alamat = alamat;
	}

	public void setAgama(char agama) {
		Agama = agama;
	}

	public void setKewarganegaraan(char kewarganegaraan) {
		Kewarganegaraan = kewarganegaraan;
	}

	public void setStatus(char status) {
		Status = status;
	}

	public void setPekerjaan(char pekerjaan) {
		Pekerjaan = pekerjaan;
	}

	public char getRtrw() {
		return rtrw;
	}

	public void setRtrw(char rtrw) {
		this.rtrw = rtrw;
	}

	public char getKel() {
		return kel;
	}

	public void setKel(char kel) {
		this.kel = kel;
	}

	public char getKec() {
		return kec;
	}

	public void setKec(char kec) {
		this.kec = kec;
	}

	public String getTtl() {
		return ttl;
	}
	public String getAlamat() {
		return Alamat;
	}
	public char getAgama() {
		return Agama;
	}
	public char getKewarganegaraan() {
		return Kewarganegaraan;
	}
	public char getStatus() {
		return Status;
	}
	public char getPekerjaan() {
		return Pekerjaan;
	}
	
	void getData(){
		
	}

}
