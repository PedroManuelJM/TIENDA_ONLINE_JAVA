/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author JhoxiZZ
 */
public class detalle {
    private int id_detalle;
    private int id_producto;
    private int cantidad;
    private Double precio_total;
    Conexion conn;

    public detalle(int id_detalle, int id_producto, int cantidad, Double precio_total, Conexion conn) {
        this.id_detalle = id_detalle;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio_total = precio_total;
        this.conn = conn;
    }

    public detalle(Conexion conn) {
        this.conn = conn;
    }
    
    public int compararProducto (int id_venta, int id_producto){
        try {
            String query = "select cantidad from detalle where id_venta="+id_venta+" and id_producto="+id_producto;
            Statement sentencia = conn.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            int cantidad = 0;
            if(resultado.next()){
                cantidad = resultado.getInt("cantidad");
            }else{
                return 0;
            }
            conn.desconectar();
            return cantidad;
        } catch (SQLException ex) {
            System.out.println("Error en detalle.compararProducto: " + ex.getMessage());
        }
        return 0;
    }
}
