package com.unit_conversion;

import com.unit_conversion.converters.FromFahrenheitToCelsius;
import com.unit_conversion.model.ConverterRequest;
import com.unit_conversion.model.ConverterResponse;
import com.unit_conversion.service.ConverterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FromFahrenheitToCelsiusTest {

	@Autowired
	private ConverterService service;

	@Test
	public void convertFahrenheitToCelsius() {
		FromFahrenheitToCelsius fromFahrenheitToCelsius = new FromFahrenheitToCelsius();
		assert 232.77779f == fromFahrenheitToCelsius.convert(451f);
	}

	@Test
	public void integrationTestFromFahrenheitToCelsius() {
		ConverterRequest serviceRequest = new ConverterRequest(72,"f","c");
		ConverterResponse response = service.convert(serviceRequest).getBody();
		assert response.getResult() == 22.222223f;
	}
}
