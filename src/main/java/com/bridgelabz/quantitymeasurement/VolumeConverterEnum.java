package com.bridgelabz.quantitymeasurement;

public enum VolumeConverterEnum implements IUnitConversion {
	GALLON_TO_LITRE {
		@Override
		public double convert(double value) {
			return value * GALLON_LITER_MULTIPLIER;
		}
	},
	LITRE_TO_LITRE {
		@Override
		public double convert(double value) {
			return value;
		}
	},
	MILLILITRE_TO_LITRE {
		@Override
		public double convert(double value) {
			return value * MILILITER_LITER_MULTIPLIER;
		}
	};

	private static final double GALLON_LITER_MULTIPLIER = 3.78;
	private static final double MILILITER_LITER_MULTIPLIER = 0.001;
}
