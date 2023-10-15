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


}
