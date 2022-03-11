package com.unit_conversion.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/")
public class ConverterController {

    @PostMapping
    public void convert() {

    }
}
