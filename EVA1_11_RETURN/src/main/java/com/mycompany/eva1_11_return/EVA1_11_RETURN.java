
package com.mycompany.eva1_11_return;
public class EVA1_11_RETURN {

    public static void main(String[] args) {
        int resu;
        resu = square(10);//invocacion o llamada a funcion 
        System.out.println(resu);
    }
    
    public static int square(int num){
       return num * num;
    }
}
