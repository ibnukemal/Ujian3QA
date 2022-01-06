package com.sqa_jc.ujian.function;

public class KolamAir {

	public double kelilingKolam(double panjang, double lebar, double tinggi) {
		double keliling = 4 * (panjang + lebar + tinggi);
		return keliling; 
	}
	
	public double volumeKolam(double panjang, double lebar, double tinggi) {
		double volume = panjang * lebar * tinggi;
		return volume; 
	}
	
}
