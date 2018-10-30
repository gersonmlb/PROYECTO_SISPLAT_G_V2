
package com.plateriaGuadalupe.daoimp;

import com.plateriaGuadalupe.dao.PagosDao;
import com.plateriaGuadalupe.entity.Pagos;
import com.plateriaGuadalupe.util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PagosDaoImp implements PagosDao{
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public int create(Pagos p) {
        int x=0;
        try{
            cx= Conexion.getConexion();
            cs=cx.prepareCall("{call AddPago(?,?,?)}");
            cs.setDouble(3, p.getImporte());
            cs.setString(1, p.getTipo());
            cs.setString(2, p.getSede());
            x= cs.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error"+e);
        }
        return x;
    }
    
}
