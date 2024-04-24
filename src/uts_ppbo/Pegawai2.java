package uts_ppbo;

public class Pegawai2 extends Pegawai {
	public double getAsuransi(double totalGaji) {
		double totalAsuransi = totalGaji * 0.1;
		if(totalAsuransi <= 30) {
			return totalAsuransi;
		} else {
			return 30;
		}
	}
	public Pegawai2(String nama, String jabatan) {
		super(nama, "Pegawai Tidak Tetap", jabatan, 550, 4, 0, 0);
		this.asuransi = this.getAsuransi(this.totalGaji);
	}
	@Override
	public String toString() {
		return this.rincian("");
	}
}
