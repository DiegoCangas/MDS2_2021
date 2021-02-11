public interface i_Usuario_No_Registrado {

	public boolean Iniciar_Sesion(String aNombre, String aContrasenia);

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aRepetirContrasenia);

	public List Cargar_Usuario(String aNombre);

	public List Cargar_Usuarios_Busqueda();

	public List Cargar_Amigos(String aNombre);

	public Mensaje[] Cargar_Ultimos_Mensajes(String aNombre);

	public Secciones[] Cargar_Secciones_No_Registrado();

	public Temas[] Cargar_Temas_No_Registrado(String aSeccion);

	public Mensaje[] Cargar_Mensajes_NoRegistrado();

	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden);
}