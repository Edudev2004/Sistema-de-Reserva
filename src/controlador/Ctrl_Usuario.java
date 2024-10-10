package controlador;

import conexion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import modelo.Usuario;

/**
 *
 * @author asus
 */
public class Ctrl_Usuario {

    // MÉTODO PARA INICIAR SESIÓN
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // Obtener conexión
            cn = conexion.conectar();
            // Actualización: consulta sin SHA2, ya no se está cifrando la contraseña
            String sql = "SELECT usuario, contrasena FROM tb_usuarios WHERE usuario = '" + objeto.getUsuario() + "' AND contrasena = '" + objeto.getContrasena() + "'";
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            // Verificar si se encontró algún resultado
            if (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión: " + e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        } finally {
            // Cerrar los recursos en el bloque finally
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e);
            }
        }

        return respuesta;
    }
}
