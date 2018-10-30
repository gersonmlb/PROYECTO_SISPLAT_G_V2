
package com.plateriaGuadalupe.daoimp;

import com.plateriaGuadalupe.dao.ReportesDao;
import com.plateriaGuadalupe.entity.Reportes;
import com.plateriaGuadalupe.util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ReportesDaoImp implements ReportesDao{
    private CallableStatement cs;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public List<Reportes> ReadAll() {
        List<Reportes> rep = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cs = cx.prepareCall("{call ReporteProd6}");    
            rs = cs.executeQuery();
            while(rs.next()){
                Reportes repo = new Reportes();
                repo.setId(rs.getInt(1));
                repo.setNombre(rs.getString(2));
                repo.setCantidad(rs.getInt(3));
                
                rep.add(repo);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return rep;   
    }
    
}
