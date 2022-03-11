package com.unit_conversion.converters;

import com.unit_conversion.service.ConvertService;

public class FromGramToKg implements ConvertService {

    public FromGramToKg() {
    }

    @Override
    public float convert(float valueToConvert) {
        return valueToConvert/1000;
    }
}
