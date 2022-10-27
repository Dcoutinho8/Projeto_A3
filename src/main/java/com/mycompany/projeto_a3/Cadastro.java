
package com.mycompany.projeto_a3;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class Cadastro {

    /**
     * @return the compleEndeClint
     */
    public String getCompleEndeClint() {
        return compleEndeClint;
    }

    /**
     * @param compleEndeClint the compleEndeClint to set
     */
    public void setCompleEndeClint(String compleEndeClint) {
        this.compleEndeClint = compleEndeClint;
    }
    private int codigo;
    private String nomeClint;
    private String emailClint;
    private String dataNasc;
    private String cpfClint;
    private String cepClint;
    private String numEndeClint;
    private String telClint;
    private String senhaClint;
    private String compleEndeClint;
    private String confirmSenha;
    
    public void CriarCadastro(){
  
    }

    
    public String getNomeClint() {
        return nomeClint;
    }

    
    public void setNomeClint(String nomeClint) {
        this.nomeClint = nomeClint;
    }

   
    public String getEmailClint() {
        return emailClint;
    }

    
    public void setEmailClint(String emailClint) {
        this.emailClint = emailClint;
    }

    
    public String getDataNasc() {
        return dataNasc;
    }

    
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

   
    public String getCpfClint() {
        return cpfClint;
    }

    
    public void setCpfClint(String cpfClint) {
        this.cpfClint = cpfClint;
    }

    
    public String getcepClint() {
        return cepClint;
    }

    
    public void setcepClint(String cepClint) {
        this.cepClint = cepClint;
    }

    
    public String getTelClint() {
        return telClint;
    }

    
    public void setTelClint(String telClint) {
        this.telClint = telClint;
    }

   
    public String getSenhaClint() {
        return senhaClint;
    }

   
    public void setSenhaClint(String senhaClint) {
        this.senhaClint = senhaClint;
    
}

    
    public String getConfirmSenha() {
        return confirmSenha;
    }

   
   
    public String getNumEndeClint() {
        return numEndeClint;
    }

    
    public void setNumEndeClint(String numEndeClint) {
        this.numEndeClint = numEndeClint;
    }

    
    public int getCodigo() {
        return codigo;
    }

    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
        public void setConfirmSenha(String confirmSenha) {
        this.confirmSenha = confirmSenha;
    }
    public void inserir(){
        String sql = "INSERT INTO tb_cadastro (nomeClint, telClint, emailClint, dataNasc, cepClint, numEndClint, compleEndeClint, cpfClint) VALUE (?,?,?,?,?,?,?,?)";
        ConnectionFactory factory = new ConnectionFactory();  
        try(Connection c = factory.obtemConexao ()){
            PreparedStatement ps = c.prepareStatement (sql);
            ps.setString(1, getNomeClint());
            ps.setString(2,getTelClint());
            ps.setString(3, getEmailClint());
            ps.setString(4, getDataNasc());        
            ps.setString(5, getcepClint());
            ps.setString(6, getNumEndeClint());  
            ps.setString(7, getCompleEndeClint());  
            ps.setString(8, getCpfClint());
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
