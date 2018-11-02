package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.dao.UsuarioDao;
import pe.edu.upeu.Spring01.pojo.Accesos;
import pe.edu.upeu.Spring01.pojo.Compra;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.pojo.Venta;
import pe.edu.upeu.Spring01.service.AccesosService;
import pe.edu.upeu.Spring01.service.CompraService;
import pe.edu.upeu.Spring01.service.ControlService;
import pe.edu.upeu.Spring01.service.UsuarioService;
import pe.edu.upeu.Spring01.service.VentaService;

@Service
public class VentaImp implements VentaService{

	@Override
	public int create(Venta venta) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Venta venta) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Venta read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venta> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
