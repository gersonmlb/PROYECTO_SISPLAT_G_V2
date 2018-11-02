package pe.edu.upeu.Spring01.service;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.DetalleKardexProducto;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface DetalleOrdenCompraService {
	public int create(DetalleOrdenCompraService detalleordcom) throws SQLException;

	public int update(DetalleOrdenCompraService detalleordcom);

	public int delete(int id);

	public DetalleOrdenCompraService read(int id);

	public List<DetalleOrdenCompraService> readAll();

}
