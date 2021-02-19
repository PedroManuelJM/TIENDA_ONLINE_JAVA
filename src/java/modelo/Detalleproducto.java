/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author PCGAMING
 */
public class Detalleproducto {
    private int id;
    private String producto;
    private int cantidad;
    private Double precio;
    private Double precio_unitario;
    Conexion conn;
    public Detalleproducto() {
    }

    public Detalleproducto(int id, String producto, int cantidad, Double precio, Double precio_unitario) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.precio_unitario = precio_unitario;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Detalleproducto(Conexion conn) {
        this.conn = conn;
    }
    
    

       public LinkedList<Detalleproducto> Detalleproductoss(){
        try {
            conn.getConnection();
            String query = "SELECT * FROM reporte_productodet ";
            Statement sentencia = conn.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Detalleproducto> reportesdetalles;
            reportesdetalles = new LinkedList<Detalleproducto>();
            while(resultado.next()){
                Detalleproducto r= new Detalleproducto(); 
                r.setId(Integer.parseInt(resultado.getString("id_venta")));
                r.setProducto(resultado.getString("productos"));
                r.setCantidad(Integer.parseInt(resultado.getString("cantidad")));
                r.setPrecio(Double.parseDouble(resultado.getString("precio")));
                r.setPrecio_unitario(Double.parseDouble(resultado.getString("precio_unitario")));
                reportesdetalles.add(r);
            }
            conn.desconectar();
            return reportesdetalles;
        } catch (SQLException ex) {
            System.out.println("Error en Detalleproducto.Detalleproductoss: " + ex.getMessage());
        }
        return null;
    }
    
}
