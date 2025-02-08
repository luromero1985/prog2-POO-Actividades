package Final_16_2_24;

import java.time.LocalDate;

public class MainLibro {

	public static void main(String[] args) {

	
		Persona p1 = new Persona("Juan", "Díaz", "j@gmail.com");
		Persona p2 = new Persona("María", "Gómez", "maria.gomez@example.com");
		Persona p3 = new Persona("Carlos", "López", "carlos.lopez@example.com");
		Persona p4 = new Persona("Ana", "Fernández", "ana.fernandez@example.com");
		Persona p5 = new Persona("Pedro", "Martínez", "pedro.martinez@example.com");
		Persona p6 = new Persona("Laura", "Torres", "laura.torres@example.com");

		Libro l1 = new Libro(p1, "El misterio del tiempo", LocalDate.of(2015, 6, 10));
        Libro l2 = new Libro(p2, "Aventuras en la montaña", LocalDate.of(2018, 9, 22));
        Libro l3 = new Libro(p3, "Programación en Java", LocalDate.of(2020, 3, 15));
        Libro l4 = new Libro(p4, "Historias de la Luna", LocalDate.of(2012, 12, 5));

        Capitulo c3 = new Capitulo(p3, "Historia de la Computación", 15, "Historia");
        Capitulo c2 = new Capitulo(p2, "Redes Neuronales", 20, "Machine Learning");
        Capitulo c1 = new Capitulo(p1, "Introducción a la IA", 12, "Inteligencia Artificial");
        Capitulo c4 = new Capitulo(p4, "Algoritmos de Ordenamiento", 18, "Algoritmos");
        Capitulo c5 = new Capitulo(p5, "Bases de Datos Relacionales", 25, "Bases de Datos");
        Capitulo c6 = new Capitulo(p1, "Programación Orientada a Objetos", 22, "Programación");
        Capitulo c7 = new Capitulo(p2, "Estructuras de Datos", 30, "Informática");
        Capitulo c8 = new Capitulo(p3, "Sistemas Operativos", 28, "Software");
        Capitulo c9 = new Capitulo(p4, "Criptografía y Seguridad", 16, "Ciberseguridad");
        Capitulo c10 = new Capitulo(p5, "Redes y Comunicaciones", 24, "Redes");
        
        c1.addAutor(p6);
        c1.addAutor(p1);
        c2.addAutor(p2);
        c3.addAutor(p3);
        c3.addAutor(p1);
        c3.addAutor(p4);
        c5.addAutor(p6);
        c6.addAutor(p5);
        c6.addAutor(p6);
        c7.addAutor(p6);
        c8.addAutor(p1);
        c9.addAutor(p2);
        c10.addAutor(p2);
        c10.addAutor(p4);
        c10.addAutor(p1);
	}

}
