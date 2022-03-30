package com.unit_conversion.model;

/**
 * The response body that comes from the End-point (convert)
 */
public class ConverterResponse {

    private boolean valid;
    private float result;
    private float fromValue;
    private String fromType;
    private String toType;

    /**
     * Default constructor.
     *
     */
    public ConverterResponse() {
    }

    /**
     * Constructor.
     *
     * @param valid if the request valid (true) otherwise (false)
     * @param result the result of the conversion
     * @param fromValue value to convert in float.
     * @param fromType the value type
     * @param toType the type after the conversion
     */
    public ConverterResponse(boolean valid, float result, float fromValue, String fromType, String toType) {
        this.valid = valid;
        this.result = result;
        this.fromValue = fromValue;
        this.fromType = fromType;
        this.toType = toType;
    }

    /**
     * Is.
     *
     * @return valid (true/false)
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Setter.
     *
     * @param valid true/false
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    /**
     * Getter.
     *
     * @return integer result
     */
    public float getResult() {
        return result;
    }

    /**
     * Setter.
     *
     * @param result the result in float
     */
    public void setResult(float result) {
        this.result = result;
    }

    /**
     * Getter.
     *
     * @return from value in float
     */
    public float getFromValue() {
        return fromValue;
    }

    /**
     * Setter.
     *
     * @param fromValue from value in float
     */
    public void setFromValue(float fromValue) {
        this.fromValue = fromValue;
    }

    /**
     * Getter.
     *
     * @return from type in String
     */
    public String getFromType() {
        return fromType;
    }

    /**
     * Setter.
     *
     * @param fromType from type in String
     */
    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    /**
     * Getter.
     *
     * @return the type to convert in String
     */
    public String getToType() {
        return toType;
    }

    /**
     * Setter.
     *
     * @param toType the type to convert in String
     */
    public void setToType(String toType) {
        this.toType = toType;
    }
}
