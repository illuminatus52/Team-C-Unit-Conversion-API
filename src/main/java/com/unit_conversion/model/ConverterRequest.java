package com.unit_conversion.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * The request body class for the End-point (convert).
 *
 */
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

    /**
     * Default constructor.
     *
     */
    public ConverterRequest() {
    }

    /**
     * Constructor.
     *
     * @param fromValue value to convert in float.
     * @param fromType the value type
     * @param toType the type after the conversion
     */
    public ConverterRequest(float fromValue, String fromType, String toType) {
        this.fromValue = fromValue;
        this.fromType = fromType;
        this.toType = toType;
    }

    /**
     * Getter.
     *
     * @return value to convert in float.
     */
    public float getFromValue() {
        return fromValue;
    }

    /**
     * Setter.
     *
     * @param fromValue value to convert in float.
     */
    public void setFromValue(float fromValue) {
        this.fromValue = fromValue;
    }

    /**
     * Getter.
     *
     * @return the original value type.
     */
    public String getFromType() {
        return fromType;
    }

    /**
     * Setter.
     *
     * @param fromType the original value type.
     */
    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    /**
     * Getter.
     *
     * @return the type after the conversion.
     */
    public String getToType() {
        return toType;
    }

    /**
     * Setter.
     *
     * @param toType the type after the conversion.
     */
    public void setToType(String toType) {
        this.toType = toType;
    }
}
