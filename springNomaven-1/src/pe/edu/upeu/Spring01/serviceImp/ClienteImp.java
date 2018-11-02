package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.dao.UsuarioDao;
import pe.edu.upeu.Spring01.pojo.Cliente;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.ClienteService;
import pe.edu.upeu.Spring01.service.UsuarioService;

@Service
public class ClienteImp implements ClienteService{

	@Override
	public int create(Cliente cliente) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cliente read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
