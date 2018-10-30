
package com.plateriaGuadalupe.daoimp;

import com.plateriaGuadalupe.dao.UserDao;
import com.plateriaGuadalupe.entity.User;
import com.plateriaGuadalupe.util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class UserDaoImp implements UserDao{
    
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(User u) {
         int x=0;
        try{
            cx= Conexion.getConexion();
            cs=cx.prepareCall("{call AddUsuario(?,?,?,?,?,?,?,?)}");
            cs.setString(1, u.getNombre());
            cs.setString(2, u.getApellido());
            cs.setString(3, u.getDNI());
            cs.setString(4, u.getUser());
            cs.setString(5, u.getPass());
            cs.setString(6, u.getEmail());
            cs.setString(7, u.getDireccion());
            cs.setInt(8, u.getRol());
            x= cs.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error"+e);
        }
        return x;
    }

    @Override
    public List<User> ReadAll() {
        List<User> pro = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call ListarUsuario}");
            
            rs = cs.executeQuery();
            while(rs.next()){
                User u = new User();
                u.setNombre(rs.getString(2));
                u.setApellido(rs.getString(3));
                u.setDNI(rs.getString(4));
                u.setRol(rs.getInt(6));
                u.setUser(rs.getString(7));
                u.setPass(rs.getString(8));
                u.setDireccion(rs.getString(9));
                u.setEmail(rs.getString(10));
                pro.add(u);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return pro;   
    }

    @Override
    public User read(int key) {
        User u = new User();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call SearchUser(?)}");
            cs.setInt(1, key); 
            rs = cs.executeQuery();
            while(rs.next()){
               u.setUser(rs.getString(1));
               u.setPass(rs.getString(2));
               u.setDireccion(rs.getString(3));
               u.setEmail(rs.getString(4));
               u.setRol(rs.getInt(5));
               u.setNombre(rs.getString(6));
               u.setApellido(rs.getString(7));
               u.setDNI(rs.getString(8));
            }
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
        }
        return u;   
    }

    @Override
    public int update(User u) {
        int x=0;
        try {
            cx=Conexion.getConexion();
            cs= cx.prepareCall("{call UpdateUser(?,?,?,?,?,?,?)}");
            cs.setString(1, u.getNombre());
            cs.setString(2, u.getApellido());
            cs.setString(3, u.getDNI());
            cs.setString(4, u.getUser());
            cs.setString(5, u.getPass());
            cs.setString(6,u.getDireccion());
            cs.setString(7, u.getEmail());
            x=cs.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error"+ex);
        }
        return x;
    }

    @Override
    public int delete(String key) {
       int x=0;
        try{
            cx=Conexion.getConexion();
            cs=cx.prepareCall("{call DeleteUser(?)}");
            cs.setString(1, key);
            x =cs.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error"+e);
        }
        return x;
    }

    @Override
    public HashMap<String, Object> validar(String x, String y, String z) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call ValidateUser(?,?,?)}");
            cs.setString(1, x);
            cs.setString(2, y);
            cs.setString(3, z);
            rs = cs.executeQuery();
            while(rs.next()){                
                map.put("nom", rs.getString(1));
                map.put("ape", rs.getString(2));
                map.put("user", rs.getString(3));
                map.put("rol", rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return map;
    }

    @Override
    public User Remember(String email) {
        User u = new User();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call NotRememberPass(?)}");
            cs.setString(1, email); 
            rs = cs.executeQuery();
            while(rs.next()){
               u.setEmail(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
        }
        return u;   
    }

    @Override
    public User validar2(String x, String y, String z) {
        User u = new User();
         try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call ValidateUser(?,?,?)}");
            cs.setString(1, x);
            cs.setString(2, y);
            cs.setString(3, z);
            rs = cs.executeQuery();
            while(rs.next()){                
                u.setNombre(rs.getString(1));
                u.setApellido(rs.getString(2));
                u.setUser(rs.getString(3));
                u.setRol(rs.getInt(4));
               
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return u;
    }

    @Override
    public User NroUser() {
        User user = new User();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call NroUser()}");
            rs = cs.executeQuery();
            while(rs.next()){
               user.setNroUser(rs.getInt(1));
               
            }
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
        }
        return user;  
    }
    
}
