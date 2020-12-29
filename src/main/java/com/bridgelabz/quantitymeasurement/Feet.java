package com.bridgelabz.quantitymeasurement;

public class Feet {
	private final double value;

	public Feet(double value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;
		Feet feet = (Feet) object;
		return Double.compare(feet.value, value) == 0;
	}

	@Override
	public int hashCode() {
		return 0;
	}
}
