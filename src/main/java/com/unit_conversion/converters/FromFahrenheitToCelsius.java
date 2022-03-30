package com.unit_conversion.converters;

import com.unit_conversion.service.ConvertService;

/**
 * Converter form Fahrenheit to Celsius class, implements the interface ConverterService.
 */
public class FromFahrenheitToCelsius implements ConvertService {

    /**
     * This convert method converts from Fahrenheit to Celsius.
     *
     * @param valueToConvert value to convert in float.
     * @return converted value in float.
     */
    @Override
    public float convert(float valueToConvert) {
        return 5f/9f * (valueToConvert - 32f);
    }
}
