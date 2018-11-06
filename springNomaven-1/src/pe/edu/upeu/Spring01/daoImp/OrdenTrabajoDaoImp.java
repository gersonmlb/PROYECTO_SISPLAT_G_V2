package pe.edu.upeu.Spring01.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.Spring01.dao.OrdenTrabajoDao;
import pe.edu.upeu.Spring01.pojo.OrdenTrabajo;
import pe.edu.upeu.Spring01.pojo.Usuario;

public class OrdenTrabajoDaoImp implements OrdenTrabajoDao{

	@Autowired
	private DataSource dataSource;
	
	@Override
	public int create(OrdenTrabajo ordentrabajo) throws SQLException {
		int x=0;
		Connection cx = null;
		try {
			cx = dataSource.getConnection();
			PreparedStatement ps = cx.prepareCall("");
			ps.setInt(1, ordentrabajo.getIdempleado());
			ps.setInt(2, ordentrabajo.getIdpedido());
			x = ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		} finally {
			if (cx != null) {
				cx.close();
			}
		}
		return x;
	}

	@Override
	public int update(OrdenTrabajo ordentrabajo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OrdenTrabajo read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrdenTrabajo> readAll() {
		Connection cx = null;
		List<OrdenTrabajo> ordentrabajo = new ArrayList<>();
		ResultSet rs;
		try {
			cx = dataSource.getConnection();
			PreparedStatement ps = cx.prepareCall("");
			rs = ps.executeQuery();
			while (rs.next()) {
				OrdenTrabajo orden = new OrdenTrabajo();
				orden.setCodigo(rs.getString(""));
				orden.setIdpedido(rs.getInt(""));
				orden.setCodigo(rs.getString(""));
				
			}
		} catch (Exception e) {
			System.out.println("Error1: " + e);
		}
		return ordentrabajo;
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
}
