/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03aula14;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Vetor03Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num[] = {1.2, 9.8, 8.8, 2.6, 7.18, 12.7};
        Arrays.sort(num);
        //utilizando a classe Arrays e o sort float (de ponto flutuante) para organizar o vetor.
        for (double valor: num){
            System.out.println(valor);
        }
    }
    
}
