/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15;

/**
 *
 * @author Usuario
 */
public class VendasBLL {
    
    public static void validaCNPJ()
    {
        Erro.setErro(false);
        if(Cliente.getCnpj().equals(""))
        {
            Erro.setErro("o CNPJ está vazio...");
        }
        else{
            VendasDAL.consultaCliente();
        }
    } 
    
    
}
