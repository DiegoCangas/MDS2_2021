package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Visualizar_Secciones_Registrado extends Visualizar_Secciones_Registrado_Ventana{
	public panel_Superior_Registrado _panel_Superior_Registrado;
	public Usuario_Logueado _usuario_Logueado;

	public void cargarSecciones() {
		throw new UnsupportedOperationException();
	}
	public Visualizar_Secciones_Registrado() {
		panel_Superior_Registrado ps = new panel_Superior_Registrado(false);
		panelSuperior.setContent(ps);
		listaSubForos.setContent(new Visualizar_Secciones());
		panelOpciones.setVisible(false);
	}
}