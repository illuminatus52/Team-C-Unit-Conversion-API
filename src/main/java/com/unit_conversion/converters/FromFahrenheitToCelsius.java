package com.unit_conversion.converters;

import com.unit_conversion.service.ConvertService;

public class FromFahrenheitToCelsius implements ConvertService {
    @Override
    public float convert(float valueToConvert) {
        return 5f/9f * (valueToConvert - 32f);
    }
}
