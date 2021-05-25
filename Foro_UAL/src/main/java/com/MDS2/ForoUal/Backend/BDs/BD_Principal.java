package com.MDS2.ForoUal.Backend.BDs;

import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Notificacion;
import com.MDS2.ForoUal.Backend.ORM.src.Reporte;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

public class BD_Principal implements i_Usuario_No_Registrado, i_Usuario_Registrado, i_Moderador, i_Administrador {
	private BD_Medias _medias = new BD_Medias();
	private BD_Reportes _reportes = new  BD_Reportes();
	private BD_Usuarios _usuarios = new BD_Usuarios();
	private BD_Mensajes _mensajes = new BD_Mensajes();
	private BD_Temas _temas = new BD_Temas();
	private BD_Secciones _seccioness = new BD_Secciones();
	private BD_Notificaciones _notificaciones = new BD_Notificaciones();
	private BD_Administradores _administradores = new BD_Administradores();
	public BD_Usuarios _bd_usuarios;
	public BD_Medias _bd_medias;
	public BD_Reportes _bd_reportes;
	public BD_Mensajes _bd_mensajes;
	public BD_Temas _bd_temas;
	public BD_Secciones _bd_secciones;
	public BD_Notificaciones _bd_notificaciones;
	public BD_Administradores _bd_administrador;

	public void Eliminar_Mensaje(Long aId) {
		_mensajes.Eliminar_Mensaje(aId);
	}

	public void Eliminar_Seccion(int aId) {
		_seccioness.Eliminar_Seccion(aId);
	}

	public Seccion Crear_Seccion(String aTitulo, String aSubtitulo) {
		return _seccioness.Crear_Seccion(aTitulo, aSubtitulo);
	}

	public void Cambiar_Estado(Long aId, Long aEstado) {
		_temas.Cambiar_Estado(aId,aEstado);
	}

	public Tema[] Cargar_Temas_Administrador(String aSeccion) {
		return _temas.Cargar_Temas_Administrador(aSeccion);
	}

	public void Cerrar_Tema(Long aId) {
		_temas.Cerrar_Tema(aId);
	}

	public void Banear(String aNombre) {
		_usuarios.Banear(aNombre);
	}

	public void Desbanear(String aNombre) {
		_usuarios.Desbanear(aNombre);
	}

	public Mensaje[] Devolver_Ultimos_Mensajes(Usuario aAUser, int aANummensajes) {
		return _usuarios.Devolver_Ultimos_Mensajes(aAUser, aANummensajes);
	}

	public void Ocultar_Mensaje(Long aId) {
		_mensajes.Ocultar_Mensaje(aId);
	}

	public void Ocultar_Tema(Long aTema) {
		_temas.Ocultar_Tema(aTema);
	}

	public Tema[] Cargar_Temas_Moderador(String aSeccion) {
		return _temas.Cargar_Temas_Moderador(aSeccion);
	}

	public Mensaje[] Cargar_Mensajes_Moderador() {
		return _mensajes.Cargar_Mensajes_Moderador();
	}

	public Media_ Cargar_Media(Long aAMedia) {
		return _medias.Cargar_Media(aAMedia);
	}

	public boolean Iniciar_Sesion(String aNombre, String aContrasenia) {
		return _usuarios.Iniciar_Sesion(aNombre, aContrasenia);
	}

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aRepetirContrasenia, String aNombre_completo, String aFoto_perfil, String aDescripcion) {
		return _usuarios.Registrar_Usuario(aEmail, aNombre, aContrasenia, aRepetirContrasenia, aNombre_completo, aFoto_perfil, aDescripcion);
	}

	public Mensaje[] Cargar_Mensajes_NoRegistrado() {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Mensajes(Tema aT) {
		return _mensajes.Cargar_Mensajes(aT);
	}

	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden) {
		return _mensajes.Ordenar_Mensajes(aMensajes, aOrden);
	}

	public Seccion[] Cargar_Secciones() {
		return _seccioness.Cargar_Secciones();
	}

	public Tema[] Cargar_Temas_No_Registrado(String aSeccion) {
		return _temas.Cargar_Temas_No_Registrado(aSeccion);
	}

	public Long Insertar_Media(String aAUrl) {
		return (long)_medias.Insertar_Media(aAUrl);
	}

	public void Dar_Megusta_Mensaje(Long aAId, Long aIdUsuario) {
		_mensajes.Dar_Megusta_Mensaje(aAId,aIdUsuario);
	}

	public Mensaje Crear_Mensaje(String aTexto, String[] aMedia, Mensaje respuestaA, Long aIdCreador) {
		return _mensajes.Crear_Mensaje(aTexto, aMedia, respuestaA, aIdCreador);
	}

	public Reporte Crear_Reporte(int aAIdMensaje, String aAMensaje) {
		return _reportes.Crear_Reporte(aAIdMensaje, aAMensaje);
	}

	public Notificacion Notificar_Admin(String aANombreUsuario, String aAMensaje) {
		return _notificaciones.Notificar_Admin(aANombreUsuario, aAMensaje);
	}

	public Tema Crear_Tema(String aATitulo, String aASubtitulo, Long aIdUsuario) {
		return _temas.Crear_Tema(aATitulo, aASubtitulo, aIdUsuario);
	}

	public Tema[] Cargar_Temas_Registrado(String aASeccion) {
		return _temas.Cargar_Temas_Registrado(aASeccion);
	}

	public int Dar_Megusta_Tema(Long aAId, Long aIdUsuario) {
		return _temas.Dar_Megusta_Tema(aAId,aIdUsuario);
	}

	public Usuario[] Buscar_Amigo_PorNombre(String aANombre) {
		return _usuarios.Buscar_Amigo_PorNombre(aANombre);
	}

	public Usuario[] Cargar_Amigos(String aANombre) {
		return _usuarios.Cargar_Amigos(aANombre);
	}

	public boolean Darse_Baja(String aAContrasenia, String aANombre) {
		return _usuarios.Darse_Baja(aAContrasenia, aANombre);
	}

	public void Editar_Perfil(String aADescripcion, String aAEmail, String aFotoPerfil, String aANombre_completo) {
		_usuarios.Editar_Perfil(aADescripcion, aAEmail, aFotoPerfil, aANombre_completo);
	}

	public void Eliminar_Amigo(String aANombre, Long aIdUsuarioElimina) {
		_usuarios.Eliminar_Amigo(aANombre,aIdUsuarioElimina);
	}

	public void Insertar_Amigo(String aANombre, Long aIdUsuarioInserta) {
		_usuarios.Insertar_Amigo(aANombre,aIdUsuarioInserta);
	}

	public void Recuperar_Contrasenia_Perfil(String aANombre, String aNuevaContrasenia) {
		_usuarios.Recuperar_Contrasenia_Perfil(aANombre, aNuevaContrasenia);
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

	public int Tipo_Media(String aM) {
		return _medias.Tipo_Media(aM);
	}
	public Reporte Cargar_Reporte (Long aIdMentsaje) {
		return _reportes.Cargar_Reporte(aIdMentsaje);
	}
	public void Crear_Notificacion (Long aId, String aMensaje) {
		_notificaciones.Crear_Notificacion(aId, aMensaje);
	}
	public Notificacion[] Cargar_Notificaciones(Long aId) {
		return _notificaciones.Cargar_Notificaciones(aId);
	}
	public Mensaje[] Cargar_Ultimos_Mensajes(String aNombre) {
		return _usuarios.Cargar_Ultimos_Mensajes(aNombre);
	}

}