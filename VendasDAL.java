/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class VendasDAL {
    
    private static Connection con;
    private static ResultSet rsnav;
    
    public static void conecta(String _bd)
    {
        Erro.setErro(false);
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://" + _bd);
        }
        catch (Exception e)
        {
            Erro.setErro(e.getMessage());
        }
    }

    public static void desconecta()
    {
        Erro.setErro(false);
        try 
        {
            con.close();
        }
        catch (Exception e)
        {
            Erro.setErro(e.getMessage());
        }
    }
    
    public static void consultaCliente()
    {
        ResultSet rs;
        
        try {
            PreparedStatement st = con.prepareStatement("SELECT * FROM TabClientes WHERE cnpj=?");
            st.setString(1, Cliente.getCnpj());
            rs = st.executeQuery();
            if(rs.next())
            {
                Cliente.setNome(rs.getString("nome"));
            }
        } catch (Exception e) {
            Erro.setErro(e.getMessage());
        }
    }
    
    public static void geraRS()
    {
        Erro.setErro(false);
        try {
            PreparedStatement st = con.prepareStatement("SELECT * FROM TabVendasCliente WHERE cnpj=?");
            st.setString(1, Cliente.getCnpj());
            rsnav = st.executeQuery();
            
        } catch (Exception e) {Erro.setErro(e.getMessage());return;}
    }
    
    public static void getVendas()
    {
        Erro.setErro(false);
        try {
            
            if(rsnav.next())
            {
                VendasCliente.setData(rsnav.getString("data"));
                VendasCliente.setToneladas(rsnav.getString("toneladas"));
                VendasCliente.setValor(rsnav.getString("valor"));
            }
            else{Erro.setErro("impossível");}
            
        } catch (Exception e) {
            Erro.setErro(e.getMessage());
        }
    }
}
