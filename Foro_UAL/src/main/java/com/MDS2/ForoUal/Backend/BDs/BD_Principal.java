package com.MDS2.ForoUal.Backend.BDs;

import java.util.ArrayList;

import javax.print.attribute.standard.Media;

import com.MDS2.ForoUal.Backend.Interfaces_BD.i_Administrador;
import com.MDS2.ForoUal.Backend.Interfaces_BD.i_Moderador;
import com.MDS2.ForoUal.Backend.Interfaces_BD.i_Usuario_No_Registrado;
import com.MDS2.ForoUal.Backend.Interfaces_BD.i_Usuario_Registrado;
import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Notificacion;
import com.MDS2.ForoUal.Backend.ORM.src.Reporte;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

import antlr.collections.List;

public class BD_Principal implements i_Usuario_Registrado{
	private BD_Medias _medias = new BD_Medias();
	private BD_Reportes _reportes = new  BD_Reportes();
	private BD_Usuarios _usuarios = new BD_Usuarios();
	private BD_Mensajes _mensajes = new BD_Mensajes();
	private BD_Temas _temas = new BD_Temas();
	private BD_Secciones _seccioness = new BD_Secciones();
	private BD_Notificaciones notificaciones = new BD_Notificaciones();
	private BD_Administradores _administradores = new BD_Administradores();
	public BD_Usuarios _bd_usuarios;
	public BD_Medias _bd_medias;
	public BD_Reportes _bd_reportes;
	public BD_Mensajes _bd_mensajes;
	public BD_Temas _bd_temas;
	public BD_Secciones _bd_secciones;
	public BD_Notificaciones _bd_notificaciones;
	public BD_Administradores _bd_administrador;

	public Reporte Cargar_Reporte(int aId) {
		return _reportes.Cargar_Reporte(aId);
	}
	
	public void Banear(String aNombre) {
		_usuarios.Banear(aNombre);
	}
	public void Desbanear(String aNombre) {
		_usuarios.Desbanear(aNombre);
	}

	public Usuario[] Cargar_Amigos(String aNombre) {
		return _usuarios.Cargar_Amigos(aNombre);
	}
	public Usuario[] Buscar_Amigo_PorNombre(String aNombre) {
		return _usuarios.Buscar_Amigo_PorNombre(aNombre);
	}

	public Mensaje[] Cargar_Ultimos_Mensajes(String aNombre) {
		return _usuarios.Cargar_Ultimos_Mensajes(aNombre);
	}

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aNombre_completo, String aFoto_perfil, String aDescripcion) {

		return _usuarios.Registrar_Usuario(aEmail, aNombre, aContrasenia, aNombre_completo, aFoto_perfil, aDescripcion);
	}

	public Mensaje[] Devolver_Ultimos_Mensajes(Long aIduser, int aNummensajes) {
		throw new UnsupportedOperationException();
	}

	public boolean Darse_Baja(String aContrasenia, String aNombre) {
		return _usuarios.Darse_Baja(aContrasenia, aNombre);
	}

	public void Editar_Perfil(String aDescripcion, String aEmail, String fotoPerfil, String aNombre_completo) {
		_usuarios.Editar_Perfil(aDescripcion, aEmail, fotoPerfil, aNombre_completo);
	}

	public Long Insertar_Media(String aUrl) {
		return (long)_medias.Insertar_Media(aUrl);
	}

	public Reporte Crear_Reporte(int aIdMensaje, String aMensaje) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Reporte(int aIdReporte) {
		throw new UnsupportedOperationException();
	}

	public Mensaje Crear_Mensaje(String aTexto, String[] urls,Mensaje respuestaA) {
		return _mensajes.Crear_Mensaje(aTexto, urls, respuestaA);
	}

	public Mensaje[] Cargar_Mensajes(Tema t) {
		return _mensajes.Cargar_Mensajes(t);
	}
	public void Denunciar_Mensaje(Long aId, String aMensaje) {
		_reportes.Crear_Reporte(aId.intValue(), aMensaje);
	}

	public void Ocultar_Mensaje(Long aId) {
		_mensajes.Ocultar_Mensaje(aId);
	}

	public Tema Crear_Tema(String aTitulo, String aSubtitulo) {
		return _temas.Crear_Tema(aTitulo, aSubtitulo);
	}

	public void Cambiar_Estado(Tema t, Long aId) {
		_temas.Cambiar_Estado(t,aId);
	}
	public void Eliminar_Seccion(int aId) {
		 _seccioness.Eliminar_Seccion(aId);
	}

	public Seccion Crear_Seccion(String aTitulo, String aSubtitulo) {
		return _seccioness.Crear_Seccion(aTitulo, aSubtitulo);
	}

	public void Recuperar_Contrasenia_Perfil(String aNombre, String aContrasenia) {
		_usuarios.Recuperar_Contrasenia_Perfil(aNombre, aContrasenia);
	}

	public void Dar_Megusta_Mensaje(Long aId) {
		_mensajes.Dar_Megusta_Mensaje(aId);
	}

	public int Dar_Megusta_Tema(Long aId) {
		return _temas.Dar_Megusta_Tema(aId);
	}

	public boolean Iniciar_Sesion(String aNombre, String aContrasenia) {
		return _usuarios.Iniciar_Sesion(aNombre, aContrasenia);
	}

	public Seccion[] Cargar_Secciones() {
		return _seccioness.Cargar_Secciones();
	}

	public Tema[] Cargar_Temas_No_Registrado(String aSeccion) {
		return _temas.Cargar_Temas_No_Registrado(aSeccion);
	}

	public Tema[] Cargar_Temas_Registrado(String aSeccion) {
		return _temas.Cargar_Temas_Registrado(aSeccion);
	}

	public Tema[] Cargar_Temas_Administrador(String aSeccion) {
		return _temas.Cargar_Temas_Administrador(aSeccion);
	}

	public Tema[] Cargar_Temas_Moderador(String aSeccion) {
		return _temas.Cargar_Temas_Moderador(aSeccion);
	}

	public boolean Insertar_Moderador(Long aId) {
		return _administradores.Insertar_Moderador(aId);
	}

	public boolean Eliminar_Moderador(Long aId) {
		return _administradores.Eliminar_Moderador(aId);
	}

	public boolean EsModerador(Long aId) {
		return _usuarios.EsModerador(aId);
	}
	public void Eliminar_Mensaje(Long aId) {
		 _mensajes.Eliminar_Mensaje(aId);
	}

	
	public void Eliminar_Amigo(String aNombre) {
		_usuarios.Eliminar_Amigo(aNombre);
	}
	

	
	public void Insertar_Amigo(String aNombre) {
		_usuarios.Insertar_Amigo(aNombre);		
	}
	
	
	public Notificacion Notificar_Admin(String aNombreUsuario, String aMensaje) {
		return notificaciones.Notificar_Admin(aNombreUsuario, aMensaje);
	}

	public int Tipo_Media(String url) {
		return _medias.getType(url);
	}

	public Notificacion[] Cargar_Notificaciones(int aId) {
		return notificaciones.Cargar_Notificaciones(aId);
	}

	public void Crear_Notificacion(int aId, String aMensaje) {
		notificaciones.Crear_Notificacion(aId, aMensaje);
	}
}