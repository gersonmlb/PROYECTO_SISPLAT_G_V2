package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.DetalleKardexProducto;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface DetalleVentaDao {
	public int create(DetalleVentaDao detalleordcom) throws SQLException;

	public int update(DetalleVentaDao detalleordcom);

	public int delete(int id);

	public DetalleVentaDao read(int id);

	public List<DetalleVentaDao> readAll();

}
