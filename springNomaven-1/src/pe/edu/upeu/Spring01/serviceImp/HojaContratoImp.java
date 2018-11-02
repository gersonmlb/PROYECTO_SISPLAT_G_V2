package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.dao.UsuarioDao;
import pe.edu.upeu.Spring01.pojo.Accesos;
import pe.edu.upeu.Spring01.pojo.Compra;
import pe.edu.upeu.Spring01.pojo.HojaContrato;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.AccesosService;
import pe.edu.upeu.Spring01.service.CompraService;
import pe.edu.upeu.Spring01.service.ControlService;
import pe.edu.upeu.Spring01.service.HojaContratoService;
import pe.edu.upeu.Spring01.service.UsuarioService;

@Service
public class HojaContratoImp implements HojaContratoService{

	@Override
	public int create(HojaContrato hojacontrato) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HojaContrato> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
