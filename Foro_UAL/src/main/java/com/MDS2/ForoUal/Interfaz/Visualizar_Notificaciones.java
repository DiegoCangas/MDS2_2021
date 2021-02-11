package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Notificacion;

public class Visualizar_Notificaciones extends Visualizar_Notificaciones_Ventana{

	public Visualizar_Notificaciones () {
		Notificacion [] n = foroUI.db.Cargar_Notificaciones((int)foroUI.user.getORMID());
		System.out.println("longitud " +n.length);
		
		for(int i = 0; i < Math.min(n.length, 7); i++)
			notificaciones.addComponent(new Ver_Notificacion(n[i].getMensaje()));
	}
}
