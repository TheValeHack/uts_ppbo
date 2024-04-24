package uts_ppbo;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Pegawai1 rofi = new Pegawai1("Poernomo Maulana Rofif Aqilla", "Manager", 20);
		Pegawai2 emilio = new Pegawai2("Emilio Muhammad Hamsyah Junior", "Staff IT");
		PegawaiPW ruhil = new PegawaiPW("Ruhil Muhammad Ukasyah", "Sekertaris", 60, 10);
		
		System.out.println(rofi);
		System.out.println(emilio);
		System.out.println(ruhil);
		
		ArrayList<String> daftarPegawai = new ArrayList<String>();
		
		daftarPegawai.add(rofi.getNama());
		daftarPegawai.add(emilio.getNama());
		daftarPegawai.add(ruhil.getNama());
		
		ArrayList daftarPegawaiUang = new ArrayList();
		
		daftarPegawaiUang.add(rofi.getTakeHomePay());
		daftarPegawaiUang.add(emilio.getTakeHomePay());
		daftarPegawaiUang.add(ruhil.getTakeHomePay());
		
		
		int pegawaiTerkaya = 0;
		
		for(int i = 0; i < daftarPegawai.size(); i++) {
			if((double) daftarPegawaiUang.get(i) > (double) daftarPegawaiUang.get(pegawaiTerkaya)) {
				pegawaiTerkaya = i;
			}
		}
		
		System.out.println("Pegawai dengan take home pay tertinggi adalah " + daftarPegawai.get(pegawaiTerkaya) + " dengan take home pay sebesar " + daftarPegawaiUang.get(pegawaiTerkaya) + " dollar\n");
	}
}
