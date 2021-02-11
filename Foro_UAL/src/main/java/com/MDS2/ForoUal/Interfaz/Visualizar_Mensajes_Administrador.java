package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.Backend.ORM.src.Tema;

public class Visualizar_Mensajes_Administrador extends Visualizar_Mensajes_Mod {
	public Administrador _administrador;
	public Opciones_Mensajes_Administrador _opciones_Mensajes_Administrador;

	public Visualizar_Mensajes_Administrador (Tema t){
		super(t);
		_opciones_Mensajes_Administrador = new Opciones_Mensajes_Administrador();
		panelOpcionesLayout.addComponent(_opciones_Mensajes_Administrador);
	}
	
	public void cargarMensajes() {
		throw new UnsupportedOperationException();
	}
}