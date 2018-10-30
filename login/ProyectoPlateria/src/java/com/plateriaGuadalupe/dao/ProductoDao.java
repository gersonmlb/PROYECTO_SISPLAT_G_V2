
package com.plateriaGuadalupe.dao;

import com.plateriaGuadalupe.entity.Producto;
import java.util.List;


public interface ProductoDao {
    
    int create(Producto p);
    int update(Producto p);
    int delete(int key);
    Producto read(int key);
    List<Producto> ReadAll();
    boolean search(String pro);
    Producto NroProd();
    
}
