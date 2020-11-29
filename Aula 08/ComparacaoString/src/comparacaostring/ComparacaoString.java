/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author User
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String nome1 = "Vinicius";
        String nome2 = "Vinicius";
        String nome3 = new String ("Vinicius");
        String res;
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res);*/
        //ESSE EXEMPLO ACIMA TERÁ PROBLEMAS EM COMPARAR OS OBJETOS N1 E N2 COM O N3
        
        String nome1 = "Vinicius";
        String nome2 = "Vinicius";
        String nome3 = new String ("Vinicius");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        // O METODO ".equals" VERIFICA OS OBJETOS DENTRO DAS CLASSES.
    }
    
}
