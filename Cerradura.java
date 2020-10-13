/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gerardo Miguel Quechol Zarate
 */
public class Cerradura {
    private boolean cerradura=false;
    
    
    //ACCIONES
    public void cerrar (){
        cerradura = false;
    }
    
    public void abrir (){
        cerradura = true;
    }
    
    public boolean IsCerrada(){
        return cerradura;
    }
    
    //GETERS Y SETERS
    /**
     * @return the cerradura
     */
    public boolean isCerradura() {
        return cerradura;
    }

    /**
     * @param cerradura the cerradura to set
     */
    public void setCerradura(boolean cerradura) {
        this.cerradura = cerradura;
    }
    
}

