package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Compra_Producto;
import com.example.demo.Entity.Producto;

public interface CompraProductoRepository extends JpaRepository  <Compra_Producto, Long>{

}
