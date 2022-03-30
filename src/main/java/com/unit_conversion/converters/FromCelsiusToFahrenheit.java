package com.unit_conversion.converters;

import com.unit_conversion.service.ConvertService;

/**
 * Converter form Celsius to Fahrenheit class, implements the interface ConverterService.
 */
public class FromCelsiusToFahrenheit implements ConvertService {
    /**
     *  This convert method converts from Celsius to Fahrenheit.
     *
     * @param valueToConvert value to convert in float.
     * @return converted value in float.
     */
    @Override
    public float convert(float valueToConvert) {
        return valueToConvert * 9/5 + 32;
    }
}
