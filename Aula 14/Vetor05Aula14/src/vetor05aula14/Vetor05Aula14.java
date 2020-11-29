/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor05aula14;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor05Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int v[] = new int[20];
        Arrays.fill(v, 0);
        for (int valor:v){
            System.out.print(valor + " ");
        }*/
        
        int v[] = new int[5];
        System.out.println("Digite um número para definir o prenchimento automático: ");
        Scanner teclado = new Scanner (System.in);
        int num = teclado.nextInt();
        Arrays.fill(v, num);
        for (int valor:v){
        System.out.print(valor + " ");
    }
    }
}
