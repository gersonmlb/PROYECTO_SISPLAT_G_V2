
package com.plateriaGuadalupe.daoimp;

import com.plateriaGuadalupe.dao.PersonaDao;
import com.plateriaGuadalupe.entity.Persona;
import com.plateriaGuadalupe.util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonaDaoImp implements PersonaDao{
    
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Persona p) {
        int x=0;
        try{
            cx= Conexion.getConexion();
            cs=cx.prepareCall("{call AddPersona(?,?,?)}");
            cs.setString(1, p.getNombres());
            cs.setString(2, p.getApeliidos());
            cs.setString(3, p.getDNI());
            x= cs.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error"+e);
        }
        return x;
    }

    @Override
    public Persona names(int d) {
        Persona pe= new Persona();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call SearchDniRuc(?)}");
            cs.setInt(1, d); 
            rs = cs.executeQuery();
            while(rs.next()){
               pe.setNombres(rs.getString(2));    
               pe.setId(rs.getInt(1));    
            }
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
        }
        return pe;  
    }
    
}
