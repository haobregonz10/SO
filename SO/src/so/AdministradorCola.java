/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import java.util.ArrayList;

/**
 *
 * @author haobr
 */
public class AdministradorCola {
  
    public ArrayList<Procesos> adminCola(ArrayList<Procesos> process,ArrayList<Procesos> ColaL, int time ){
         
         for(Procesos p: process){

         if(time==p.getTiempoArribo()){
             p.setEstado("Listo");
             System.out.println(p.id);
             ColaL.add(p);
             
         } 
   
  
    }
      return ColaL ;     
    }
    }   

