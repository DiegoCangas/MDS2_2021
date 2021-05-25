package com.MDS2.ForoUal.Backend.BDs;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Administrador;
import com.MDS2.ForoUal.Backend.ORM.src.AdministradorDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;
import com.MDS2.ForoUal.Backend.Utils.PasswordUtils;
import com.MDS2.ForoUal.Interfaz.Ver_OtroPerfil;
import com.vaadin.ui.Image;

public class BD_Usuarios {
	public BD_Principal _bd_main_usuarios;
	public Vector<Usuario> _unnamed_Usuario_ = new Vector<Usuario>();

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
			return Devolver_Ultimos_Mensajes(u,Ver_OtroPerfil.messageLimit);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Mensaje[] {};
		}
	}

	public Mensaje[] Devolver_Ultimos_Mensajes(Usuario aUser, int aNummensajes) {
		try {
			Mensaje[] m2 = MensajeDAO.listMensajeByQuery("UsuarioID = "+aUser.getORMID(), "FechaCreacion");
			Mensaje[] m = new Mensaje[Math.min(m2.length, aNummensajes)];
			
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

	public void Eliminar_Amigo(String aNombre, Long aIdUsuarioElimina) {
		Usuario u;
		try {
			Usuario user = UsuarioDAO.getUsuarioByORMID(aIdUsuarioElimina);
			u = UsuarioDAO.loadUsuarioByQuery(String.format("NombreUsuario = '%s'",aNombre), null);
			user.amigo_de.remove(u);
			UsuarioDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Editar_Perfil(String aDescripcion, String aEmail, String aImagen, String aNombre_completo) {
		foroUI.user.setDescripcion(aDescripcion);
		foroUI.user.setEmail(aEmail);
		foroUI.user.setNombreReal(aNombre_completo);
		foroUI.user.setFotoPerfil(aImagen);
		
		try {
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
			if(u == null) return false;
			foroUI.user = u;
			
			//Privilegios
			if(u.getEsModerador())
				foroUI.privilegios = foroUI.Privilegios.moderador;

			
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
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public void Insertar_Amigo(String aANombre, Long aIdUsuarioInserta) {
		Usuario u;
		try {
			u = UsuarioDAO.loadUsuarioByQuery(String.format("NombreUsuario = '%s'",aANombre), null);
			Usuario user = UsuarioDAO.getUsuarioByORMID(aIdUsuarioInserta);
			user.amigo_de.add(u);
			UsuarioDAO.save(user);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Recuperar_Contrasenia_Perfil(String aNombre, String aNuevaContrasenia) {
		String key = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";
		aNuevaContrasenia = PasswordUtils.generateSecurePassword(aNuevaContrasenia, key);
		try {
			Usuario u = UsuarioDAO.loadUsuarioByQuery(String.format("Email = '%s'",aNombre), null);
			u.setContrasenia(aNuevaContrasenia);
			UsuarioDAO.save(u);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aRepetirContrasenia,String aNombre_completo, String aFoto_perfil, String aDescripcion) {
		if (aRepetirContrasenia != aContrasenia) return false;
		
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

	public boolean EsModerador(Long aId) {
		Usuario u;
		try {
			u = UsuarioDAO.getUsuarioByORMID(aId);
			return u.getEsModerador();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}