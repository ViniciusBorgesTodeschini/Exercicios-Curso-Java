/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01rotinasaula15;

/**
 *
 * @author User
 */
public class TesteFuncao01RotinasAula15 {

    /**
     * @param args the command line arguments
     */
    /*static void soma (int a, int b){
        int s = a + b;
        System.out.println("A soma é " + s);
    }*/ //É UMA ROTINA/PROCEDIMENTO
    
    static int soma (int a, int b){
        int s = a + b;
        return s;
    } //ESSA É UMA FUNÇÃO
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("Começou o programa.");
        soma (5,2);*/ //PROGRAMA DA ROTINA/PROCEDIMENTO
        
        System.out.println("Começou o programa.");
        int sm = soma (5,2);
        System.out.println("A soma vale " + sm);
    }
    
}
