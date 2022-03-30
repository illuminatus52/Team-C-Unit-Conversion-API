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

/**
 * The Converter logic service.
 */
@Service
public class ConverterService {

	/**
	 * this method gets an object of ConverterRequest and does what in the request says.
	 * the convert cases : from Kg to g, from g to Kg, from C to F, and from F to C.
	 * @param request an object of ConverterRequest
	 * @return Http status with ConverterResponse
	 */
	public ResponseEntity<ConverterResponse> convert(ConverterRequest request) {
		// mass conversion
		if (request.getFromType().equalsIgnoreCase("kg") &&
			request.getToType().equalsIgnoreCase("g")) {
			// mass validation
			if (request.getFromValue() < 0) {
				ConverterResponse response = new ConverterResponse(false, 0,
						request.getFromValue(), request.getFromType(), request.getToType());
				return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
			}
			FromKgToGram fromKgToGram = new FromKgToGram();
			float result = fromKgToGram.convert(request.getFromValue());
			return createResponse(result, request);
		} else if (request.getFromType().equalsIgnoreCase("g") &&
				   request.getToType().equalsIgnoreCase("kg")) {
			// mass validation
			if (request.getFromValue() < 0) {
				ConverterResponse response = new ConverterResponse(false, 0,
						request.getFromValue(), request.getFromType(), request.getToType());
				return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
			}
			FromGramToKg fromGramToKg = new FromGramToKg();
			float result = fromGramToKg.convert(request.getFromValue());
			return createResponse(result, request);
		// temperature conversion
		} else if (request.getFromType().equalsIgnoreCase("f") &&
				   request.getToType().equalsIgnoreCase("c")) {
			// Fahrenheit validation
			if (request.getFromValue() < -459.67) {
				ConverterResponse response = new ConverterResponse(false, 0,
						request.getFromValue(), request.getFromType(), request.getToType());
				return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
			}
			FromFahrenheitToCelsius fromFahrenheitToCelsius = new FromFahrenheitToCelsius();
			float conversion = fromFahrenheitToCelsius.convert(request.getFromValue());
			return createResponse(conversion, request);
		} else if (request.getFromType().equalsIgnoreCase("c") &&
				   request.getToType().equalsIgnoreCase("f")) {
			// Celsius validation
			if (request.getFromValue() < -273.15) {
				ConverterResponse response = new ConverterResponse(false, 0,
						request.getFromValue(), request.getFromType(), request.getToType());
				return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
			}
			FromCelsiusToFahrenheit fromCelsiusToFahrenheit = new FromCelsiusToFahrenheit();
			float conversion = fromCelsiusToFahrenheit.convert(request.getFromValue());
			return createResponse(conversion, request);
		} else {
			ConverterResponse response = new ConverterResponse(false, 0,
					request.getFromValue(), request.getFromType(), request.getToType());
			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * This method creates the ConverterResponse entity to return it with the HttpStatus.OK (200).
	 *
	 * @param result the conversion result in float
	 * @param request an object of ConverterRequest
	 * @return Http status with ConverterResponse in case of Http status = OK (200)
	 */
	public ResponseEntity<ConverterResponse> createResponse(float result, ConverterRequest request) {
		ConverterResponse response = new ConverterResponse(true, result,
				request.getFromValue(), request.getFromType(), request.getToType());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
