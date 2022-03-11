package com.unit_conversion.converters;

import com.unit_conversion.service.ConvertService;

public class FromGramToKg implements ConvertService {

    public FromGramToKg() {
    }

    @Override
    public double convert(double valueToConvert) {
        double valueInKg = valueToConvert/1000;
        return valueInKg;
    }
}
