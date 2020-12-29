package com.bridgelabz.quantitymeasurement;

public class Length {
	private static final double FEET_TO_INCH = 12.0;
	private static final double INCH_TO_FEET = 0.0833333;

	public boolean compare(Length that) {

		if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
			return Double.compare(this.value, that.value) == 0;
		if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
			return Double.compare(this.value * FEET_TO_INCH, that.value) == 0;
		if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
			return Double.compare(this.value * 0.0833333, that.value) == 0;
		return false;
	}

	public enum Unit {
		FEET, INCH
	}

	private final double value;
	private final Unit unit;

	public Length(Unit unit, double value) {
		this.unit = unit;
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Length length = (Length) o;
		return Double.compare(length.value, value) == 0 && unit == length.unit;
	}
}
