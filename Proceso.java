/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gerardo Miguel Quechol Zarate
 */
import javax.swing.*;

public class Proceso extends Thread{
    private Cerradura c = new Cerradura();
    
    public void run(){
        while(true){
            if(c.IsCerrada()==false){
                System.out.println("La cerradura esta cerrada: ");
                System.out.println(c.IsCerrada());
                c.abrir();
            }else{
                System.out.println("La cerradura esta abierta: ");
                System.out.println(c.IsCerrada());
                c.cerrar();
                try{
                    Thread.sleep(2000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    
}
