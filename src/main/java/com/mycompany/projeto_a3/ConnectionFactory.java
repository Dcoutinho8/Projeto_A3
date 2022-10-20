
package com.mycompany.projeto_a3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
     private String usuario = "root";
     private String senha = "coutti0803";
     private String host = "localhost"; 
     private String porta = "3306";
     private String bd = "db_cadastro";
     
     public Connection obtemConexao (){ 
         try{ 
             //"jbdc:mysql://localhost:3306/db_cadastro
             Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd , usuario, senha);
                return c;
            }catch(SQLException e){ 
                return null;  
            }
         
        }
    
}
