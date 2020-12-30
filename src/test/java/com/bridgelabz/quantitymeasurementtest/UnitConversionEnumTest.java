package com.bridgelabz.quantitymeasurementtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.quantitymeasurement.LengthConverterEnum;

public class UnitConversionEnumTest {
	@Test
	public void given1Feet_ShouldReturnInInch() {
		Assert.assertEquals(12.0, LengthConverterEnum.FEET_TO_INCH.convert(1.0), 0.0);
	}

	@Test
	public void given1Yard_ShouldReturnInInch() {
		Assert.assertEquals(36.0, LengthConverterEnum.YARDS_TO_INCHES.convert(1.0), 0.0);
	}

	@Test
	public void given1Inch_ShouldReturnInInch() {
		Assert.assertEquals(1.0, LengthConverterEnum.INCH_TO_INCH.convert(1.0), 0.0);
	}

	@Test
	public void given1Centimeter_ShouldReturnInInch() {
		Assert.assertEquals(0.4, LengthConverterEnum.CENTIMETER_TO_INCH.convert(1.0), 0.0);
	}
}
