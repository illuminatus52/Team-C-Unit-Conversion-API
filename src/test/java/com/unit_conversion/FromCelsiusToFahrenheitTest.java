package com.unit_conversion;

import com.unit_conversion.controller.ConverterController;
import com.unit_conversion.converters.FromCelsiusToFahrenheit;
import com.unit_conversion.model.ConverterRequest;
import com.unit_conversion.model.ConverterResponse;
import com.unit_conversion.service.ConverterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FromCelsiusToFahrenheitTest {
	@Autowired
	private ConverterService service;

	@Test
	public void testApiFromCelsiusToFahrenheit() {
		FromCelsiusToFahrenheit fromCelsiusToFahrenheit = new FromCelsiusToFahrenheit();
		assert 91.76f == fromCelsiusToFahrenheit.convert(33.2f);
	}

	@Test
	public void integrationTestFromCelsiusToFahrenheit() {
		ConverterRequest serviceRequest = new ConverterRequest(32,"c","f");
		ConverterResponse response = service.convert(serviceRequest).getBody();
		assert response.getResult() == 89.6f;

	}
}
