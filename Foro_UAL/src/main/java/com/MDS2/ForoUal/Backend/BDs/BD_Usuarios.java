package com.MDS2.ForoUal.Backend.BDs;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Vector;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.*;
import com.MDS2.ForoUal.Interfaz.Ver_OtroPerfil;

import org.orm.PersistentException;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

import antlr.collections.List;

public class BD_Usuarios {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<UsuarioDAO> _unnamed_Usuario_ = new Vector<UsuarioDAO>();

	public void Banear(String aNombre) {
		Usuario u = null;
		try {
			u = UsuarioDAO.loadUsuarioByQuery("NombreUsuario = '"+aNombre+"'", null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		u.setBaneado(true);
		try {
			UsuarioDAO.save(u);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Desbanear(String aNombre) {
		Usuario u = null;
		try {
			u = UsuarioDAO.loadUsuarioByQuery("NombreUsuario = '"+aNombre+"'", null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		u.setBaneado(false);
		try {
			UsuarioDAO.save(u);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Usuario[] Buscar_Amigo_PorNombre(String aNombre) {
		try {
			return UsuarioDAO.listUsuarioByQuery("NombreUsuario LIKE '%"+aNombre+"%' AND NombreUsuario != '"+foroUI.user.getNombreUsuario()+"'", null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Usuario[] {};
		}
	}

	public List Cargar_Usuario(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Usuario[] Cargar_Amigos(String aNombre) {
		Usuario u = null;
		try {
			u = UsuarioDAO.loadUsuarioByQuery("NombreUsuario = '"+aNombre+"'", null);
			return u.amigo_de.toArray();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Usuario[] {};
		}
		
	}

	public Mensaje[] Cargar_Ultimos_Mensajes(String aNombre) {
		Usuario u = null;
		try {
			u = UsuarioDAO.loadUsuarioByQuery("NombreUsuario = '"+aNombre+"'", null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Mensaje[] {};
		}
		try {
			Mensaje[] m2 = MensajeDAO.listMensajeByQuery("UsuarioID = "+u.getORMID(), "FechaCreacion");
			Mensaje[] m = new Mensaje[Math.min(m2.length, Ver_OtroPerfil.messageLimit)];
			
			for(int i = 0; i < Math.min(m2.length, Ver_OtroPerfil.messageLimit); i++)
				m[i] = m2[i];
			
			return m;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Mensaje[] {};
		}
	}

	public Mensaje[] Devolver_Ultimos_Mensajes(Usuario aUser, int aNummensajes) {
		
		try {
			Mensaje[] m2 = MensajeDAO.listMensajeByQuery("UsuarioID = "+aUser.getORMID(), "FechaCreacion");
			Mensaje[] m = new Mensaje[Math.min(m2.length, Ver_OtroPerfil.messageLimit)];
			
			for(int i = 0; i < Math.min(m2.length, aNummensajes); i++)
				m[i] = m2[i];
			
			return m;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Mensaje[] {};
		}
	}

	public boolean Darse_Baja(String aContrasenia, String aNombre) {
		try {
			UsuarioDAO.deleteAndDissociate(foroUI.user);
			return true;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public void Editar_Perfil(String aDescripcion, String aEmail, String fotoPerfil, String aNombre_completo) {
		
		foroUI.user.setDescripcion(aDescripcion);
		foroUI.user.setEmail(aEmail);
		foroUI.user.setNombreReal(aNombre_completo);
		foroUI.user.setFotoPerfil(fotoPerfil);
		
		try {
			UsuarioDAO.save(foroUI.user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Eliminar_Amigo(String aNombre) {
		Usuario u;
		try {
			u = UsuarioDAO.loadUsuarioByQuery(String.format("NombreUsuario = '%s'",aNombre), null);
			foroUI.user.amigo_de.remove(u);
			UsuarioDAO.save(foroUI.user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean Iniciar_Sesion(String aNombre, String aContrasenia) {
		
		String key = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
		aContrasenia = PasswordUtils.generateSecurePassword(aContrasenia, key);

		try {
			Usuario u = UsuarioDAO.loadUsuarioByQuery(String.format("Email = '%s' AND Contrasenia = '%s'",aNombre,aContrasenia), "Email");
			foroUI.user = u;
			
			//Privilegios
			try {
			Moderador mod = ModeradorDAO.getModeradorByORMID(u.getID());
			if(mod != null) foroUI.privilegios = foroUI.Privilegios.moderador;
			}
			catch (Exception e)
			{
				
			}
			
			try {
			Administrador ad = AdministradorDAO.getAdministradorByORMID(u.getID());
			if(ad != null) foroUI.privilegios = foroUI.Privilegios.administrador;
			}
			catch (Exception e)
			{
				
			}
			
			//Visualizar
			foroUI.singleton.VisualizarRaiz();
			
			System.out.println("Login as: " + foroUI.privilegios);
			return u != null;
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public void Insertar_Amigo(String aNombre) {
		Usuario u;
		try {
			u = UsuarioDAO.loadUsuarioByQuery(String.format("NombreUsuario = '%s'",aNombre), null);
			foroUI.user.amigo_de.add(u);
			UsuarioDAO.save(foroUI.user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void Recuperar_Contrasenia_Perfil(String aNombre, String aContrasenia) {
		String key = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
		aContrasenia = PasswordUtils.generateSecurePassword(aContrasenia, key);
		try {
			Usuario u = UsuarioDAO.loadUsuarioByQuery(String.format("Email = '%s'",aNombre), null);
			u.setContrasenia(aContrasenia);
			UsuarioDAO.save(u);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aNombre_completo, String aFoto_perfil, String aDescripcion) {
		
		String key = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
		aContrasenia = PasswordUtils.generateSecurePassword(aContrasenia, key);
		
		Usuario u = UsuarioDAO.createUsuario();
		u.setEmail(aEmail);
		u.setNombreUsuario(aNombre);
		u.setContrasenia(aContrasenia);
		u.setDescripcion(aDescripcion);
		u.setNombreReal(aNombre_completo);
		u.setFotoPerfil(aFoto_perfil);
		try {
			UsuarioDAO.save(u);
			return true;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}