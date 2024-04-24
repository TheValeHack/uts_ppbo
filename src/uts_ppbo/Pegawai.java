package uts_ppbo;

public class Pegawai {
	public String nama;
	protected String status;
	protected String jabatan;
	protected double gaji;
	protected double tunjangan;
	protected double bonus;
	protected double asuransi;
	protected double totalBonus;
	protected double totalGaji;
	protected double takeHomePay;
	protected String mataUang;
	
	
	public Pegawai(String nama, String status, String jabatan, int gaji, double bonus, double tunjangan, double asuransi) {
		this.status = status;
		this.nama = nama;
		this.jabatan = jabatan;
		this.gaji = gaji;
		this.bonus = bonus /  100;
		this.tunjangan = tunjangan;
		this.asuransi = asuransi;
		this.totalBonus = (this.gaji + this.tunjangan) * this.bonus;
		this.totalGaji = this.gaji + this.totalBonus + this.tunjangan;
		this.mataUang = "dollar";
	}
	public String getNama() {
		return this.nama;
	}
	public double getTakeHomePay() {
		if(this.status.equals("Pegawai Tetap")) {
			this.takeHomePay = this.totalGaji + this.asuransi;
		} else {
			this.takeHomePay = this.totalGaji - this.asuransi;
		}
		
		return this.takeHomePay;
	}
	public String rincian(String tambahan) {
		if(this.status.equals("Pegawai Tetap")) {
			this.takeHomePay = this.totalGaji + this.asuransi;
		} else {
			this.takeHomePay = this.totalGaji - this.asuransi;
		}
		
		String detail = "";
		detail += "------------------------------\n";
		detail += "Nama: " + nama + "\n";
		detail += "Status: " + status + "\n";
		detail += "Jabatan: " + jabatan + "\n";
		detail += tambahan;
		detail += "Gaji pokok: " + gaji + " " + mataUang + "\n";
		detail += "Tunjangan: " + tunjangan + " " + mataUang + "\n";
		detail += "Bonus: " + totalBonus + " " + mataUang + "\n";
		detail += "Asuransi Kesehatan: " + asuransi + " " + mataUang + "\n";
		detail += "Total Gaji: " + totalGaji + " " + mataUang + "\n";
		detail += "Take home pay (dengan asuransi kesehatan): " + takeHomePay + " " + mataUang + "\n";
		detail += "------------------------------\n";
		return detail;
	}
}
