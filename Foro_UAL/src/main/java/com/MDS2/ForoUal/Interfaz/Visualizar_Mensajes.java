package com.MDS2.ForoUal.Interfaz;

import java.util.Vector;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

public class Visualizar_Mensajes extends Visualizar_Mensajes_Ventana{
	public Visualizar_Mensaje_NoRegistrado _visualizar_Mensaje_NoRegistrado;
	public Ver_Amigo _ver_Amigo;
	public Vector<visualizar_Mensaje> _list_visualizar_Mensaje = new Vector<visualizar_Mensaje>();
	public static int action = 0;
	public static Tema tema = new Tema();
	
	public Visualizar_Mensajes (Tema t) {
		tema = t;
		action = 0;
		cargarMensajes();
	}
	public void cargarMensajes() {
		Mensaje[] m = foroUI.db.Cargar_Mensajes(tema);
		
		for(Mensaje m2 : m) {
			if(foroUI.user == null || (foroUI.user != null && foroUI.privilegios == foroUI.Privilegios.usuario))
				if(m2.getTexto().contains("<Ocultado>") || m2.getTexto().contains("<Borrado>")) continue;
			if((foroUI.user != null && foroUI.privilegios == foroUI.Privilegios.moderador) && m2.getTexto().contains("<Borrado>")) continue;
			addComponent(new visualizar_Mensaje(m2));
		}
	}
	public Visualizar_Mensajes(Usuario u) {
		Mensaje[] me = foroUI.db.Cargar_Ultimos_Mensajes(u.getNombreUsuario());
		for(Mensaje m2 : me) {
			if(foroUI.user == null || (foroUI.user != null && foroUI.privilegios == foroUI.Privilegios.usuario))
				if(m2.getTexto().contains("<Ocultado>") || m2.getTexto().contains("<Borrado>")) continue;
			if((foroUI.user != null && foroUI.privilegios == foroUI.Privilegios.moderador) && m2.getTexto().contains("<Borrado>")) continue;
			addComponent(new visualizar_Mensaje(m2));
		}
	}
}