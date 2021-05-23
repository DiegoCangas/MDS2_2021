package com.MDS2.ForoUal.Backend.Interfaces_BD;

import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;

public interface i_Usuario_No_Registrado {

	public Media_ Cargar_Media(Object aLong_aMedia);

	public boolean Iniciar_Sesion(String aNombre, String aContrasenia);

	public boolean Registrar_Usuario(String aEmail, String aNombre, String aContrasenia, String aRepetirContrasenia);

	public Mensaje[] Cargar_Mensajes_NoRegistrado();

	public Mensaje[] Cargar_Mensajes(Tema t);

	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden);

	public Seccion[] Cargar_Secciones();

	public Tema[] Cargar_Temas_No_Registrado(String aSeccion);

	public Tema[] Ordenar_Temas(Object[] aTema, Object aString_aOrden);
}