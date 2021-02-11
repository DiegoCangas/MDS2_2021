import java.util.Vector;

public class BD_Usuarios {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Usuario> _unnamed_Usuario_ = new Vector<Usuario>();

	public void Banear(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Desbanear(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public List Buscar_Amigo_PorNombre(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Cargar_Usuario_Administrador(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Usuario(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Amigos(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Ultimos_Mensajes(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Devolver_Ultimos_Mensajes(Usuario aUser, int aNummensajes) {
		throw new UnsupportedOperationException();
	}

	public boolean Darse_Baja(String aContrasenia, String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Editar_Perfil(String aDescripcion, String aEmail, Imagen aImagen, String aNombre_completo) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Amigo(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public boolean Iniciar_Sesion(String aNombre, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public void Insertar_Amigo(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public boolean Modificar_Rol(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Recuperar_Contrasenia_Perfil(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aRepetirContrasenia) {
		throw new UnsupportedOperationException();
	}
}