package com.bridgelabz;

import java.text.DecimalFormat;

public class LineComparision {
    int x1;
    int y1;
    int x2;
    int y2;

    public LineComparision( ) {

    }

    public LineComparision(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparison");
        LineComparision obj =new LineComparision(5,8,2,6);
        LineComparision obj1 =new LineComparision(5,8,2,6);

       boolean a= obj.equality(obj,obj1);
        System.out.println(a);

        int b = obj.compareLength(obj1,obj);
        System.out.println(b);
    }

    public double calculateLength(LineComparision lineComparision) {
        DecimalFormat df = new DecimalFormat("0.00");
        double powOfx=Math.pow((x2-x1),2);
        double powOfy=Math.pow((y2-y1),2);
        double addXAndY=powOfx+powOfy;
        double length=Math.sqrt(addXAndY);
        System.out.println("Length of line is : "+df.format(length));
        double finalAns= Double.parseDouble(df.format(length));
        return finalAns;
    }

    public  boolean equality(LineComparision lineComparision1,LineComparision lineComparision2){
        Double length= lineComparision1.calculateLength(lineComparision1);
        Double length1= lineComparision2.calculateLength(lineComparision2);

       return length.equals(length1);
    }

    public int compareLength(LineComparision lineComparision1,LineComparision lineComparision2){
        Double length1= lineComparision1.calculateLength(lineComparision1);
        Double length2= lineComparision2.calculateLength(lineComparision2);
        return length1.compareTo(length2);
    }

}
