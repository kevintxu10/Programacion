package org;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ProductoDAO {

    public static List<Producto> getProductos() {

        List<Producto> lista = new LinkedList<>();
        String sql = "SELECT * FROM producto";

        try (Connection conn = SqlDataManager.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                Producto p = new Producto(
                        rs.getInt("id"),
                        rs.getString("referencia"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getInt("tipo"),
                        rs.getInt("cantidad"),
                        rs.getDouble("precio"),
                        rs.getInt("descuento"),
                        rs.getInt("iva"),
                        rs.getBoolean("aplicarDto")
                );

                lista.add(p);
            }

        } catch (SQLException e) {
            System.err.println("Error SQL: " + e.getMessage());
        }

        return lista;
    }

    public static Producto getProducto(String referencia) {

        Producto p = null;
        String sql = "SELECT * FROM producto WHERE referencia=?";

        try (Connection conn = SqlDataManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, referencia);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p = new Producto(
                        rs.getInt("id"),
                        rs.getString("referencia"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getInt("tipo"),
                        rs.getInt("cantidad"),
                        rs.getDouble("precio"),
                        rs.getInt("descuento"),
                        rs.getInt("iva"),
                        rs.getBoolean("aplicarDto")
                );
            }

        } catch (SQLException e) {
            System.err.println("Error SQL: " + e.getMessage());
        }

        return p;
    }

    public static int insertarProducto(Producto p) {

        int res = -1;

        String sql = "INSERT INTO producto VALUES (NULL,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = SqlDataManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getReferencia());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getDescripcion());
            ps.setInt(4, p.getTipo());
            ps.setInt(5, p.getCantidad());
            ps.setDouble(6, p.getPrecio());
            ps.setInt(7, p.getDescuento());
            ps.setInt(8, p.getIva());
            ps.setBoolean(9, p.isAplicarDto());

            res = ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error insert: " + e.getMessage());
        }

        return res;
    }

    public static int eliminarProducto(String referencia) {

        int res = -1;
        String sql = "DELETE FROM producto WHERE referencia=?";

        try (Connection conn = SqlDataManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, referencia);
            res = ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error delete: " + e.getMessage());
        }

        return res;
    }
}
