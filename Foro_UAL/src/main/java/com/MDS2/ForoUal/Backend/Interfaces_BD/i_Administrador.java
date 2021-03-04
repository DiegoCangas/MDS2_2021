package com.MDS2.ForoUal.Backend.Interfaces_BD;

import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;

public interface i_Administrador {
	
	public void Registrar_Administrador(String aEmail, String aNombre, String aContrasenia, String aRepetirContrasenia);
	
	public void Eliminar_Mensaje(Long aId);
		
	public void Eliminar_Seccion(int id);
	
	public Seccion Crear_Seccion(String aTitulo, String aSubtitulo);

	public void Cambiar_Estado(Tema t, Long aId);
	
	public Tema[] Cargar_Temas_Administrador(String aSeccion);
	
	public void Cerrar_Tema(Long aId);
	
	public void Banear(String aNombre);
	
	public void Desbanear(String aNombre);
	
	public boolean Modificar_Rol(String aNombre);
	
	

}