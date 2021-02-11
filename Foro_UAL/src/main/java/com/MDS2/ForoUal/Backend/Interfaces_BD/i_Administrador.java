package com.MDS2.ForoUal.Backend.Interfaces_BD;

import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;

public interface i_Administrador {

	public void Eliminar_Mensaje(int aId);

	public void Eliminar_Seccion(int aId);

	public Seccion Crear_Seccion(String aTitulo, String aSubtitulo);

	public void Cambiar_Estado(Long aId);

	public Tema[] Cargar_Temas_Administrador(String aSeccion);

	public void Cerrar_Tema(Long aId);

	public void Banear(String aNombre);

	public void Desbanear(String aNombre);

	public boolean Modificar_Rol(String aNombre);

	public Mensaje[] Devolver_Ultimos_Mensajes(Long aIduser, int aNummensajes);
}