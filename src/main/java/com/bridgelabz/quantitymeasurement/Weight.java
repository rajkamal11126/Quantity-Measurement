package com.bridgelabz.quantitymeasurement;

public class Weight {
	private final WeightConverterEnum unit1;
    private final WeightConverterEnum unit2;
    private final double value1;
    private final double value2;

    public Weight(WeightConverterEnum unit1, double value1, WeightConverterEnum unit2, int value2) {
        this.unit1 = unit1;
        this.unit2 = unit2;
        this.value1 = value1;
        this.value2 = value2;
    }

    public double addTwoWeight() {
        return unit1.convert(value1) + unit2.convert(value2);
    }
}
