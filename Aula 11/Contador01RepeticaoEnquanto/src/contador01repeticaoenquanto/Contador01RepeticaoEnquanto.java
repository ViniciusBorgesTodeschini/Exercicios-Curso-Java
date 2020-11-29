/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01repeticaoenquanto;

/**
 *
 * @author User
 */
public class Contador01RepeticaoEnquanto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int cc = 1;
        while (cc<=10){
            System.out.println("Cambalhota n° " + cc);
            cc++;
        }*/
        //ESTRUTURA ENQUANTO COM O LAÇO NORMAL.
        
        /*int cc = 1;
        while (cc<=10){
            cc++;   
            if (cc==5 || cc==7){
                continue;
            }
            System.out.println("Cambalhota n° " + cc);*/
        //ESTRUTURA ENQUANTO COM O COMANDO "CONTINUE" PARA RETORNAR O LAÇO AO INICIO QUANDO EXECUTADO.
        
        int cc = 0;
        while (cc<=10){
            cc++;   
            if (cc==2|| cc==3 || cc==4){
                continue;
            }
            if (cc==7){
                break;
        }
            System.out.println("Cambalhota n° " + cc);
        }
        // ESTRUTURA ENQUANTO COM O COMANDO "BREAK" PARA ENCERRAR O CICLO ANTES DO FINAL DETERMINADO NO INICIO DO COMANDO.        
    }
    
}
