package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestionTareas {

    public void insertar(String desc, String asig) {
        String sql = "INSERT INTO tareas (descripcion, asignatura) VALUES (?, ?)";
        try (Connection con = SQLDataBaseManager.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, desc);
            ps.setString(2, asig);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Tarea> obtenerTodas() {
        List<Tarea> lista = new ArrayList<>();
        String sql = "SELECT * FROM tareas";
        try (Connection con = SQLDataBaseManager.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Tarea(rs.getInt("id"), rs.getString("descripcion"), rs.getString("asignatura")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM tareas WHERE id = ?";
        try (Connection con = SQLDataBaseManager.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
