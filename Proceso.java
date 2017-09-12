/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Surek
 */
public class Proceso extends Thread 
{

    public String mensaje;
    public Proceso (String msg)
    {
        super(msg);
    }
    
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
              System.out.println(mensaje); 
        }
         System.out.println("Este Proceso ha terminado "+ this.getName());
    }
    
    
    public void setMensaje(String msj)
    {
        this.mensaje = msj;
    }
}
