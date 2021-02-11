package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.Backend.ORM.src.Tema;

public class Visualizar_Mensaje_NoRegistrado extends Visualizar_Mensajes_NoRegistrado_Ventana{
	public Usuario_no_Logueado _usuario_no_Logueado;
	public Visualizar_Mensajes _visualizar_Mensajes;
	
	public Visualizar_Mensaje_NoRegistrado(Tema t) {
		Panel_Superior ps = new Panel_Superior(this);
		panelSuperior.setContent(ps);
		_visualizar_Mensajes = new Visualizar_Mensajes(t);
		listaMensajes.setContent(_visualizar_Mensajes);
		titulo.setValue(t.getTitulo());
		subtitulo.setValue(t.getSubtitulo());
	}
	public void cargarMensajes() {
		throw new UnsupportedOperationException();
	}
}