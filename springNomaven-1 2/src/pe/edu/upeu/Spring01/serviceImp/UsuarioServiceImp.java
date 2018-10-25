package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.dao.UsuarioDao;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService{
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public int create(Usuario user) throws SQLException {
		return usuarioDao.create(user);
	}

	@Override
	public int update(Usuario user) {
		// TODO Auto-generated method stub
		return usuarioDao.update(user);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.delete(id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}
}
