/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plateriaGuadalupe.dao;

import com.plateriaGuadalupe.entity.Producto;
import com.plateriaGuadalupe.entity.Venta;


public interface VentaDao {
    int create(Venta v);
    Producto buscarProductoCodigo(String cod);
    Venta NroVenta();
}