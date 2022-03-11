package com.unit_conversion.controller;

import com.unit_conversion.model.ConverterRequest;
import com.unit_conversion.model.ConverterResponse;
import com.unit_conversion.service.ConverterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/")
public class ConverterController {

    private ConverterService converterService;

    public ConverterController(ConverterService converterService) {
        this.converterService = converterService;
    }

    @PostMapping(path = "")
    public ResponseEntity<ConverterResponse> convert(ConverterRequest request) {
        return converterService.convert(request);
    }
}
