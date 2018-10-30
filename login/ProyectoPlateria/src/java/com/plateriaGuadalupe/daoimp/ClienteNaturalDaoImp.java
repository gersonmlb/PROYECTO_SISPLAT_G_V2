
package com.plateriaGuadalupe.daoimp;

import com.plateriaGuadalupe.dao.ClienteNaturalDao;
import com.plateriaGuadalupe.entity.ClienteNatural;
import com.plateriaGuadalupe.util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClienteNaturalDaoImp implements ClienteNaturalDao{
    
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(ClienteNatural cn) {
        int x=0;
        try{
            cx= Conexion.getConexion();
            cs=cx.prepareCall("{call AddClienteNatural(?,?,?)}");
            cs.setString(1, cn.getNombre());
            cs.setString(2, cn.getApellido());
            cs.setString(3, cn.getDNI());
            x= cs.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error"+e);
        }
        return x;
    }
    
}
