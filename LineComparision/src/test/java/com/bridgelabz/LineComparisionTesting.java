package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineComparisionTesting {

    LineComparision obj;
    LineComparision obj1;
    LineComparision lc= new LineComparision();


    @Test
    public void toCheckTheLengthOfLine(){
        obj= new LineComparision(2,4,3,6);
        Assertions.assertEquals(2.24,obj.calculateLength(obj));
    }

    @Test
    public void toCheckTheLengthOfLine1(){
         obj= new LineComparision(5,8,2,6);
        Assertions.assertEquals(3.61,obj.calculateLength(obj));
    }

    @Test
    public void  toCheckEqulityOfTwoLineBasedOnEndPoint(){
         obj = new LineComparision(5,8,2,6);
         obj1=new LineComparision(5,8,2,6);
         Assertions.assertTrue( obj.equality(obj,obj1));
    }
}
