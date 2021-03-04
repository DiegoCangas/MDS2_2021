package com.MDS2.ForoUal.Backend.Interfaces_BD;

import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

import antlr.collections.List;

public interface i_Usuario_No_Registrado {

	public Media_ Cargar_Media(Long aMedia);
	
	public boolean Iniciar_Sesion(String aNombre, String aContrasenia);
	
	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aNombre_completo, String aFoto_perfil, String aDescripcion);
	
	public Mensaje[] Cargar_Mensajes(Tema t);
	
	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden);
	
	public Seccion[] Cargar_Secciones();
	
	public Tema[] Cargar_Temas_No_Registrado(String aSeccion);
	
	public Tema[] Ordenar_Temas(Tema[] aTemas, String aOrden);
}