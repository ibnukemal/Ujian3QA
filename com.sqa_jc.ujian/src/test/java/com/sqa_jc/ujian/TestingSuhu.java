package com.sqa_jc.ujian;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sqa_jc.ujian.function.Suhu;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestingSuhu {

	Suhu suhu;
	@Before
	public void setUp() throws Exception {
		suhu = new Suhu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/skenario_f_ke_c.csv")
	public final void testKonversiFC(double fahrenheit, double celsius) {
		assertEquals(celsius, suhu.konversiFC(fahrenheit),0.001);
	}

	@Test
	public final void testBukanAngka1() {
		assertEquals("juara", suhu.konversiFC("Halo Juara"));
	}
	
	@Test
	public final void testAngkaAbsolut1() {
		assertEquals(-18.8889, suhu.konversiFC(-2.0),0.0001);
	}
	
	@Test
	public final void testNol1() {
		assertEquals(0, suhu.konversiFC(0.0),0.0001);
	}

}
