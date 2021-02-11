package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.Backend.ORM.src.Seccion;

public class Visualizar_Temas_Administrador extends Visualizar_Temas_Mod {
	public Administrador _administrador;
	public Opciones_Temas_Administrador _opciones_Temas_Administrador;

	public Visualizar_Temas_Administrador (Seccion s){
		super(s,true);
		_opciones_Temas_Moderador = new Opciones_Temas_Moderador(null);
		panelOpcionesLayout.addComponent(_opciones_Temas_Moderador);
		panelOpcionesLayout.addComponent(new Opciones_Temas_Administrador(_opciones_Temas_Moderador));
	}
	public void cargarTemas() {
		throw new UnsupportedOperationException();
	}
}