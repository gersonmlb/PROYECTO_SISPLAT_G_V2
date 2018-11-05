package pe.edu.upeu.Spring01.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.Spring01.dao.HojaContratoDao;
import pe.edu.upeu.Spring01.pojo.HojaContrato;

public class HojaContratoDaoImp implements HojaContratoDao {
	@Autowired
	private DataSource dataSource;

	@Override
	public int create(HojaContrato hojacontrato) throws SQLException {
		int x = 0;
		Connection cx = null;
		try {
			cx = dataSource.getConnection();
			PreparedStatement ps = cx.prepareCall("{call asa(?,?,?)}");
			// prepareStatement("insert into usuario(idusuario, nom_user,clave,estado)
			// values(null,?,?,1)");
			ps.setInt(1, hojacontrato.getIdempleado());
			ps.setInt(2, hojacontrato.getIdpedido());
			ps.setDouble(3, hojacontrato.getTotal());
			ps.setDouble(4, hojacontrato.getAdelanto());
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
	public int update(HojaContrato hojacontrato) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HojaContrato read(int id) {
		Connection cx = null;
		HojaContrato hojacontrato = new HojaContrato();
		try {
			cx = dataSource.getConnection();
			PreparedStatement ps = cx.prepareCall("{call asa(?,?,?)}");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				hojacontrato.setIdempleado(rs.getInt(""));
				hojacontrato.setCodigo(rs.getString(""));
				hojacontrato.setFecha(rs.getString(""));
				
			}

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return hojacontrato;
	}

	@Override
	public List<HojaContrato> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
