/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01aula14;

/**
 *
 * @author User
 */
public class Vetor01Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n [] = {1,69,8,7,12,36};
        System.out.println("O total de número de casas de N é " + n.length);
        //É UM ATRIBUTO DOS VETORES PARA MOSTRAR O NÚMERO DE CASAS.
        
        for (int c=0;c<=5;c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
         //UTILIZADO PARA MOSTRAR O VETOR.
         
         /* TAMBÉM PODERIA UTILIZAR A SEGUINTE FORMA
         for (int c=0; c<n.length;c++){ 
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
         }
         */
    }
       
    }
    
}
