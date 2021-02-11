package com.MDS2.ForoUal.Backend.Interfaces_BD;

import com.MDS2.ForoUal.Backend.ORM.src.Notificacion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;

public interface i_Moderador {

	public void Ocultar_Mensaje(Long aId);

	public void Ocultar_Tema(Tema aTema);

	public Notificacion Notificar_Admin(String aNombreUsuario, String aMensaje);

	public Tema[] Cargar_Temas_Moderador(String aSeccion);
}