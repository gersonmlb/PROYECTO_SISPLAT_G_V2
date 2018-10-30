
package com.plateriaGuadalupe.daoimp;

import com.plateriaGuadalupe.dao.detalleVentaDao;
import com.plateriaGuadalupe.entity.detalleVenta;
import com.plateriaGuadalupe.util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class detalleVentaDaoImp implements detalleVentaDao{
    
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(detalleVenta v) {
        int x=0;
        try{
            cx= Conexion.getConexion();
            cs=cx.prepareCall("{call AddDetalle(?,?,?)}");
            cs.setDouble(1, v.getPrecio());
            cs.setInt(2, v.getCantidad());
            cs.setString(3, v.getProducto());
            x= cs.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error"+e);
        }
        return x;
    }
    
    
}
