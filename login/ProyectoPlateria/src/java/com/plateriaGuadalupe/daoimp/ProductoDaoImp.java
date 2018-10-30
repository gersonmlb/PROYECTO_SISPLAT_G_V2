/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plateriaGuadalupe.daoimp;

import com.plateriaGuadalupe.entity.Producto;
import com.plateriaGuadalupe.dao.ProductoDao;
import com.plateriaGuadalupe.util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CRIRI
 */
public class ProductoDaoImp implements ProductoDao {
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;

    
    @Override
    public int create(Producto p){
        int x=0;
        try{
            cx= Conexion.getConexion();
            cs=cx.prepareCall("{call AddProducto(?,?,?,?)}");
            cs.setString(1, p.getNombre());
            cs.setDouble(2, p.getPrecio());
            cs.setInt(3, p.getStock());
            cs.setInt(4, p.getTipo());
            x= cs.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error"+e);
        }
        return x;
    }

    @Override
    public int update(Producto p) {
        int x=0;
        try {
            cx=Conexion.getConexion();
            cs= cx.prepareCall("{call UpdateProducto(?,?,?,?,?)}");
            cs.setString(1, p.getCodigo());
            cs.setString(2, p.getNombre());
            cs.setDouble(3, p.getPrecio());
            cs.setInt(4, p.getStock());
            cs.setInt(5, p.getTipo());
            x=cs.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error"+ex);
        }
        return x;
        
    }

    @Override
    public int delete(int key) {
        int x=0;
        try{
            cx=Conexion.getConexion();
            cs=cx.prepareCall("{call DeleteProducto(?)}");
            cs.setInt(1, key);
            x =cs.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error"+e);
        }
        return x;
    }

    @Override
    public Producto read(int key) {
        Producto p = new Producto();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call SearchProducto(?)}");
            cs.setInt(1, key); 
            rs = cs.executeQuery();
            while(rs.next()){
               p.setId(rs.getInt("PRO_ID"));
               p.setNombre(rs.getString("PRO_NOMBRE"));
               p.setPrecio(rs.getDouble("PRO_PRECIO"));
               p.setStock(rs.getInt("PRO_STOCK"));
               p.setTipo(rs.getInt("PRO_TIPO"));
               p.setCodigo(rs.getString("PRO_CODIGO"));
            }
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
        }
        return p;   
    }
    @Override
    public List<Producto> ReadAll() {
        List<Producto> pro = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call ListarProductos}");
            
            rs = cs.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setTipo(rs.getInt(5));
                p.setCodigo(rs.getString(6));
                pro.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return pro;   
    }

    @Override
    public boolean search(String pro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto NroProd() {
        Producto p = new Producto();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call NroProd()}");
            rs = cs.executeQuery();
            while(rs.next()){
               p.setNroProd(rs.getInt(1));
               
            }
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
        }
        return p;   
    }

}
