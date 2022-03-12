package com.unit_conversion;

import com.unit_conversion.converters.FromGramToKg;
import com.unit_conversion.converters.FromKgToGram;
import org.junit.jupiter.api.Test;

public class GramToKgTestAndTheOtherWayAround {
	
	@Test
	public void testGToKg() {
		FromGramToKg fromGramToKg = new FromGramToKg();
		double value = fromGramToKg.convert(1000);
		assert value == 1;
	}
	
	@Test
	public void testKgToG() {
		FromKgToGram fromKgToGram = new FromKgToGram();
		double value = fromKgToGram.convert(10);
		assert value == 10000;
	}
}
