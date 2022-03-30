package com.unit_conversion.converters;

import com.unit_conversion.service.ConvertService;

/**
 * Converter form G to Kg class, implements the interface ConverterService.
 */
public class FromGramToKg implements ConvertService {

    /**
     * This convert method converts from G to Kg.
     *
     *@param valueToConvert value to convert in float.
     * @return converted value in float.
     */
    @Override
    public float convert(float valueToConvert) {
        return valueToConvert/1000;
    }
}
