/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodopc;

import java.awt.Toolkit;
import java.io.PrintStream;
import java.util.Locale;

/**
 *
 * @author User
 */
public class ResolucaoDoPc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        PrintStream println = System.out.println(tela.getDesktopProperty());
    }
}
