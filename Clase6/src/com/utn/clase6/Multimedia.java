package com.utn.clase6;

//Ejercicio1 
//1) Escribe una clase Multimedia para almacenar 
//información de los objetos de tipo multimedia 
//(películas, discos, mp3,mp4…). Esta clase contiene
//título, autor, formato, y duración como atributos.
//El formato puede ser uno de los siguientes: wav, mp3,
//midi, avi, mov, mpg, cdAudio y dvd. El valor de todos los atributos
//se pasa por parámetro en el momento de crear el objeto. Esta clase 
//tiene además, un método para devolver cada uno de los atributos y un 
//método toString() que devuelve la información del objeto. Por último, 
//un método equals() que recibe un objeto de tipo Multimedia y devuelve
//true en caso de que el título y el autor sean iguales y false en caso
//contrario.
public class Multimedia {

	private String titulo;
	private String autor;
	private double duracion;
	// dato tipo enumerable
	private Formato formato;

	public Multimedia(String titulo, String autor, Formato formato, double duracion) {

		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	@Override
	public String toString() {
		return "Multimedia [titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + ", formato=" + formato
				+ "]";
	}

	public boolean equals(Multimedia m) {

		return titulo.equals(m.getTitulo()) && autor.equals(m.getAutor());
	}

}
