/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15;

/**
 *
 * @author Usuario
 */
public class VendasCliente {
    private static String codigo;
    private static String cnpj;
    private static String data;
    private static String toneladas;
    private static String valor;
    private static int totalv;
    private static int totalt;
    
public VendasCliente(){}

    public static void setCodigo(String codigo_){codigo=codigo_;}
    public static void setCnpj(String cnpj_){cnpj=cnpj_;}
    public static void setData(String data_){data=data_;}
    public static void setToneladas(String toneladas_){toneladas=toneladas_;}
    public static void setValor(String valor_){valor=valor_;}
    public static void setTotalV(int totalv_){totalv=totalv_;}
    public static void setTotalT(int totalt_){totalt=totalt_;}
    
    public static String getCodigo(){return codigo;}
    public static String getCnpj(){return cnpj;}
    public static String getData(){return data;}
    public static String getToneladas(){return toneladas;}
    public static String getValor(){return valor;}
    public static int getTotalV(){return totalv;}
    public static int getTotalT(){return totalt;}
    
}
