package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

public class Visualizar_OtroUsuario_Admininistrador extends Visualizar_OtroUsuario_Moderador {
	public Visualizar_OtroUsuario_Admininistrador(Usuario u) {
		super(u);
		panelOpcionesLayout.addComponent(new Opciones_OtroUsuario_Administrador(u));
		// TODO Auto-generated constructor stub
	}

	public Administrador _administrador;
	public Opciones_OtroUsuario_Administrador _opciones_Usuarios_Administrador;

	public void cargarUsuario() {
		throw new UnsupportedOperationException();
	}
}