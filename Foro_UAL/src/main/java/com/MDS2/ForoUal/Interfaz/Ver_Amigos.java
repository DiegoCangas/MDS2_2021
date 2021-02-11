package com.MDS2.ForoUal.Interfaz;

import java.util.Vector;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

public class Ver_Amigos extends Ver_amigos_Ventana{
	public Ver_Amigos (Usuario u) {
		Usuario[] u2 = foroUI.db.Cargar_Amigos(u.getNombreUsuario());
		for(Usuario u3 : u2)
			addComponent(new Ver_Amigo(u3,false));
	}
	
	public Opciones_Perfil _opciones_Perfil;
	public Ver_OtroPerfil _unnamed_Ver_OtroPerfil_;
	public Vector<Ver_Amigo> _list_Ver_Amigo = new Vector<Ver_Amigo>();
}