import java.util.Vector;

public class BD_Mensajes {
	public BD_Principal _bd_main_mensajes;
	public Vector<Mensaje> _unnamed_Mensaje_ = new Vector<Mensaje>();

	public Mensaje[] Cargar_Mensajes_NoRegistrado() {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Mensajes_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Mensajes_Moderador() {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Mensajes_Administrador() {
		throw new UnsupportedOperationException();
	}

	public Mensaje Crear_Mensaje(String aTexto, Media aMedia) {
		throw new UnsupportedOperationException();
	}

	public void Dar_Megusta_Mensaje(idMensaje aId) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Mensaje(idMensaje aId) {
		throw new UnsupportedOperationException();
	}

	public void Ocultar_Mensaje(idMensaje aId) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden) {
		throw new UnsupportedOperationException();
	}
}