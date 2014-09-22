
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Input {

    public static final int SIZE = 2;
    public double real[] = new double[SIZE];
    public double imag[] = new double[SIZE];

    public void scan() {
        Scanner sc = new Scanner(System.in);
        for (int x = 0; x < SIZE; x++) {
            System.out.print("Enter Real part : ");
            real[x] = sc.nextDouble();
            System.out.print("Enter Imaginary part : ");
            imag[x] = sc.nextDouble();
        }
    }

}
