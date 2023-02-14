/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_television;
import javax.swing.JOptionPane;
public class control {
    private int vol;
    private int canal;
    private boolean onof;
    int d = 0;
    
    public control(){
    vol = 0;
    canal = 99;
    onof = false;
   }
    
    public void apagarEncender(){
        d=Integer.parseInt(JOptionPane.showInputDialog("Quiere encender la tv?       1=Si  2=No"));
        if(d==2){
            onof=false;
            System.out.println("TV Apagada");
        }else if(d==1){
            onof=true;
            System.out.println("Encendiendo");
        }
    }
    
    public void subirVolumen(){
        
        if(d==1){
            onof=true;
            if(vol<100){
                vol++;
            
            }
            System.out.println("Volumen = " + vol);
            
            
        }else if(d==2){
            
        }
    }
    
    public void bajarVolumen(){
        
        if(d==2){
            onof=true;
            if(vol>0){
            vol--;
            
            }
            System.out.println("Volumen = " + vol);
        }else if(d==1){
           
        }
            
        
    }
    
    public void subirCanal(){
        if(d==1){
            onof=true;
            canal++;
            if(canal>100){
                canal=0;
            }
            System.out.println("Esta en el canal: " + canal);
        }else if(d==2){
            
        }
    }
     public void bajarCanal(){
         if(d==1){
             onof=true;
             canal--;
             if(canal<0){
                 canal=100;
             }
             System.out.println("Esta en el canal: " + canal);
         }else if(d==2){
             
         }
     }
        
}


