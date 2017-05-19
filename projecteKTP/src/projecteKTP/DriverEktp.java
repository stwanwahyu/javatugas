package ektp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class DriverEktp {

	static String nik;
	static String nama;
	static String ttl;
	static String jenisKelamin;
	static String alamat;
	static String rt,rw;
	static String desa;
	static String kec;
	static String agama;
	static String status;
	static String kerja;
	static String warga;
	static String berlaku;
	
	static boolean running;
	static String ktp[] =  new String[200];
	static int pilih, jumlah;
	static String read,pilihan;

	public static void main(String[] args) throws IOException {
		ArrayList<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> hash = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
	//	Penduduk ektps[] = new Penduduk[200];
		
//		for(int x = 0; x<=100; x++){
	//		ektps[x] = new Penduduk();
		//}
	//	ektps[0] = new Penduduk();
		running = true;
			
	while (running){
		System.out.println("\nMenu :");
		System.out.println("1. Iputan Data eKTP ");
		System.out.println("2. List Data eKTP ");
		System.out.println("3. Sorting Data eKTP ");
		System.out.println("4. exit ");
		System.out.println("Pilih :");
		try{
			pilih = input.nextInt();	
		}
		catch(java.util.InputMismatchException a){
			System.out.println("Maaf inputan tidak valid " +a);
			break;
		}
		switch(pilih){
		case 1:
			System.out.println("===Iputkan Data eKTP===");
			System.out.println("Jumlah Inputan Data eKTP :");
			try{
				jumlah = input.nextInt();
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Maaf inputan tidak valid " +e);
				break;
			}	
			try{
				for (int i = 0; i < jumlah;i++){
					System.out.println("Data ke-"+(i+1));
					System.out.println("NIK :");
					nik = input.next();
					hash.put(nik, nik);
					
					System.out.println("Nama :");
					nama = input.next();				
					hash.put(nama,nama);
					
					System.out.println("Tempat/Tgl Lahir :");
					ttl = input.next();
					hash.put(ttl, ttl);
					
					System.out.println("Jenis Kelamin :");
					jenisKelamin = input.next();
					hash.put(jenisKelamin, jenisKelamin);
					
					System.out.println("Alamat :"); 
					alamat = input.next();
					hash.put(alamat, alamat);
					
					System.out.println("RT:");
					rt = input.next();
					hash.put(rt, rt);
					
					System.out.println("RW:");
					rw = input.next();
					hash.put(rw, rw);
					
					System.out.println("Desa :");
					desa = input.next();
					hash.put(desa, desa);
					
					System.out.println("Kecamatan :");
					kec = input.next();
					hash.put(kec, kec);
					
					System.out.println("Agama :");
					agama = input.next();
					hash.put(agama, agama);
					
					System.out.println("Status Perkawinan :");
					status = input.next();
					hash.put(status, status);
					
					System.out.println("Pekerjaan :");
					kerja = input.next();
					hash.put(kerja, kerja);
					
					System.out.println("Kewarganegaraan :");
					warga = input.next();
					hash.put(warga, warga);
					
					System.out.println("Masa Berlaku :");
					berlaku = input.next();
					hash.put(berlaku, berlaku);
					
					data.add(hash);
					
					ktp[i] = (i+1) + 
							"\n NIK			 =" +data.get(i).get(nik) +
							"\n Nama			 =" +data.get(i).get(nama)  +
							"\n Tempat/Tgl Lahir	 =" +data.get(i).get(ttl)+
							"\n Alamat			 =" +data.get(i).get(alamat)+
							"\n RT/RW			 =" +data.get(i).get(rt)+"/"+data.get(i).get(rw)+
							"\n Desa			 =" +data.get(i).get(desa)+
							"\n Kecamatan		 =" +data.get(i).get(kec)+
							"\n Agama			 =" +data.get(i).get(agama)+
							"\n Status Perkawinan	 =" +data.get(i).get(status)+
							"\n Pekerjaan		 =" +data.get(i).get(kerja)+
							"\n Kewarganegaraan	 =" +data.get(i).get(warga)+
							"\n Masa Berlaku		 =" +data.get(i).get(berlaku)+ "\n";
			//	data.stream().forEach(System.out::println);
				//	Collections.sort(data.add(hash));
					
				}
			}
			catch(java.util.InputMismatchException a){
				System.out.println("Maaf inputan tidak valid ");
			}
			catch(ArrayIndexOutOfBoundsException a){
				System.out.println("Maaf inputan data ektp sudah penuh");
				System.out.println("Ingin mencoba kembali ? Y/N :");
				try{
					pilihan = input.next();
				}
				catch(Exception e){
					System.out.println("Maaf data tidak valid");
				}
				if(pilihan=="n" || pilihan=="N"){
					break;
				}
			}
			break;
			case 2:
				System.out.println("\n===List Data eKTP===");
				
				if(ktp[0] != null){
					try{
						for (int i = 0; i < jumlah ; i++){
							System.out.println(ktp[i]);
						}
					}
					catch(ArrayIndexOutOfBoundsException e){
						System.out.println("Maaf data yang di inputkan salah");
					}
					
				}
				else{
					System.out.println("Data kosong\n");
				}
				System.out.println("Menu :");
				System.out.println("1. Back ");
				System.out.println("2. Exit ");
				try{
					pilih = input.nextInt();	
				}
				catch(java.util.InputMismatchException a){
					System.out.println("Maaf inputan tidak valid " +a);
					break;   
				}
				if(pilih==1){
					running = true;

				}else{
					System.exit(0);
					}
				break;
			
			case 3:
				int i = 1;
				System.out.println("===Cari Data eKTP===\n");
				System.out.println("Masukkan Data Yang Ingin Dicari :");
				read = input.nextLine();
				
				
				
			
				
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Maaf, menu yang anda pilih tidak ada");
		
		
			}
		}

	}

}
