package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

public class Visualizar_OtroUsuario_Moderador extends Ver_OtroPerfil {
	public Visualizar_OtroUsuario_Moderador(Usuario u) {
		super(u);
		panelOpciones.setVisible(true);
		panelOpcionesLayout.addComponent(new Opciones_OtroUsuario_Moderador(u));
		reportado.setVisible(u.getMarcado());
	}
}