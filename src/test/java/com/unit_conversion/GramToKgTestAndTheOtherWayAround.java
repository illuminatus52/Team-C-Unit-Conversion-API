package com.unit_conversion;

import com.unit_conversion.converters.FromGramToKg;
import com.unit_conversion.converters.FromKgToGram;
import com.unit_conversion.model.ConverterRequest;
import com.unit_conversion.model.ConverterResponse;
import com.unit_conversion.service.ConverterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GramToKgTestAndTheOtherWayAround {
	@Autowired
	private ConverterService service;

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

	@Test
	public void integrationTestFromGramToKg() {
		ConverterRequest serviceRequest = new ConverterRequest(3800,"g","kg");
		ConverterResponse response = service.convert(serviceRequest).getBody();
		assert response.getResult() == 3.8f;

	}
	@Test
	public void integrationTestFromKgToGram() {
		ConverterRequest serviceRequest = new ConverterRequest(4,"kg","g");
		ConverterResponse response = service.convert(serviceRequest).getBody();
		assert response.getResult() == 4000;

	}
}
