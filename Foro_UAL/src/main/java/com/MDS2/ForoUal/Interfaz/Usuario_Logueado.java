package com.MDS2.ForoUal.Interfaz;

//import Package6.iUsuario_Logueado;

public class Usuario_Logueado extends Usuario_Logueado_Ventana{
	//public iUsuario_Logueado _iUsuario_Logueado;
	public Visualizar_Temas_Registrado _visualizar_Temas_Registrado;
	public Visualizar_Mensajes_Registrado _visualizar_Mensajes__Registrado_;
	public Opciones_Perfil _opciones_Perfil;
	public panel_Superior_Registrado _unnamed_panel_Superior_Registrado_;
	public Visualizar_Secciones_Registrado _visualizar_Secciones_Registrado;
	public Ver_OtroPerfil _unnamed_Ver_OtroPerfil_;
	
	public Usuario_Logueado (){
		panel_Superior_Registrado ps = new panel_Superior_Registrado(false);
		addComponent(ps);
	}
}