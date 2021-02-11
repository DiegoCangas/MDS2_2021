package com.MDS2.ForoUal.Interfaz;

//import a.iAdministrador;

public class Administrador extends Administrador_Ventana {
	//public iAdministrador _iAdministrador;
	public Visualizar_Temas_Administrador _visualizar_Temas_Administrador;
	public Visualizar_OtroUsuario_Admininistrador _visualizar_Perfil_Administrador;
	public Visualizar_Secciones_Administrador _visualizar_Secciones_Administrador;
	public Visualizar_Mensajes_Administrador _visualizar_Mensajes_Administrador;
	
	public Administrador () {
		panel_Superior_Registrado ps = new panel_Superior_Registrado(false);
		addComponent(ps);
	}
}