/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepitadoaulaexe12;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ExercicioRepitaDoAulaExe12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*JOptionPane.showMessageDialog(null,"Olá, mundo!", "Boas vindas!", JOptionPane.INFORMATION_MESSAGE);
        Irá aparecer uma mensagem “Olá, mundo!”  com o titulo “Boas vindas!”  e com um botão para dar ok. ESSE É O COMANDO DO VOID MAIN
        */
        
        /*int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        JOptionPane.showMessageDialog(null, "Você digitou o númoero " + n);
        COMANDO UTILIZADO PARA DIGITAR E RETORNAR UM NÚMERO.
        */
        
        int n, s=0;
        int totval =0;
        int totpar = 0;
        int totimp =0;
        int acima100 =0;
        int media =0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrompe)<em><html>"));//O HTML <EM> COLOCA O TEXTO EM ITALICO.
            s += n;
            totval += 1;
            media = (s/totval);
            if (n%2!=0){
                totimp +=1;
            } else {
            totpar += 1;
            }
            if (n>100){
            acima100 +=1;
            }
            
        } while (n!=0);
        JOptionPane.showMessageDialog(null, 
                "<html>Resultado:<hr><br> Total de valores: " + totval + 
                        "<br>Total de pares: " + totpar + 
                        "<br>Total de ímpares: " + totimp + 
                        "<br>Acima de 100: " + acima100 + 
                        "<br>Média dos valores: " + media +
                        "<html>");
    }
    
}
