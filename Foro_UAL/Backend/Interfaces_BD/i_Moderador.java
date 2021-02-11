public interface i_Moderador {

	public void Ocultar_Mensaje(Long aId);

	public void Ocultar_Tema(Tema aTema);

	public Temas[] Cargar_Temas_Moderador(String aSeccion);

	public Mensaje[] Cargar_Mensajes_Moderador();

	public Ticket Notificar_Admin(String aNombreUsuario, String aMensaje);
}