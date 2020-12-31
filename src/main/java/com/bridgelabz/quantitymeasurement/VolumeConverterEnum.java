package com.bridgelabz.quantitymeasurement;

public enum VolumeConverterEnum implements IUnitConversion {
	GALLON {
        @Override
        public double convert(double value) {
            return value * GALLON_LITER_MULTIPLIER;
        }
    },
    LITER {
        @Override
        public double convert(double value) {
            return value;
        }
    },
    MILLILITER {
        @Override
        public double convert(double value) {
            return value * MILLILITER_LITER_MULTIPLIER;
        }
    };
    private static final double GALLON_LITER_MULTIPLIER = 3.78;
    private static final double MILLILITER_LITER_MULTIPLIER = 0.001;
}
