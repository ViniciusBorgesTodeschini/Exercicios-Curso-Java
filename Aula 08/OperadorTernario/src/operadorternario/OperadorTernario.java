/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author User
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // EQUIVALE AO OPERADOR "SE" DO VISUALG, MAS É UTILZIADO APENAS PARA ATRIBUIR VALOR A VARIAVEL
        int n1,n2,r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2)?n1+n2:n2-n1;
        System.out.println(r);
    }
    
}
