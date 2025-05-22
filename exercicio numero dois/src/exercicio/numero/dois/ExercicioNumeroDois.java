/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.numero.dois;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class ExercicioNumeroDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           Scanner Objtest = new Scanner(System.in);
        String n1 = Objtest.nextLine();
        n1 = n1.toUpperCase();
        String n2 = vogais(n1);
        System.out.println(n2);
    }

    public static String vogais(String n1) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n1.length(); i++) {
            char n3 = n1.charAt(i);
            if (n3 == 'A' || n3 == 'E' || n3 == 'I' || n3 == 'O' || n3 == 'U') {
                sb.append("*");
            } else {
                sb.append(n3);
            }
        }
        return sb.toString();
    }

}



        
        
        
        
        
        
    
    

