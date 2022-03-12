package com.unit_conversion;

import com.unit_conversion.converters.FromFahrenheitToCelsius;
import org.junit.jupiter.api.Test;

public class FromFahrenheitToCelsiusTest {
	@Test
	public void convertFahrenheitToCelsius() {
		FromFahrenheitToCelsius fromFahrenheitToCelsius = new FromFahrenheitToCelsius();
		assert 232.77779f == fromFahrenheitToCelsius.convert(451f);
	}
}
