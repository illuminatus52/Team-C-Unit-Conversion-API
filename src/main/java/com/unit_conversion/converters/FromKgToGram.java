package com.unit_conversion.converters;

import com.unit_conversion.service.ConvertService;

/**
 * Converter form Kg to G class, implements the interface ConverterService.
 */
public class FromKgToGram implements ConvertService {

    /**
     * This convert method converts from Kg to G.
     *
     *@param valueToConvert value to convert in float.
     * @return converted value in float.
     */
    @Override
    public float convert(float valueToConvert) {
        return valueToConvert*1000;
    }
}
