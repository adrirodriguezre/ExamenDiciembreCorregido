package Ej4;

import java.util.ArrayList;


public class Edificio {
	//Modelizar la clase de Edificio, con atributos id, calle, poblacion y codigo_postal (tendr�n esos nombres)
		private int id;
		private String calle;
		private String poblacion;
		private int codigo_postal;
		
		//Adem�s tendr� una colecci�n de elementos de tipo Piso
		private ArrayList<Piso> listaPisos;

		
		//Crear getters y setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCalle() {
			return calle;
		}

		public void setCalle(String calle) {
			this.calle = calle;
		}

		public String getPoblacion() {
			return poblacion;
		}

		public void setPoblacion(String poblacion) {
			this.poblacion = poblacion;
		}

		public int getCodigo_postal() {
			return codigo_postal;
		}

		public void setCodigo_postal(int codigo_postal) {
			this.codigo_postal = codigo_postal;
		}

		public ArrayList<Piso> getListaPisos() {
			return listaPisos;
		}

		public void setListaPisos(ArrayList<Piso> listaPisos) {
			this.listaPisos = listaPisos;
		}

		
		
		//crear constructor
		public Edificio(int id, String calle, String poblacion, int codigo_postal, ArrayList<Piso> listaPisos) {
			super();
			this.id = id;
			this.calle = calle;
			this.poblacion = poblacion;
			this.codigo_postal = codigo_postal;
			this.listaPisos = listaPisos;
		}

		@Override
		public String toString() {
			return "Edificio [id=" + id + ", calle=" + calle + ", poblacion=" + poblacion + ", codigo_postal="
					+ codigo_postal + ", listaPisos=" + listaPisos + "]";
		}

		
	
}//Edificio

