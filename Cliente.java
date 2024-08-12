/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private static String cnpj;
    private static String nome;
    
public Cliente(){}

    public static void setCnpj(String cnpj_){cnpj=cnpj_;}
    public static void setNome(String nome_){nome=nome_;}
    
    public static String getCnpj(){return cnpj;}
    public static String getNome(){return nome;}
}
