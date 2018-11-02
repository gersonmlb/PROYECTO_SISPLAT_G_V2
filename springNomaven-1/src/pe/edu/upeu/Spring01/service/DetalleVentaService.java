package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.DetalleKardexProducto;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface DetalleVentaService {
	public int create(DetalleVentaService detalleordcom) throws SQLException;

	public int update(DetalleVentaService detalleordcom);

	public int delete(int id);

	public DetalleVentaService read(int id);

	public List<DetalleVentaService> readAll();

}
