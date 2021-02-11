package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;

public class Responder_Mensaje extends Crear_Mensaje {
	public Responder_Mensaje(Mensaje m) {
	
		super();
		respuestaAMensaje = m;
		respuestaA.setVisible(true);
		respuestaAText.setVisible(true);
		respuestaA.setValue(m.getTexto().replaceAll("<Ocultado>", "").replaceAll("<Borrado>", ""));
	}
}