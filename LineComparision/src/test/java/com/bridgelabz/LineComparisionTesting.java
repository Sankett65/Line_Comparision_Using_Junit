package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineComparisionTesting {

    LineComparision obj;
    LineComparision obj1;

    @Test
    public void toCheckTheLengthOfLine() throws LineLengthCannotBeZeroException {
        obj= new LineComparision(2,4,3,6);
        Assertions.assertEquals(2.24,obj.calculateLength(obj));
    }

    @Test
    public void toCheckTheLengthOfLine1() throws LineLengthCannotBeZeroException {
        obj= new LineComparision(0,0,0,0);
        Assertions.assertEquals(0.00,obj.calculateLength(obj));
    }

    @Test
    public void toCheckTheLengthOfLine2() throws LineLengthCannotBeZeroException {
         obj= new LineComparision(5,8,2,6);
        Assertions.assertEquals(3.61,obj.calculateLength(obj));
    }

    @Test
    public void  toCheckEqulityOfTwoLineBasedOnEndPoint() throws LineLengthCannotBeZeroException {
         obj = new LineComparision(5,8,2,6);
         obj1=new LineComparision(5,8,2,6);
         Assertions.assertTrue( obj.equality(obj,obj1));
    }

    @Test
    public void  toCheckEqulityOfTwoLineBasedOnEndPoint1() throws LineLengthCannotBeZeroException {
        obj = new LineComparision(6,7,4,3);
        obj1=new LineComparision(5,8,2,6);
        Assertions.assertFalse( obj.equality(obj,obj1));
    }

    @Test
    public void  toCompareTheTwoLineUsingTheLength() throws LineLengthCannotBeZeroException {
        obj = new LineComparision(5,8,2,6);
        obj1=new LineComparision(5,8,2,6);
        Assertions.assertEquals(0,obj.compareLength(obj1,obj));
    }

    @Test
    public void  toCompareTheTwoLineUsingTheLength1() throws LineLengthCannotBeZeroException {
        obj = new LineComparision(2,8,9,4);
        obj1=new LineComparision(5,7,2,3);
        Assertions.assertEquals(-1,obj.compareLength(obj1,obj));
    }
}
