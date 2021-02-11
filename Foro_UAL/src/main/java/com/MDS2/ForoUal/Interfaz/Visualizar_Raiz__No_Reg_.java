package com.MDS2.ForoUal.Interfaz;

public class Visualizar_Raiz__No_Reg_ extends Visualizar_Raiz_No_Reg_Ventana{
	public Usuario_no_Logueado _usuario_no_Logueado;
	public Visualizar_Secciones _visualizar_Secciones;

	public void cargarSecciones() {
		throw new UnsupportedOperationException();
	}
	public Visualizar_Raiz__No_Reg_ () {
		Panel_Superior ps = new Panel_Superior(this);
		panelSuperior.setContent(ps);
		_visualizar_Secciones = new Visualizar_Secciones();
		listaSubForos.setContent(_visualizar_Secciones);
		
	}
}