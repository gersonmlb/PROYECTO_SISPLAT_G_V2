package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.dao.UsuarioDao;
import pe.edu.upeu.Spring01.pojo.Accesos;
import pe.edu.upeu.Spring01.pojo.Compra;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.AccesosService;
import pe.edu.upeu.Spring01.service.CompraService;
import pe.edu.upeu.Spring01.service.ControlService;
import pe.edu.upeu.Spring01.service.EmpleadoAccesoService;
import pe.edu.upeu.Spring01.service.UsuarioService;

@Service
public class EmpleadoAcessoImp implements EmpleadoAccesoService{

	@Override
	public int create(EmpleadoAcceso empleadoacceso) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(EmpleadoAcceso empleadoacceso) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmpleadoAcceso read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmpleadoAcceso> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
