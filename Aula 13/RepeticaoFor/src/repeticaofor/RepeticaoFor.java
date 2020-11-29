/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author User
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*for (int cc=1;cc<=4;cc++){
            System.out.println("Cambalhota n° " + cc);*/
            //equivale a estrutura "PARA" dos algoritmos.
            // acrescentando
            for (int cc=100;cc>=10;cc-=10){
            System.out.println("Cambalhota n° " + cc);
            //Diminuindo
        }
        /* MODELO ENQUANTO
        int cc=1;
        while (cc<=4){
            System.oyt.println("Cambalhota n° " + cc);
            cc++;
        }
        */
        
        /* MODELO FAÇA
        do {
            System.out.println ("Cambalhota n " ++c);
            cc++;
        while (cc<=4);
        */
    }
    
}
