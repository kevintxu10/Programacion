package org.example;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TareaDao {

    public void insertar(Tarea tarea) {
        String sql = "INSERT INTO tareas (descripcion, asignatura, completada) VALUES (?, ?, ?)";

        try (Connection con = SQLDataBaseManager.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, tarea.getDescripcion());
            ps.setString(2, tarea.getAsignatura());
            ps.setBoolean(3, tarea.isCompletada());

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
                lista.add(new Tarea(
                        rs.getInt("id"),
                        rs.getString("descripcion"),
                        rs.getString("asignatura"),
                        rs.getBoolean("completada")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void marcarCompletada(int id) {
        String sql = "UPDATE tareas SET completada = true WHERE id = ?";

        try (Connection con = SQLDataBaseManager.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizar(int id, String nuevaDesc, String nuevaAsig) {
        String sql = "UPDATE tareas SET descripcion = ?, asignatura = ? WHERE id = ?";

        try (Connection con = SQLDataBaseManager.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, nuevaDesc);
            ps.setString(2, nuevaAsig);
            ps.setInt(3, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
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
