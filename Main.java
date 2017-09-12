/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Surek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Proceso hilo1 = new Proceso("Hilo 1");
        Proceso hilo2 = new Proceso("Hilo 2");
        hilo1.setMensaje("Sherki Hilo 1 ");
        hilo2.setMensaje("Sherki Hilo 2");
        
        
       hilo1.start();
       hilo2.start();
    }
    
}
