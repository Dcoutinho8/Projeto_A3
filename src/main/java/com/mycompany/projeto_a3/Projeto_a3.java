
package com.mycompany.projeto_a3;

import javax.swing.JOptionPane;


public class Projeto_a3 {

    public static void main(String[] args) {
        String menu = "1- Cadastrar\n2- Atualizar\n3- Apagar\n0- Sair";
        int op; 
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog (menu));
            switch (op){
                case 1: {
                    String nome = JOptionPane.showInputDialog("Qual é o seu nome completo?");
                    String fone = JOptionPane.showInputDialog("Qual é o número de telefone?");
                    String email = JOptionPane.showInputDialog("Qual é o email?");
                    String dataNasci = JOptionPane.showInputDialog("Qual a sua data de nascimento?");
                    String cep = JOptionPane.showInputDialog("Qual é o CEP?");
                    String numeroEndereco = JOptionPane.showInputDialog("Qual é o numero do seu endereço?");
                    String complementoEndereco = JOptionPane.showInputDialog("Complemento da sua residencia ?");
                    String cpf = JOptionPane.showInputDialog("Informe o seu CPF?");
                    Usuario c = new Usuario ();
                    c.setNomeClint(nome);
                    c.setTelClint(fone);
                    c.setEmailClint(email);
                    c.setDataNasc(dataNasci);
                    c.setcepClint(cep);
                    c.setNumEndeClint(numeroEndereco);
                    c.setCompleEndeClint(complementoEndereco);
                    c.setCpfClint(cpf);
                    c.inserir ();                                     
                    
                    break;
                }
                case 2:
                    break;
                case 3:
                    break;
                case 4: 
                    break;
                case 0: 
                    break;
                default : 
                JOptionPane.showMessageDialog(null,"opção inválida");
            }
            
        }while (op != 0 );        
        
    }
}
