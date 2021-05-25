package com.MDS2.ForoUal.Backend.BDs;

import java.sql.Time;
import java.time.Instant;
import java.util.Vector;

import org.orm.PersistentException;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.TemaDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;
import com.MDS2.ForoUal.Interfaz.Visualizar_Temas_Registrado;

public class BD_Temas {
	public BD_Principal _bd_main_temas;
	public Vector<Tema> _unnamed_Tema_ = new Vector<Tema>();

	public Tema Crear_Tema(String aATitulo, String aASubtitulo, Long aIdUsuario) {
		Tema t = TemaDAO.createTema();
		t.setTitulo(aATitulo);
		t.setSubtitulo(aASubtitulo);
		t.setContiene(Visualizar_Temas_Registrado.sec);
		t.setFechaCreacion(Time.from(Instant.now()));
		t.setNumeroMeGusta(0);
		t.setTipoTema(0);
		t.setNombreUsuario(foroUI.user.getNombreUsuario());
		try {
			Usuario user = UsuarioDAO.getUsuarioByORMID(aIdUsuario);
			t.setCrea_tema(user);
			TemaDAO.save(t);
			return t;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void Cambiar_Estado(Long aId, Long estado) {
		try {
		Tema t = TemaDAO.getTemaByORMID(aId.intValue());
		t.setTipoTema(aId.intValue());
		
			TemaDAO.save(t);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Tema[] Cargar_Temas_Administrador(String aSeccion) {
		try {
			return TemaDAO.listTemaByQuery(String.format("SeccionID = %s AND TipoTema = 3",Integer.parseInt(aSeccion)),null);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new Tema[] {};
	}

	public Tema[] Cargar_Temas_No_Registrado(String aSeccion) {
		try {
			return TemaDAO.listTemaByQuery(String.format("SeccionID = %s AND TipoTema = 0",Integer.parseInt(aSeccion)),null);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new Tema[] {};
	}

	public Tema[] Cargar_Temas_Registrado(String aSeccion) {
		try {
			return TemaDAO.listTemaByQuery(String.format("SeccionID = %s AND TipoTema = 1",Integer.parseInt(aSeccion)),null);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new Tema[] {};
	}

	public Tema[] Cargar_Temas_Moderador(String aSeccion) {
		try {
			return TemaDAO.listTemaByQuery(String.format("SeccionID = %s AND TipoTema = 2",Integer.parseInt(aSeccion)),null);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new Tema[] {};
	}

	public void Cerrar_Tema(Long aId) {
		try {
			Tema t = TemaDAO.getTemaByORMID(aId.intValue());
		
			if (t == null) return;
		
			t.setTipoTema(2);
		
			TemaDAO.save(t);
		}
		catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public int Dar_Megusta_Tema(Long aId, Long aIdUsuario) {
		Tema m = null;
		try {
			m = TemaDAO.loadTemaByORMID(aId.intValue());
			Usuario user = UsuarioDAO.getUsuarioByORMID(aIdUsuario);

			if(!m.gustaTema.contains(user))
				m.gustaTema.add(user);
			else m.gustaTema.remove(user);
			m.setNumeroMeGusta(m.gustaTema.size());
			try {
				TemaDAO.save(m);
				return m.gustaTema.size();
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		return -1;
	}

	public void Ocultar_Tema(Long aId) {
		try {
			Tema t = TemaDAO.getTemaByORMID(aId.intValue());
		
			if (t == null) return;
		
			t.setTipoTema(1);
		
			TemaDAO.save(t);
		}
		catch (PersistentException e) {
			e.printStackTrace();
		}
	}
}