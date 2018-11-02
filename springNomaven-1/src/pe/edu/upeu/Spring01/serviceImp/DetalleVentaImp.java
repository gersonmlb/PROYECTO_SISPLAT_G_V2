package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.dao.UsuarioDao;
import pe.edu.upeu.Spring01.pojo.Accesos;
import pe.edu.upeu.Spring01.pojo.Compra;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.AccesosService;
import pe.edu.upeu.Spring01.service.CompraService;
import pe.edu.upeu.Spring01.service.ControlService;
import pe.edu.upeu.Spring01.service.DetalleVentaService;
import pe.edu.upeu.Spring01.service.UsuarioService;

@Service
public class DetalleVentaImp implements DetalleVentaService{

	@Override
	public int create(DetalleVentaService detalleordcom) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DetalleVentaService detalleordcom) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DetalleVentaService read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DetalleVentaService> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
