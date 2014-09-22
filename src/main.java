
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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Input a = new Input();
        ComplexMatrix b = new ComplexMatrix();
        
        a.scan();
        b.Matrix(a.real, a.imag);
        b.addMatrix(a.real, a.imag);
        b.subMatrix(a.real, a.imag);
        b.mulMatrix(a.real, a.imag);

    }

}
