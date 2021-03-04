package com.MDS2.ForoUal.Backend.Interfaces_BD;

import javax.print.attribute.standard.Media;

import org.orm.PersistentException;

import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Media_DAO;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Notificacion;
import com.MDS2.ForoUal.Backend.ORM.src.Reporte;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

import antlr.collections.List;

public interface i_Usuario_Registrado {

	public Long Insertar_Media(String aUrl, int aId);
	
	public void Dar_Megusta_Mensaje(Long aId);
	
	public Mensaje Crear_Mensaje(String aTexto, String aMedia[], Mensaje respuestaA);
	
	public Reporte Crear_Reporte(int aIdMensaje, String aMensaje);	
	
	public Notificacion Notificar_Admin(String aNombreUsuario, String aMensaje);
	
	public Tema Crear_Tema(String aTitulo, String aSubtitulo);
	
	public Tema[] Cargar_Temas_Registrado(String aSeccion);
	
	public int Dar_Megusta_Tema(Long aId);
	
	public Usuario[] Buscar_Amigo_PorNombre(String aNombre);
	
	public Usuario[] Cargar_Amigos(String aNombre);
	
	public boolean Darse_Baja(String aContrasenia, String aNombre);
	
	public void Editar_Perfil(String aDescripcion, String aEmail, String fotoPerfil, String aNombre_completo);
	
	public void Eliminar_Amigo(String aNombre);
		
	public void Insertar_Amigo(String aNombre);
	
	public void Recuperar_Contrasenia_Perfil(String aNombre, String aContrasenia);
	
}