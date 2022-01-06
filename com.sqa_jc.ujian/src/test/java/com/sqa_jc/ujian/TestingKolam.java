package com.sqa_jc.ujian;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sqa_jc.ujian.function.KolamAir;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)

public class TestingKolam {
	
	KolamAir kolam;
	@Before
	public void setUp() throws Exception {
		kolam = new KolamAir();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/skenario_keliling_kolam.csv")
	public final void testKelilingKolam(double panjang, double lebar, double tinggi, double keliling) {
		assertEquals(keliling, kolam.kelilingKolam(panjang, lebar, tinggi),0.001);
	}
	
	@Test
	public final void testBukanAngka() {
		assertEquals("aaa", kolam.kelilingKolam("abc", "bdg", "cfe"),0.001);
	}
	
	@Test
	public final void testAbsolutePositif() {
		assertEquals(56, kolam.kelilingKolam(-8, -5, -1),0.001);
	}
	
	@Test
	public final void testExpectNol() {
		assertEquals(0, kolam.kelilingKolam(5, 4, 0),0.001);
	}
	
	
	@Test
	@FileParameters("src/test/resources/skenario_volume_kolam.csv")
	public final void testVolumeKolam(double panjang, double lebar, double tinggi, double volume) {
		assertEquals(volume, kolam.volumeKolam(panjang, lebar, tinggi),0.001);
	}

	@Test
	public final void testBukanAngkaa() {
		assertEquals("aaa", kolam.volumeKolam("abc", "bdg", "cfe"),0.001);
	}
	
	@Test
	public final void testAbsolutePositiff() {
		assertEquals(40, kolam.volumeKolam(-8, -5, -1),0.001);
	}
	
	@Test
	public final void testExpectNoll() {
		assertEquals(0, kolam.volumeKolam(0, 0, 5),0.001);
	}
	
}
