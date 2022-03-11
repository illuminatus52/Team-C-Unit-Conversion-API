package com.unit_conversion;

import com.unit_conversion.converters.FromCelsiusToFahrenheit;
import org.junit.jupiter.api.Test;

public class FromCelsiusToFahrenheitTest {
    @Test
    public void testApiFromCelsiusToFahrenheit() {
        FromCelsiusToFahrenheit fromCelsiusToFahrenheit = new FromCelsiusToFahrenheit();
        assert 91.76f == fromCelsiusToFahrenheit.convert(33.2f);
    }
}
