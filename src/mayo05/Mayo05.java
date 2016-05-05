/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayo05;

import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Mayo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CESUN Universidad");
        
        Scanner leer = new Scanner(System.in);
        String Cadena = "";
        int Numero = 0;
        
        System.out.print("Guardar la siguiente cadena:");
        Cadena = leer.next();
        System.out.println(Cadena);
        
    }
    
}
