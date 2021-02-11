package com.MDS2.ForoUal.Interfaz;

import java.util.Vector;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;

public class Visualizar_Secciones extends Visualizar_Secciones_Ventana{
	public Visualizar_Raiz__No_Reg_ _visualizar_Raiz_NoReg;
	public Visualizar_Secciones_Registrado _visualizar_Secciones_Registrado;
	public Vector<Ver_Seccion> _ver_Seccion = new Vector<Ver_Seccion>();
	public static int func = 0;
	public Visualizar_Secciones() {
		cargarSecciones();
		func = 0;
	}
	public void cargarSecciones() {
		Seccion[] secciones = foroUI.db.Cargar_Secciones();
		
		for(Seccion s : secciones) {
			if(s.getMarcado() && !(foroUI.user != null && foroUI.privilegios == foroUI.Privilegios.administrador)) continue;
			addComponent(new Ver_Seccion(s));
		}
		
		}
	}