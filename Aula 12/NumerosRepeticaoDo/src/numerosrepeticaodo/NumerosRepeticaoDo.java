/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosrepeticaodo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NumerosRepeticaoDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, soma = 0;
        String confirmacao;
        Scanner teclado = new Scanner(System.in); //criação de um objeto Scanner para importação
        do {
            System.out.print("Digite um número: ");    
            num = teclado.nextInt();//comando para leitura de números inteiros digitados
            soma += num; // S = S + N
            System.out.print("Quer continuar? [S/N] ");
            confirmacao = teclado.next();
    } while(confirmacao.equals("S"));
    System.out.println("A soma de todos os valores é " + soma );
}
}