package com.MDS2.ForoUal.Interfaz;


//import Package6.iModerador;

public class Moderador extends Moderador_Ventana{
	//public iModerador _iModerador;
	public Visualizar_Temas_Mod _visualizar_Temas_Mod;
	public Visualizar_OtroUsuario_Moderador _visualizar_Perfil_Mod;
	public Visualizar_Mensajes_Mod _visualizar_Mensajes_Mod;
	public Moderador () {
		panel_Superior_Registrado ps = new panel_Superior_Registrado(false);
		addComponent(ps);
	}
}