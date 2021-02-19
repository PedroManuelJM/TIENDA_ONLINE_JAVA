
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;


public class Reporteproducto_masvendido {
   
    private int id;
    private String marca;
    private String categoria;
    private String producto;
    private String descripcion;
    private double precio;
    private int total_cantidad;
    private int veces_compra;
    private String img;
    private int stock;

    Conexion conn;
    public Reporteproducto_masvendido() {
    }

    public Reporteproducto_masvendido(int id, String marca, String categoria, String producto, String descripcion, double precio, int total_cantidad, int veces_compra, String img, int stock) {
        this.id = id;
        this.marca = marca;
        this.categoria = categoria;
        this.producto = producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.total_cantidad = total_cantidad;
        this.veces_compra = veces_compra;
        this.img = img;
        this.stock = stock;
    }

    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTotal_cantidad() {
        return total_cantidad;
    }

    public void setTotal_cantidad(int total_cantidad) {
        this.total_cantidad = total_cantidad;
    }

    public int getVeces_compra() {
        return veces_compra;
    }

    public void setVeces_compra(int veces_compra) {
        this.veces_compra = veces_compra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public Reporteproducto_masvendido(Conexion conn) {
        this.conn = conn;
    }

       public LinkedList<Reporteproducto_masvendido> Reporte_productomasVendido(){
        try {
            conn.getConnection();
            String query = "SELECT * FROM reporte_productomasvendidos ";
            Statement sentencia = conn.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Reporteproducto_masvendido> reportesproducto_masvendido;
            reportesproducto_masvendido= new LinkedList<Reporteproducto_masvendido>();
            while(resultado.next()){
                Reporteproducto_masvendido r= new Reporteproducto_masvendido(); 
                r.setId(Integer.parseInt(resultado.getString("id")));
                r.setMarca(resultado.getString("marca"));
                r.setCategoria(resultado.getString("categoria"));
                r.setProducto(resultado.getString("producto"));
                r.setDescripcion(resultado.getString("descripcion"));
                r.setPrecio(Double.parseDouble(resultado.getString("precio")));
                r.setTotal_cantidad(Integer.parseInt(resultado.getString("total_cantidad")));
                r.setVeces_compra(Integer.parseInt(resultado.getString("veces_compra")));
                reportesproducto_masvendido.add(r);
            }
            conn.desconectar();
            return reportesproducto_masvendido;
        } catch (SQLException ex) {
            System.out.println("Error en Reporteproducto_masvendido.Reporte_productomasVendido: " + ex.getMessage());
        }
        return null;
    }
    
    public LinkedList<Reporteproducto_masvendido> ProductomasVendido(){
        try {
            String query = "SELECT * FROM reporte_productomasvendidos where stock>0 ORDER BY veces_compra DESC LIMIT 8";
            Statement sentencia = conn.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<Reporteproducto_masvendido> reportesproducto_masvendido;
            reportesproducto_masvendido= new LinkedList<Reporteproducto_masvendido>();
            while(resultado.next()){
                Reporteproducto_masvendido r= new Reporteproducto_masvendido(); 
                r.setId(Integer.parseInt(resultado.getString("id")));
                r.setMarca(resultado.getString("marca"));
                r.setCategoria(resultado.getString("categoria"));
                r.setProducto(resultado.getString("producto"));
                r.setDescripcion(resultado.getString("descripcion"));
                r.setPrecio(Double.parseDouble(resultado.getString("precio")));
                r.setTotal_cantidad(Integer.parseInt(resultado.getString("total_cantidad")));
                r.setVeces_compra(Integer.parseInt(resultado.getString("veces_compra")));
                r.setImg(resultado.getString("imagen"));
                r.setStock(Integer.parseInt(resultado.getString("stock")));
                reportesproducto_masvendido.add(r);
            }
            conn.desconectar();
            return reportesproducto_masvendido;
        } catch (SQLException ex) {
            System.out.println("Error en Reporteproducto_masvendido.ProductomasVendido: " + ex.getMessage());
        }
        return null;
    }
}