package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.orm.PersistentException;

import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;

public class BD_Administradores {
	public BD_Principal _bd_main_administrador;

	public void Registrar_Administradorr(Object aString_aEmail, Object aString_aNombre, Object aString_aContrasenia, Object aString_aRepetirContrasenia) {
		throw new UnsupportedOperationException();
	}

	public boolean Insertar_Moderador(Long aId) {
		Usuario u;
		try {
			u = UsuarioDAO.getUsuarioByORMID(aId);
			u.setEsModerador(true);
			UsuarioDAO.save(u);
			return true;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean Eliminar_Moderador(Long aId) {
		Usuario u;
		try {
			u = UsuarioDAO.getUsuarioByORMID(aId);
			u.setEsModerador(false);
			UsuarioDAO.save(u);
			return true;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}