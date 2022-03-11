package com.unit_conversion.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ConverterRequest {

    @NotNull
    @NotEmpty
    @NotBlank
    private float fromValue;
    @NotNull
    @NotEmpty
    @NotBlank
    private String fromType;
    @NotNull
    @NotEmpty
    @NotBlank
    private String toType;

    public ConverterRequest() {
    }

    public ConverterRequest(float fromValue, String fromType, String toType) {
        this.fromValue = fromValue;
        this.fromType = fromType;
        this.toType = toType;
    }

    public float getFromValue() {
        return fromValue;
    }

    public void setFromValue(float fromValue) {
        this.fromValue = fromValue;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType;
    }
}
