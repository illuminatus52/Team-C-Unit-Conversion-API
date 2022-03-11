package com.unit_conversion;

import com.unit_conversion.controller.ConverterController;
import com.unit_conversion.model.ConverterRequest;
import com.unit_conversion.model.ConverterResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest
public class ErrorHandlingTest {


    @Autowired
    private ConverterController controller;

    @Test
    public void wrongUnitsToBeConvertedTest() {
        ConverterRequest request = new ConverterRequest(1000,"g","d");
        HttpStatus status = controller.convert(request).getStatusCode();
        ConverterResponse response = controller.convert(request).getBody();
        assert response != null;
        assert HttpStatus.BAD_REQUEST == status;
        assert !response.isValid();
    }

    @Test
    public void wrongUnitsToBeConvertedTest2() {
        ConverterRequest request = new ConverterRequest(18000,"kg","f");
        HttpStatus status = controller.convert(request).getStatusCode();
        ConverterResponse response = controller.convert(request).getBody();
        assert response != null;
        assert HttpStatus.BAD_REQUEST == status;
        assert !response.isValid();
    }

    @Test
    public void wrongUnitsToBeConvertedTest3() {
        ConverterRequest request = new ConverterRequest(1550,"c","kg");
        HttpStatus status = controller.convert(request).getStatusCode();
        ConverterResponse response = controller.convert(request).getBody();
        assert response != null;
        assert HttpStatus.BAD_REQUEST == status;
        assert !response.isValid();
    }

    @Test
    public void wrongUnitsToBeConvertedTest4() {
        ConverterRequest request = new ConverterRequest(6000,"f","g");
        HttpStatus status = controller.convert(request).getStatusCode();
        ConverterResponse response = controller.convert(request).getBody();
        assert response != null;
        assert HttpStatus.BAD_REQUEST == status;
        assert !response.isValid();
    }

}
