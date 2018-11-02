package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.dao.UsuarioDao;
import pe.edu.upeu.Spring01.pojo.Accesos;
import pe.edu.upeu.Spring01.pojo.Compra;
import pe.edu.upeu.Spring01.pojo.MateriaOrden;
import pe.edu.upeu.Spring01.pojo.Usuario;
import pe.edu.upeu.Spring01.service.AccesosService;
import pe.edu.upeu.Spring01.service.CompraService;
import pe.edu.upeu.Spring01.service.ControlService;
import pe.edu.upeu.Spring01.service.MateriaOrdenService;
import pe.edu.upeu.Spring01.service.UsuarioService;

@Service
public class MateriOrdenImp implements MateriaOrdenService{

	@Override
	public int create(MateriaOrden materiaorden) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MateriaOrden materiaorden) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MateriaOrden read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MateriaOrden> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
