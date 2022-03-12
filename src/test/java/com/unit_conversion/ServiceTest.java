package com.unit_conversion;

import com.unit_conversion.controller.ConverterController;
import com.unit_conversion.model.ConverterRequest;
import com.unit_conversion.model.ConverterResponse;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ServiceTest {
	
	@Autowired
	private ConverterController controller;
	
	@Test
	public void kgToGTest() {
		ConverterRequest request = new ConverterRequest(2, "kg", "g");
		ConverterResponse response = controller.convert(request).getBody();
		HttpStatus status = controller.convert(request).getStatusCode();
		assert response != null;
		assertEquals(2000, response.getResult());
		assertTrue(response.isValid());
		assertEquals(status, HttpStatus.OK);
	}
	
	@Test
	public void gToKgTest() {
		ConverterRequest request = new ConverterRequest(3000, "g", "kg");
		ConverterResponse response = controller.convert(request).getBody();
		HttpStatus status = controller.convert(request).getStatusCode();
		assert response != null;
		assertEquals(3, response.getResult());
		assertTrue(response.isValid());
		assertEquals(status, HttpStatus.OK);
	}
	
	
	@Test
	public void fToCTest() {
		ConverterRequest request = new ConverterRequest(32, "f", "c");
		ConverterResponse response = controller.convert(request).getBody();
		HttpStatus status = controller.convert(request).getStatusCode();
		assert response != null;
		assertEquals(0, response.getResult());
		assertTrue(response.isValid());
		assertEquals(status, HttpStatus.OK);
	}
	
	@Test
	public void CToFTest() {
		ConverterRequest request = new ConverterRequest(100, "c", "f");
		ConverterResponse response = controller.convert(request).getBody();
		HttpStatus status = controller.convert(request).getStatusCode();
		assert response != null;
		assertEquals(212, response.getResult());
		assertTrue(response.isValid());
		assertEquals(status, HttpStatus.OK);
	}
	
	@Test
	public void unValidTest() {
		ConverterRequest request = new ConverterRequest(-10000, "g", "kg");
		ConverterResponse response = controller.convert(request).getBody();
		HttpStatus status = controller.convert(request).getStatusCode();
		assert response != null;
		assertEquals(0, response.getResult());
		assertFalse(response.isValid());
		assertEquals(status, HttpStatus.BAD_REQUEST);
		
		ConverterRequest request2 = new ConverterRequest(-5, "kg", "g");
		ConverterResponse response2 = controller.convert(request).getBody();
		HttpStatus status2 = controller.convert(request).getStatusCode();
		assert response2 != null;
		assertEquals(0, response2.getResult());
		assertFalse(response2.isValid());
		assertEquals(status2, HttpStatus.BAD_REQUEST);
	}
}
