package com.bridgelabz.quantitymeasurementtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.quantitymeasurement.VolumeConverterEnum;

public class VolumeConverterEnumTest {
	@Test
	public void givenOneGallon_ShouldReturnThreePointSevenEightLitre() {
		Assert.assertEquals(3.78, VolumeConverterEnum.GALLON_TO_LITRE.convert(1), 0.0);
	}

	@Test
	public void given1Litre_ShouldReturn1Litre() {
		Assert.assertEquals(1, VolumeConverterEnum.LITRE_TO_LITRE.convert(1), 0.0);
	}

	@Test
	public void given1000MilliLitre_ShouldReturn1Litre() {
		Assert.assertEquals(1, VolumeConverterEnum.MILLILITRE_TO_LITRE.convert(1000), 0.0);
	}
}
