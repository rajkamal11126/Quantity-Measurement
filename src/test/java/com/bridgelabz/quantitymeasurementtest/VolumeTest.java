package com.bridgelabz.quantitymeasurementtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.quantitymeasurement.Volume;
import com.bridgelabz.quantitymeasurement.VolumeConverterEnum;

public class VolumeTest {
	@Test
    public void givenOneGallonAndThreePointSevenEightLitre_WhenCompare_ShouldReturnTrue() {
        Volume volumeObject = new Volume(VolumeConverterEnum.LITRE_TO_LITRE, 1, VolumeConverterEnum.LITRE_TO_LITRE, 3.78);
        Assert.assertTrue(volumeObject.compare());
    }
    @Test
    public void given1000MiliLitreAnd1Litre_WhenCompare_ShouldReturnTrue(){
        Volume volumeObject = new Volume(VolumeConverterEnum.LITRE_TO_LITRE, 1000, VolumeConverterEnum.LITRE_TO_LITRE, 1);
        Assert.assertTrue(volumeObject.compare());
    }
    @Test
    public void given1GallonAndThreePointSevenEightLitre_ShouldReturnAdditionResult(){
        Volume volumeObject = new Volume(VolumeConverterEnum.LITRE_TO_LITRE, 1, VolumeConverterEnum.LITRE_TO_LITRE, 3.78);
        double result = volumeObject.AddTwoVolumeUnitsValue();
        Assert.assertEquals(7.56,result,0.0);
    }
    @Test
    public void given1LitreAndThousandMiliLitre_ShouldReturnAdditionResult(){
        Volume volumeObject = new Volume(VolumeConverterEnum.LITRE_TO_LITRE, 1, VolumeConverterEnum.MILLILITRE_TO_LITRE, 1000);
        double result = volumeObject.AddTwoVolumeUnitsValue();
        Assert.assertEquals(2,result,0.0);
    }
}
