package com.MDS2.ForoUal.Interfaz;

public class Visualizar_Secciones_Administrador extends Visualizar_Secciones_Registrado {
	public Administrador _administrador;
	public Opciones_Secciones _opciones_Secciones;

	public Visualizar_Secciones_Administrador() {
		super();
		panelOpciones.setVisible(true);
		_opciones_Secciones = new Opciones_Secciones();
		panelOpciones.setContent(_opciones_Secciones);
	}
	public void cargarSecciones() {
		throw new UnsupportedOperationException();
	}
}