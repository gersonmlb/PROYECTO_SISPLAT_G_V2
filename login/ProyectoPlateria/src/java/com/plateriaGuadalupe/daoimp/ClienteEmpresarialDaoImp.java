
package com.plateriaGuadalupe.daoimp;

import com.plateriaGuadalupe.dao.ClienteEmpresarialDao;
import com.plateriaGuadalupe.entity.ClienteEmpresarial;
import com.plateriaGuadalupe.util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClienteEmpresarialDaoImp implements ClienteEmpresarialDao{
    
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(ClienteEmpresarial CE) {
        int x=0;
        try{
            cx= Conexion.getConexion();
            cs=cx.prepareCall("{call AddClienteEmpresarial(?,?,?,?)}");
            cs.setString(1, CE.getRazso());
            cs.setInt(2, CE.getRuc());
            cs.setString(3, CE.getDireccion());
            cs.setInt(4, CE.getTelefono());
            x= cs.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error"+e);
        }
        return x;
    }
    
}
