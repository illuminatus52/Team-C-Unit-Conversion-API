package com.unit_conversion.service;

import com.unit_conversion.converters.FromCelsiusToFahrenheit;
import com.unit_conversion.converters.FromFahrenheitToCelsius;
import com.unit_conversion.converters.FromGramToKg;
import com.unit_conversion.converters.FromKgToGram;
import com.unit_conversion.model.ConverterRequest;
import com.unit_conversion.model.ConverterResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {


    public ResponseEntity<ConverterResponse> convert(ConverterRequest request) {
        if (request.getFromValue() < 0) {
            ConverterResponse response =
                    new ConverterResponse(false, 0, request.getFromValue(), request.getFromType(), request.getToType());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        if (request.getFromType().equalsIgnoreCase("kg") && request.getToType().equalsIgnoreCase("g")) {
            FromKgToGram fromKgToGram = new FromKgToGram();
            float result = fromKgToGram.convert(request.getFromValue());
            return createResponse(result, request);
        } else if (request.getFromType().equalsIgnoreCase("g") && request.getToType().equalsIgnoreCase("kg")) {
            FromGramToKg fromGramToKg = new FromGramToKg();
            float result = fromGramToKg.convert(request.getFromValue());
            return createResponse(result,request);
        } else if (request.getFromType().equalsIgnoreCase("f") && request.getToType().equalsIgnoreCase("c")){
            FromFahrenheitToCelsius fromFahrenheitToCelsius = new FromFahrenheitToCelsius();
            float conversion = fromFahrenheitToCelsius.convert(request.getFromValue());
            return createResponse(conversion,request);
        } else if(request.getFromType().equalsIgnoreCase("c") && request.getToType().equalsIgnoreCase("f")) {
            FromCelsiusToFahrenheit fromCelsiusToFahrenheit = new FromCelsiusToFahrenheit();
            float conversion = fromCelsiusToFahrenheit.convert(request.getFromValue());
            return createResponse(conversion,request);
        } else {
            ConverterResponse response =
                    new ConverterResponse(false, 0, request.getFromValue(), request.getFromType(), request.getToType());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<ConverterResponse> createResponse(float result, ConverterRequest request) {
        ConverterResponse response =
                new ConverterResponse(true, result, request.getFromValue(), request.getFromType(), request.getToType());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
