/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Juxn
 */
public class venta {
    private int id_venta;
    private int id_usuario;
    private int id_producto;
    private String nom_pro;
    private String carac;
    private String imagen;
    private float p_unitario;
    private int canti_producto;
    private int c_comprada;
    private float preciostotal;
    private String fecha;
    private String hora;
    private String estado;
    Conexion conn;
    private double pre_total;

    public venta(String nom_pro, String carac, int c_comprada, float p_unitario, float preciostotal) {
        this.nom_pro = nom_pro;
        this.carac = carac;
        this.c_comprada = c_comprada;
        this.p_unitario = p_unitario;
        this.preciostotal = preciostotal;
    }

    
    
    public venta(Conexion conn) {
        this.conn = conn;
    }
    
    public venta() {
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_pro() {
        return nom_pro;
    }

    public void setNom_pro(String nom_pro) {
        this.nom_pro = nom_pro;
    }

    public String getCarac() {
        return carac;
    }

    public void setCarac(String carac) {
        this.carac = carac;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public float getP_unitario() {
        return p_unitario;
    }

    public void setP_unitario(float p_unitario) {
        this.p_unitario = p_unitario;
    }

    public int getCanti_producto() {
        return canti_producto;
    }

    public void setCanti_producto(int canti_producto) {
        this.canti_producto = canti_producto;
    }

    public int getC_comprada() {
        return c_comprada;
    }

    public void setC_comprada(int c_comprada) {
        this.c_comprada = c_comprada;
    }

    public float getPreciostotal() {
        return preciostotal;
    }

    public void setPreciostotal(float preciostotal) {
        this.preciostotal = preciostotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPre_total() {
        return pre_total;
    }

    public void setPre_total(double pre_total) {
        this.pre_total = pre_total;
    }

    

    
        ////////listas venta
public LinkedList<venta> ventalista(){
        try {
            conn = new Conexion();
            String query =  "select\n" +
                            "venta.id_venta as 'id_venta',\n" +
                            "venta.id_usuario as 'id_usuario',\n" +
                            "productos.id_producto as ' id_producto',\n" +
                            "productos.nombre as 'nom_pro', \n" +
                            "productos.caracteristica as 'carac',\n" +
                            "productos.precio as 'p_unitario',\n" +
                            "productos.stock as 'canti_producto',\n" +
                            "productos.img_producto as 'imagen',\n" +
                            "detalle.cantidad as 'c_comprada',\n" +
                            "detalle.precio_total as 'preciostotal',\n" +
                            "venta.fecha as 'fecha',\n" +
                            "venta.hora as 'hora',\n" +
                            "venta.estado as 'estado'\n" +
                            "from VENTA\n" +
                            "INNER JOIN detalle on venta.id_venta=detalle.id_venta\n" +
                            "INNER JOIN productos ON productos.id_producto=detalle.id_producto ;";
            Statement sentencia = conn.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            LinkedList<venta> lista6;
            lista6 = new LinkedList<venta>();
            while(resultado.next()){
                venta ven = new venta();
                ven.setId_venta(resultado.getInt("id_venta"));
                ven.setId_usuario(Integer.parseInt(resultado.getString("id_usuario")));
                ven.setId_producto(resultado.getInt("id_producto"));
                ven.setNom_pro(resultado.getString("nom_pro"));
                ven.setCarac(resultado.getString("carac"));
                ven.setImagen(resultado.getString("imagen"));
                ven.setP_unitario(resultado.getFloat("p_unitario"));
                ven.setCanti_producto(resultado.getInt("canti_producto"));
                ven.setC_comprada(resultado.getInt("c_comprada"));
                ven.setPreciostotal(resultado.getFloat("preciostotal"));
                ven.setFecha(resultado.getString("fecha"));
                ven.setHora(resultado.getString("hora"));
                ven.setEstado(resultado.getString("estado"));
                lista6.add(ven);
            }
            conn.desconectar();
            return lista6;
        } catch (SQLException ex) {
            System.out.println("Error en venta.ventalista: " + ex.getMessage());
        }
        return null;
    }

    public venta buscarVentaEnProcedo(int id_usuario){
        try {
            String query =  "select id_venta, id_usuario, fecha, hora, estado from venta where id_usuario="+id_usuario+" and estado='proceso'";
            Statement sentencia = conn.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            venta v = new venta();
            while(resultado.next()){            
                v.setId_venta(resultado.getInt("id_venta"));
                v.setId_usuario(Integer.parseInt(resultado.getString("id_usuario")));
                v.setFecha(resultado.getString("fecha"));
                v.setHora(resultado.getString("hora"));
                v.setEstado(resultado.getString("estado"));
            }
            return v;
        } catch (SQLException ex) {
            System.out.println("Error en venta.buscarVentaEnProcedo: " + ex.getMessage());
        }
        return null;
    }

      ////////////////AGREGAR VENTA
      public int Addventa(int id_usuario,String fecha,String hora,String estado){
          try {
                String sql="INSERT INTO VENTA VALUES(0,?,?,?,?)";
                PreparedStatement von=conn.getConnection().prepareStatement(sql);
                von.setInt(1,id_usuario);
                von.setString(2,fecha);
                von.setString(3,hora);
                von.setString(4,estado);
                von.executeUpdate();
                von.close();
                String sql2="select MAX(id_venta) from venta where id_usuario="+id_usuario;
                Statement sentencia = conn.getConnection().createStatement();
                ResultSet resultado = sentencia.executeQuery(sql2);
                int id_venta=0;
                if(resultado.next()){
                    id_venta = resultado.getInt("MAX(id_venta)");
                }
                return id_venta;
          } catch (SQLException ex) {
            System.out.println("Error en venta.Addventa: " + ex.getMessage());
        }
          return 0;
      }
      ////////////////EDITAR VENTA
      public void updateventa(int id_venta, int id_usuario,String fecha,String hora,String estado){
          try {
                String query = "UPDATE VENTA SET ";
                query = query + "fecha=?, ";
                query = query + "hora=?, ";
                query = query + "estado=? ";
                query = query + "WHERE id_venta=? ";
                query = query + "AND id_usuario=? ";
                PreparedStatement von=conn.getConnection().prepareStatement(query);
                von.setString(1,fecha);
                von.setString(2,hora);
                von.setString(3,estado);
                von.setInt(4,id_venta);
                von.setInt(5,id_usuario);
                von.executeUpdate();
                von.close();
                conn.desconectar();
          } catch (SQLException ex) {
            System.out.println("Error en venta.updateventa: " + ex.getMessage());
        }
      }
     
      public LinkedList<venta> buscarCantidadDetalle(int id_venta){
        try {
            String query =  "select id_producto, cantidad from detalle where id_venta="+id_venta;
            Statement sentencia = conn.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(query);           
            LinkedList<venta> venta = new LinkedList<>();
            while(resultado.next()){
                venta ven = new venta();
                ven.setId_producto(resultado.getInt("id_producto"));
                ven.setC_comprada(resultado.getInt("cantidad"));
                venta.add(ven);
            }
            conn.desconectar();
            return venta;
        } catch (SQLException ex) {
            System.out.println("Error en venta.buscarCantidadDetalle: " + ex.getMessage());
        }
        return null;
    }
     
      
    
    public LinkedList<venta> buscarPedidosCliente(int id_usuario){
        try {
            String query = "select * from vista2  where id_us="+id_usuario;
                    
            Statement sentencia = conn.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(query);           
            LinkedList<venta> venta = new LinkedList<>();
            while(resultado.next()){
                venta ven = new venta();
                ven.setId_venta(resultado.getInt("id_venta"));
                ven.setFecha(resultado.getString("fecha"));
                ven.setHora(resultado.getString("hora"));
                ven.setId_usuario(resultado.getInt("id_us"));
                ven.setC_comprada(resultado.getInt("cantidad_productos"));
                ven.setPre_total(resultado.getDouble("total"));
                ven.setEstado(resultado.getString("estado"));
                venta.add(ven);
            }
            conn.desconectar();
            return venta;
        } catch (SQLException ex) {
            System.out.println("Error en venta. buscarPedidosCliente: " + ex.getMessage());
        }
        return null;
    }
      
      
      
}
