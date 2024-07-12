package com.Value;

import java.io.Serializable;

public class Number implements Serializable {
    private static final long serialVersionUID = 1L;

    int min;
    int max;
    int value;

    public Number() {
        this.min = 0;
        this.max = 0;
        this.value = 0;
    }

    public Number(int min, int max, int value) {
        if (min >= value || value >= max) {
            throw new IllegalArgumentException("Gia tri phai thoa man min < value < max");
        }

        this.min = min;
        this.max = max;
        this.value = min;
    }

    // getters and setters
    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (min >= value || value >= max) {
            throw new IllegalArgumentException("Gia tri phai thoa man min < value < max");
        }
        this.value = value;
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Number{" +
                "value=" + value +
                ", min=" + min +
                ", max=" + max +
                '}';
    }

}
