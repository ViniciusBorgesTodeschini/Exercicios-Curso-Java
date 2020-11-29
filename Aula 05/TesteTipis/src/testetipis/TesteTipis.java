/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipis;

/**
 *
 * @author User
 */
public class TesteTipis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println("A idade é " + valor);*/
        /*String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println("A idade é " + idade);*/
        String valor = "30.50";
        float idade = Float.parseFloat(valor);
        System.out.printf("A idade é %.2f \n", idade);
    }
    
}
