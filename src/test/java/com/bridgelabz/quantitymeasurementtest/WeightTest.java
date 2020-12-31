package com.bridgelabz.quantitymeasurementtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.quantitymeasurement.Weight;
import com.bridgelabz.quantitymeasurement.WeightConverterEnum;

public class WeightTest {
	@Test
    public void given1TonneAnd1000Gram_WhenPerformAddition_ShouldReturn1001KiloGram() {
        Weight weightObject = new Weight(WeightConverterEnum.TONNE_TO_KILOGRAM, 1.0, WeightConverterEnum.GRAM_TO_KILOGRAM, 1000);
        Assert.assertEquals(1001, weightObject.addTwoWeight(), 0.0);
    }
}
