package com.bridgelabz.quantitymeasurement;

public enum WeightConverterEnum implements IUnitConversion {
	GRAM_TO_KILOGRAM {
		@Override
		public double convert(double value) {
			return value * GRAM_KILOGRAM_MULTIPLIER;
		}
	},
	KILOGRAM_TO_KILOGRAM {
		@Override
		public double convert(double value) {
			return value;
		}
	},
	TONNE_TO_KILOGRAM {
		@Override
		public double convert(double value) {
			return value * TONNE_TO_KILOGRAM_MULTIPLIER;
		}
	};

	private static final double GRAM_KILOGRAM_MULTIPLIER = 0.001;
	private static final double TONNE_TO_KILOGRAM_MULTIPLIER = 1000;

	public static class Weight {
		private final WeightConverterEnum unit1;
		private final double value1;
		private final WeightConverterEnum unit2;
		private final double value2;

		public Weight(WeightConverterEnum unit1, double value1, WeightConverterEnum unit2, double value2) {
			this.unit1 = unit1;
			this.value1 = value1;
			this.unit2 = unit2;
			this.value2 = value2;
		}

		public boolean compare() {
			return Double.compare(unit1.convert(value1), unit2.convert(value2)) == 0;
		}
	}
}