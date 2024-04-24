package uts_ppbo;

public class PegawaiPW extends Pegawai {
	public double tarif;
	public double totalJam;
	public PegawaiPW(String nama, String jabatan, int totalJam, int tarif) {
		super(nama, "Pegawai Paruh Waktu", jabatan, totalJam * tarif, 0, 0, 0);
		this.tarif = tarif;
		this.totalJam = totalJam;
	}
	@Override
	public String toString() {
		String detailTarif = "Tarif perjam: " + (int) this.tarif + " " + this.mataUang + " per jam\n";
		detailTarif += "Jam kerja: " + (int) this.totalJam + " jam\n";
		return this.rincian(detailTarif);
	}
}
