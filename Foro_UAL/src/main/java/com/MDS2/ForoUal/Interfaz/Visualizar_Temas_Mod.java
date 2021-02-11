package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.Backend.ORM.src.Seccion;

public class Visualizar_Temas_Mod extends Visualizar_Temas_Registrado {
	public Moderador _moderador;
	public Opciones_Temas_Moderador _opciones_Temas_Moderador;

	public Visualizar_Temas_Mod (Seccion s, boolean adm){
		super(s);
		if(!adm) {
		_opciones_Temas_Moderador = new Opciones_Temas_Moderador(null);
		panelOpcionesLayout.addComponent(_opciones_Temas_Moderador);
		}
	}
	public void cargarTemas() {
		throw new UnsupportedOperationException();
	}
}