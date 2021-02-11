package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.Backend.ORM.src.Tema;

public class Visualizar_Mensajes_Mod extends Visualizar_Mensajes_Registrado {
	public Moderador _moderador;
	public Opciones_Mensajes_Mod _opciones_Mensajes_Mod;

	public Visualizar_Mensajes_Mod (Tema t){
		super(t);
		_opciones_Mensajes_Mod = new Opciones_Mensajes_Mod();
		panelOpcionesLayout.addComponent(_opciones_Mensajes_Mod);
	}
	public void cargarMensajes() {
		throw new UnsupportedOperationException();
	}
}