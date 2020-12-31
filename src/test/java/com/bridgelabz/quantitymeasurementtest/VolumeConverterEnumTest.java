package com.bridgelabz.quantitymeasurementtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.quantitymeasurement.VolumeConverterEnum;

public class VolumeConverterEnumTest {
	@Test
	public void givenOneGallon_ShouldReturnThreePointSevenEightLiter() {
		Assert.assertEquals(3.78, VolumeConverterEnum.GALLON.convert(1), 0.0);
	}

	@Test
	public void given1Liter_ShouldReturn1Liter() {
		Assert.assertEquals(1, VolumeConverterEnum.LITER.convert(1), 0.0);
	}

	@Test
	public void given1000MilliLiter_ShouldReturn1Liter() {
		Assert.assertEquals(1, VolumeConverterEnum.MILLILITER.convert(1000), 0.0);
	}
}
