package com.MDS2.ForoUal.Interfaz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Vector;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component.Event;


public class Ver_Temas extends Ver_Temas_Ventanas{
	ArrayList<Tema> temas = new ArrayList<Tema>();
	//public Vector<Visualizar_Temas_No_Reg> _visualizar_Temas_No_Reg = new Vector<Visualizar_Temas_No_Reg>();
	//public Vector<Visualizar_Temas_Registrado> _visualizar_Temas = new Vector<Visualizar_Temas_Registrado>();
	public Vector<Ver_Tema> _visualizar_Tema = new Vector<Ver_Tema>();
	public static int temaFuc = 0;
	public static int order = 0;
	Seccion s;
	
	public Ver_Temas(Seccion s) {
		temaFuc = 0;
		this.s = s;
		Tema[] tnr = foroUI.db.Cargar_Temas_No_Registrado(s.getID()+"");
		Tema[] tr = new Tema[] {};
		Tema[] tmod = new Tema[] {};
		Tema[] tadm = new Tema[] {};
		
		if(foroUI.user != null) {
			tr = foroUI.db.Cargar_Temas_Registrado(s.getID()+"");
			if(foroUI.privilegios == foroUI.Privilegios.moderador || foroUI.privilegios == foroUI.Privilegios.administrador)
				tmod = foroUI.db.Cargar_Temas_Moderador(s.getID()+"");
			if(foroUI.privilegios == foroUI.Privilegios.administrador)
				tadm = foroUI.db.Cargar_Temas_Administrador(s.getID()+"");
		}	
		
		for (Tema t : tnr)
			temas.add(t);
		for(Tema t : tr)
			temas.add(t);
		for (Tema t : tmod)
			temas.add(t);
		for(Tema t : tadm)
			temas.add(t);
		

		switch (order) {
		case 0:
			temas.sort(new Comparator<Tema>() {
				@Override
		        public int compare(Tema t1, Tema t2)
		        {
		            return  t1.getTitulo().toLowerCase().compareTo(t2.getTitulo().toLowerCase());
		        }
			});
			break;
		case 2:
			temas.sort(new Comparator<Tema>() {
				@Override
		        public int compare(Tema t1, Tema t2)
		        {
		            return  ((Integer)t2.getNumMensjes()).compareTo(t1.getNumMensjes());
		        }
			});
			break;
		case 1:
			temas.sort(new Comparator<Tema>() {
				@Override
		        public int compare(Tema t1, Tema t2)
		        {
		            return  ((Integer)t2.getNumeroMeGusta()).compareTo(t1.getNumeroMeGusta());
		        }
			});
			break;
		}
		
	System.out.println("Temas:"+temas.size() +" Temas NR " + tnr.length + "Temas R " + tr.length);
	
	for(Tema t : temas) {
		addComponent(new Ver_Tema(t));
		System.out.println("Hola");
	}
		
	}
	public void Ordenar_temas_frecuencia() {
		order = 1;
		foroUI.singleton.VisualizarSeccion(s);
	}

	public void Ordenar_temas_megusta() {
		order = 2;
		foroUI.singleton.VisualizarSeccion(s);
	}
	public void Ordenar_temas_alp() {
		order = 0;
		foroUI.singleton.VisualizarSeccion(s);
	}

	public void cargarTemas() {
		throw new UnsupportedOperationException();
	}
}