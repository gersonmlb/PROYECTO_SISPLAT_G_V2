package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.dao.UsuarioDao;
import pe.edu.upeu.Spring01.pojo.Accesos;
import pe.edu.upeu.Spring01.pojo.Compra;
import pe.edu.upeu.Spring01.pojo.Proveedor;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.AccesosService;
import pe.edu.upeu.Spring01.service.CompraService;
import pe.edu.upeu.Spring01.service.ControlService;
import pe.edu.upeu.Spring01.service.ProveedorService;
import pe.edu.upeu.Spring01.service.UsuarioService;

@Service
public class ProveedorImp implements ProveedorService{

	@Override
	public int create(Proveedor proveedor) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Proveedor read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
