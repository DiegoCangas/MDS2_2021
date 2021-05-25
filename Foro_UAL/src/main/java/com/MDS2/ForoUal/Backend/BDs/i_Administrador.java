package com.MDS2.ForoUal.Backend.BDs;

import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

public interface i_Administrador {

	public void Eliminar_Mensaje(Long aId);

	public void Eliminar_Seccion(int aId);

	public Seccion Crear_Seccion(String aTitulo, String aSubtitulo);

	public void Cambiar_Estado(Long aId, Long state);

	public Tema[] Cargar_Temas_Administrador(String aSeccion);

	public void Cerrar_Tema(Long aId);

	public void Banear(String aNombre);

	public void Desbanear(String aNombre);
	
	public boolean Insertar_Moderador(Long id);
	
	public boolean Eliminar_Moderador (Long id);

	public Mensaje[] Devolver_Ultimos_Mensajes(Usuario aAUser, int aANummensajes);
}