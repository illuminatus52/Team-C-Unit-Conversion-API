package com.unit_conversion.converters;

import com.unit_conversion.service.ConvertService;

public class FromGramToKg implements ConvertService {
    @Override
    public float convert(float valueToConvert) {
        return valueToConvert/1000;
    }
}
