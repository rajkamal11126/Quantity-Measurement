package com.bridgelabz.quantitymeasurementtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.quantitymeasurement.Feet;
import com.bridgelabz.quantitymeasurement.Inch;

public class FeetTest {
	@Test
	public void given0FeetAnd0Feet_ShouldReturnTrue() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		Assert.assertEquals(feet1, feet2);
	}

	@Test
	public void given0FeetAnd1Feet_ShouldReturnNotEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(1.0);
		boolean result = feet1.equals(feet2);
		Assert.assertFalse(result);
	}

	@Test
	public void given0InchAnd0Inch_ShouldReturnTrue() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(0.0);
		Assert.assertEquals(inch1, inch2);
	}
	
	@Test
    public void given0InchAnd1Inch_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        boolean result=inch1.equals(inch2);
        Assert.assertFalse(result);
    }
}
