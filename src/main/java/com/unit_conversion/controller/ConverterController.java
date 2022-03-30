package com.unit_conversion.controller;

import com.unit_conversion.model.ConverterRequest;
import com.unit_conversion.model.ConverterResponse;
import com.unit_conversion.service.ConverterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Unit Conversion REST Controller class.
 *
 */
@RestController
@RequestMapping(path = "api/")
public class ConverterController {

    private ConverterService converterService;

    /**
     * Constructor.
     *
     * @param converterService an Object of ConverterService
     */
    public ConverterController(ConverterService converterService) {
        this.converterService = converterService;
    }

    /**
     * This method calls the convert method in Object ConverterService
     * to convert from (Kg to G, G to Kg, C to F, and F to C).
     *
     * @param request ConverterRequest object ConverterRequest
     * @return Http status with ConverterResponse in case of Http status = OK (200)
     */
    @PostMapping(path = "convert")
    public ResponseEntity<ConverterResponse> convert(@RequestBody ConverterRequest request) {
        return converterService.convert(request);
    }
}
