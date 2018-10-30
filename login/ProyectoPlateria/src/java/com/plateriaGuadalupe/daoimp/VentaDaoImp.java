
package com.plateriaGuadalupe.daoimp;

import com.plateriaGuadalupe.dao.VentaDao;
import com.plateriaGuadalupe.entity.Producto;
import com.plateriaGuadalupe.entity.Venta;
import com.plateriaGuadalupe.util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class VentaDaoImp implements VentaDao{
    
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Venta v) {
         int x=0;
        try{
            cx= Conexion.getConexion();
            cs=cx.prepareCall("{call AddVenta(?,?,?,?,?)}");
            cs.setString(1, v.getCliente());
            cs.setString(2, v.getDocumento());
            cs.setString(3, v.getUsuario());
            cs.setString(4, v.getSede());
            cs.setString(5, v.getTotal());
            x= cs.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error"+e);
        }
        return x;
    }

    @Override
    public Producto buscarProductoCodigo(String cod) {
        Producto p = new Producto();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call SearchProductoCodigo(?)}");
            cs.setString(1, cod);
            rs = cs.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt("PRO_ID"));
                p.setNombre(rs.getString("PRO_NOMBRE"));
                p.setPrecio(rs.getDouble("PRO_PRECIO"));
                p.setStock(rs.getInt("PRO_STOCK"));
                p.setCodigo(rs.getString("PRO_CODIGO"));
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return p;
    }

    @Override
    public Venta NroVenta() {
        Venta v = new Venta();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call NroVentas()}");
            rs = cs.executeQuery();
            while(rs.next()){
               v.setRepNroVenta(rs.getInt(1));
               
            }
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
        }
        return v;   
    }
    
}
