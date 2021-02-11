public class BD_Principal implements i_Usuario_No_Registrado, Cargar_Secciones_Registrado {
	private DB_Media _medias = new BD_Media();
	private BD_Reporte _reportes = new  BD_Reporte();
	private BD_Usuarios _usuarios = new BD_Usuarios();
	private BD_Mensajes _mensajes = new BD_Mensajes();
	private BD_Temas _temas = new BD_Temas();
	private BD_Secciones _seccioness = new BD_Secciones();
	private BD_Notificaciones _tickets = new BD_Tickets();
	public BD_Usuarios _bd_usuarios;
	public BD_Medias _bd_medias;
	public BD_Reportes _bd_reportes;
	public BD_Mensajes _bd_mensajes;
	public BD_Temas _bd_temas;
	public BD_Secciones _bd_secciones;
	public BD_Notificaciones _bd_notificaciones;
	public BD_Administradores _bd_administrador;
	public BD_Moderadores _bd_moderadores;

	public void Banear(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Usuario(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Usuarios_Busqueda() {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Amigos(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Ultimos_Mensajes(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aRepetirContrasenia) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Devolver_Ultimos_Mensajes(Long aIduser, int aNummensajes) {
		throw new UnsupportedOperationException();
	}

	public boolean Darse_Baja(String aContrasenia, String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Editar_Perfil(String aDescripcion, String aEmail, Imagen aImagen, String aNombre_completo) {
		throw new UnsupportedOperationException();
	}

	public boolean Modificar_Rol(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Insertar_Media(String aUrl) {
		throw new UnsupportedOperationException();
	}

	public Reporte Crear_Reporte(int aIdMensaje, String aMensaje) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Reporte(int aIdReporte) {
		throw new UnsupportedOperationException();
	}

	public Mensaje Crear_Mensaje(String aTexto, Media aMedia) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Mensajes() {
		throw new UnsupportedOperationException();
	}

	public void Ocultar_Mensaje(Long aId) {
		throw new UnsupportedOperationException();
	}

	public Tema Crear_Tema(String aTitulo, String aSubtitulo) {
		throw new UnsupportedOperationException();
	}

	public void Cambiar_Estado(Long aId) {
		throw new UnsupportedOperationException();
	}

	public void Cerrar_Tema(Long aId) {
		throw new UnsupportedOperationException();
	}

	public void Ocultar_Tema(Tema aTema) {
		throw new UnsupportedOperationException();
	}

	public Seccion Crear_Seccion(String aTitulo, String aSubtitulo) {
		throw new UnsupportedOperationException();
	}

	public void Recuperar_Contrasenia_Perfil(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Dar_Megusta_Mensaje(Long aId) {
		throw new UnsupportedOperationException();
	}

	public void Dar_Megusta_Tema(Long aId) {
		throw new UnsupportedOperationException();
	}

	public boolean Iniciar_Sesion(String aNombre, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public Secciones[] Cargar_Secciones_Administrador() {
		throw new UnsupportedOperationException();
	}

	public Secciones[] Cargar_Secciones_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Secciones[] Cargar_Secciones_No_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Temas[] Cargar_Temas_No_Registrado(String aSeccion) {
		throw new UnsupportedOperationException();
	}

	public Temas[] Cargar_Temas_Registrado(String aSeccion) {
		throw new UnsupportedOperationException();
	}

	public Tema[] Cargar_Temas_Administrador(String aNombreSeccion) {
		throw new UnsupportedOperationException();
	}

	public Temas[] Cargar_Temas_Moderador(String aSeccion) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden) {
		throw new UnsupportedOperationException();
	}

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

	public void Eliminar_Mensaje(idMensaje aId) {
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

	public void Eliminar_Amigo(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Insertar_Amigo(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Ticket(Long aId) {
		throw new UnsupportedOperationException();
	}

	public Ticket Notificar_Admin(String aNombreUsuario, String aMensaje) {
		throw new UnsupportedOperationException();
	}
}