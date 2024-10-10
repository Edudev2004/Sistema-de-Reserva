package modelo;

/**
 *
 * @author asus
 */
public class Usuario {

    //ATRIBUTOS
    private int id_usuario;
    private String nombre_usuario;
    private String usuario;
    private String contrasena;

    //CONSTRUCTOR 
    public Usuario() {
        this.id_usuario = 0;
        this.nombre_usuario = "";
        this.usuario = "";
        this.contrasena = "";
    }

    //GETTER & SETTER
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}//FIN DE CLASE
