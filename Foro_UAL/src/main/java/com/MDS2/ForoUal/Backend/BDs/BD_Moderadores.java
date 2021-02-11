package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.orm.PersistentException;

import com.MDS2.ForoUal.Backend.ORM.src.Moderador;
import com.MDS2.ForoUal.Backend.ORM.src.ModeradorDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;

public class BD_Moderadores {
	public BD_Principal _bd_main_moderadores;
	public Vector<ModeradorDAO> _unnamed_Moderador_ = new Vector<ModeradorDAO>();
	public boolean esModerador (String aNombre) {
		try {
			Usuario u = UsuarioDAO.loadUsuarioByQuery(String.format("NombreUsuario = '%s'",aNombre), null);
			Moderador mod = ModeradorDAO.getModeradorByORMID(u.getID());
			return(mod != null);
			
			
		} catch (PersistentException e) {
			e.printStackTrace();
			return false;

		}
	}
	public boolean Modificar_Rol(String aNombre) {
		
		try {
			
			if(!esModerador(aNombre)) {
				Usuario u = UsuarioDAO.loadUsuarioByQuery(String.format("NombreUsuario = '%s'",aNombre), null);
				Moderador m = ModeradorDAO.createModerador();
				m.setIdMod(u.getORMID());
				m.setIDusuario(u.getORMID());
				m.setEmail(u.getEmail());
				m.setNombreUsuario(u.getNombreUsuario());
				m.setBaneado(u.getBaneado());
				m.setDescripcion(u.getDescripcion());
				
				m.setContrasenia(u.getContrasenia());
				m.setFotoPerfil(u.getFotoPerfil());
				m.setNombreReal(u.getNombreReal());
				
				UsuarioDAO.deleteAndDissociate(u);
				ModeradorDAO.save(m);
				return true;
			}
			else {
				Moderador u = ModeradorDAO.loadModeradorByQuery(String.format("NombreUsuario = '%s'",aNombre), null);
				
				Usuario  m = ModeradorDAO.createModerador();
				m.setIDusuario(u.getORMID());
				m.setEmail(u.getEmail());
				m.setNombreUsuario(u.getNombreUsuario());
				m.setBaneado(u.getBaneado());
				m.setDescripcion(u.getDescripcion());
				
				m.setContrasenia(u.getContrasenia());
				m.setFotoPerfil(u.getFotoPerfil());
				m.setNombreReal(u.getNombreReal());
				
				UsuarioDAO.deleteAndDissociate(u);
				UsuarioDAO.save(m);
				
				ModeradorDAO.deleteAndDissociate(u);
				return true;
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}		
	}
}