package com.MDS2.ForoUal.Backend.BDs;

import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Reporte;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

public interface i_Usuario_Registrado {

	public Long Insertar_Media(String aAUrl);

	public void Dar_Megusta_Mensaje(Long aAId, Long aIdUsuario);

	public Mensaje Crear_Mensaje(String aTexto, String[] _aMedia, Mensaje respuestaA, Long aIdCreador);

	public Reporte Crear_Reporte(int aAIdMensaje, String aAMensaje);

	public Tema Crear_Tema(String aATitulo, String aASubtitulo, Long aIdUsuario);

	public Tema[] Cargar_Temas_Registrado(String aASeccion);

	public int Dar_Megusta_Tema(Long aAId, Long aIdUsuario);

	public Usuario[] Buscar_Amigo_PorNombre(String aANombre);

	public Usuario[] Cargar_Amigos(String aANombre);

	public boolean Darse_Baja(String aAContrasenia, String aANombre);

	public void Editar_Perfil(String aADescripcion, String aAEmail, String aFotoPerfil, String aANombre_completo);

	public void Eliminar_Amigo(String aANombre, Long aIdUsuarioElimina);

	public void Insertar_Amigo(String aANombre, Long aIdUsuarioInserta);

	public void Recuperar_Contrasenia_Perfil(String aANombre, String aNuevaContrasenia);
}