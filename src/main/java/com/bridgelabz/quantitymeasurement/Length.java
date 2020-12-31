package com.bridgelabz.quantitymeasurement;

public class Length {

	private final double value1;
	private final double value2;
	private final LengthConverterEnum unit2;
	private final LengthConverterEnum unit1;

	public Length(LengthConverterEnum unit1, double value1, LengthConverterEnum unit2, double value2) {

		this.unit1 = unit1;
		this.unit2 = unit2;
		this.value1 = value1;
		this.value2 = 0;
	}

	public boolean compare() {
		return Double.compare(unit1.convert(value1), unit2.convert(value2)) == 0;
	}

	public double addTwoLength() {
		return unit1.convert(value1) + unit2.convert(value2);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Length length = (Length) o;
		return Double.compare(length.value1, value1) == 0 && Double.compare(length.value2, value2) == 0
				&& unit2 == length.unit2 && unit1 == length.unit1;
	}
}
