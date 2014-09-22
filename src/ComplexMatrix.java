/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ComplexMatrix {

    public static final int SIZE = 2;
    public double[][][] m = new double[SIZE][SIZE][SIZE];
    private double REAL;
    private double IMAG;
    public String s;

    public void Matrix(double Re[], double Im[]) {
        for (int x = 0; x < SIZE; x++) {
            if (x == 0) {
                s = "First";
            } else {
                s = "Second";
            }
            System.out.println(s + " Complex to Matrix");
            for (int y = 0; y < SIZE; y++) {
                for (int z = 0; z < SIZE; z++) {
                    if (y == z) {
                        System.out.print(Re[x]);
                    } else if (y < z) {
                        System.out.println(" -" + Im[x]);
                    } else {
                        System.out.print(Im[x] + " ");
                    }
                }
            }
            System.out.println("");
        }
    }
    
    public void addMatrix(double Re[], double Im[]) {
        for (int x = 0; x < SIZE; x++) {
            REAL += Re[x];
            REAL += Im[x];
        }

        System.out.println("Add Complex to Matrix");
        for (int y = 0; y < SIZE; y++) {
            for (int z = 0; z < SIZE; z++) {
                if (y == z) {
                    System.out.print(REAL);
                } else if (y < z) {
                    System.out.println(" -" + IMAG);
                } else {
                    System.out.print(IMAG + " ");
                }
            }
        }
        System.out.println("");
    }
    
    public void subMatrix(double Re[], double Im[]) {
        REAL = Re[0];
        IMAG = Im[0];
        for (int x = 1; x < SIZE; x++) {

            REAL -= Re[x];
            IMAG -= Im[x];
        }

        System.out.println("Substract Complex to Matrix");
        for (int y = 0; y < SIZE; y++) {
            for (int z = 0; z < SIZE; z++) {
                if (y == z) {
                    System.out.print(REAL);
                } else if (y < z) {
                       System.out.println(" " + -1*IMAG); 
                } else {
                    System.out.print(IMAG + " ");
                }
            }
        }
        System.out.println("");
    }
    
    public void mulMatrix(double Re[], double Im[]) {
        REAL = 1;
        IMAG = 1;
        for (int x = 0; x < SIZE; x++) {

            REAL *= Re[x];
            IMAG *= Im[x];
        }

        System.out.println("Multiplication Complex to Matrix");
        for (int y = 0; y < SIZE; y++) {
            for (int z = 0; z < SIZE; z++) {
                if (y == z) {
                    System.out.print(REAL);
                } else if (y < z) {
                    System.out.println(" -" + IMAG);
                } else {
                    System.out.print(IMAG + " ");
                }
            }
        }
        System.out.println("");
    }
}
