package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Compra;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface CompraDao {
 public int create(Compra compra)throws SQLException;
 public int update(Compra compra);
 public int delete(int id);
 public Compra read(int id);
 public List<Compra> readAll();
}
