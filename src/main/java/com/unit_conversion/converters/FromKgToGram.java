package com.unit_conversion.converters;

import com.unit_conversion.service.ConvertService;

public class FromKgToGram implements ConvertService {

    public FromKgToGram() {
    }

    @Override
    public double convert(double valueToConvert) {
        double valueInGram = valueToConvert*1000;
        return valueInGram;
    }
}
