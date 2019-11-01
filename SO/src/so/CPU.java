/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author haobr
 */
public class CPU {
     ArrayList<Procesos> LitaProceso =new ArrayList<>();
     public static void main(String[] args) {
        int num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el num de procesos : "));
        ArrayList<Procesos> process=new ArrayList<>();
        for (int i=1; i<=num1;i++){
            Procesos abc= new Procesos(i);
            process.add(abc);
        }
        AdministradorCola admin =new AdministradorCola();
        Scheduler sched=new Scheduler();
        Procesos p=new Procesos();
        ArrayList<Procesos> ColaListos=new ArrayList<>();
        PCB pcb=new PCB();
   
        
          

              
        
        
    // metodo que compara el tamaño de  cola process si es cero sedebe terminar el proceso
        for (int i=0; i<=100;i++){
            
            ColaListos=admin.adminCola(process,ColaListos, i);
            p=sched.Pnext(ColaListos,  "FCFS");
            

            
            
     
        }
        
        
        
         
         
         
            

        
    }
    
    
 
    
}
