package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;

import pe.edu.upeu.Spring01.pojo.Empleado;
import pe.edu.upeu.Spring01.pojo.EmpleadoAcceso;
import pe.edu.upeu.Spring01.pojo.KardexProducto;
import pe.edu.upeu.Spring01.pojo.MateriaOrden;
import pe.edu.upeu.Spring01.pojo.User;
import pe.edu.upeu.Spring01.pojo.Usuario;

public interface UserDao {
 public int create(User user)throws SQLException;
 public int update(User user);
 public int delete(int id);
 public User read(int id);
 public List<User> readAll();
}
