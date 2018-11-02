package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.dao.UsuarioDao;
import pe.edu.upeu.Spring01.pojo.Accesos;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.AccesosService;
import pe.edu.upeu.Spring01.service.UsuarioService;

@Service
public class AccesosImp implements AccesosService{

	@Override
	public int create(Accesos accesos) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Accesos accesos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Accesos read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Accesos> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
