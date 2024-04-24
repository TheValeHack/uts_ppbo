package uts_ppbo;

public class Pegawai1 extends Pegawai {
	public Pegawai1(String nama, String jabatan, double tunjangan) {
		super(nama, "Pegawai Tetap", jabatan, 550, 4, tunjangan, 30);
	}
	@Override
	public String toString() {
		return this.rincian("");
	}
}
