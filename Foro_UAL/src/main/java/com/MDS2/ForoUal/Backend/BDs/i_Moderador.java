package com.MDS2.ForoUal.Backend.BDs;

import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Notificacion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;

public interface i_Moderador {

	public void Ocultar_Mensaje(Long aId);

	public void Ocultar_Tema(Long aTema);

	public Notificacion Notificar_Admin(String aNombreUsuario, String aMensaje);

	public Tema[] Cargar_Temas_Moderador(String aSeccion);

	public Mensaje[] Cargar_Mensajes_Moderador();
}