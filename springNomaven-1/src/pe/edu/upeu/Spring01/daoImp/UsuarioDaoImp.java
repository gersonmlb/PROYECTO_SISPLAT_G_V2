package pe.edu.upeu.Spring01.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Spring01.dao.UsuarioDao;
import pe.edu.upeu.Spring01.pojo.Usuario;

@Repository
public class UsuarioDaoImp implements UsuarioDao {
	@Autowired
	private DataSource dataSource;

	@Override
	public int create(Usuario user) throws SQLException {
		int x = 0;
		Connection cx = null;
		try {
			cx = dataSource.getConnection();
			PreparedStatement ps = cx
					.prepareStatement("insert into usuario(idusuario, nom_user,clave,estado) values(null,?,?,1)");
			ps.setString(1, user.getNomuser());
			ps.setString(2, user.getClave());
			x = ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		} finally {
			if (cx != null) {
				cx.close();
			}
		}
		return x;
	}

	@Override
	public int update(Usuario user) {
		// TODO Auto-generated method stub
		int x = 0;
		Connection cx = null;
		try {
			cx = dataSource.getConnection();
			PreparedStatement ps = cx
					.prepareStatement("UPDATE usuario SET nom_user=?, clave=?, estado=? WHERE idusuario=?");
			ps.setString(1, user.getNomuser());
			ps.setString(2, user.getClave());
			ps.setString(3, user.getEstado());
			ps.setInt(4, user.getIduser());
			x = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error: " + e);// TODO: handle exception
		}
		return x;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		int x = 0;
		Connection cx = null;
		try {
			cx = dataSource.getConnection();
			PreparedStatement ps = cx.prepareStatement("DELETE FROM usuario WHERE idusuario=?");
			ps.setInt(1, id);
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		Connection cx = null;
		Usuario u = new Usuario();
		try {
			cx = dataSource.getConnection();
			PreparedStatement ps = cx.prepareStatement("select *from usuario where idusuario=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u.setIduser(rs.getInt("idusuario"));
				u.setNomuser(rs.getString("nom_user"));
				u.setClave(rs.getString("clave"));
				u.setEstado(rs.getString("estado"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return u;
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		Connection cx = null;
		List<Usuario> lista = new ArrayList<>();
		ResultSet rs;
		try {
			cx = dataSource.getConnection();
			PreparedStatement ps = cx.prepareStatement("select *from usuario");
			rs = ps.executeQuery();
			while (rs.next()) {
				Usuario u = new Usuario();
				u.setIduser(rs.getInt("idusuario"));
				u.setNomuser(rs.getString("nom_user"));
				u.setClave(rs.getString("clave"));
				u.setEstado(rs.getString("estado"));
				lista.add(u);
			}
		} catch (Exception e) {
			System.out.println("Error1: " + e);
		}
		return lista;
	}

}
