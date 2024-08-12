/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15;

/**
 *
 * @author Usuario
 */
public class Erro {
    private static boolean erro;
    private static String mens;
    
public Erro(){}
        
    public static void setErro(boolean erro_){erro=erro_;}
    public static void setErro(String mens_){erro=true;mens=mens_;}
    
    public static boolean getErro(){return erro;}
    public static String getMens(){return mens;}
}
