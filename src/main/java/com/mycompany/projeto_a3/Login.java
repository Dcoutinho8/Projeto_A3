
package com.mycompany.projeto_a3;


public class Login {
         public void RealizarLogin(){
    Cadastro seuLogin = new Cadastro();
    seuLogin.getEmailClint();
    seuLogin.getSenhaClint();
        
    }
     public void loginTimer(){
        int cc = 30 ;
            while (cc > 0){
            System.out.println(cc + " Seg");
            cc--;
        }
    }
    
}
