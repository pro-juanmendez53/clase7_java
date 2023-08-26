package edu.ejercicios;

import pkgAlumnos.Alumno;
import pkgAlumnos.Curso;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args)
    {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.



        Alumno alumno1= new Alumno("001","Juan Perez", "444", "5 calle 8-14");
       //MANERA AGREGAR CURSO
        Curso cur = new Curso("555", "Programacioin", 500);
        alumno1.agregarCurso(cur);

        //MANERA 2 AGREGAR CURSO
        alumno1.agregarCurso(new Curso("12", "Derecho", 1));


        System.out.println("nombre del alumno: " + alumno1.getNombre());
        System.out.println("Carnet: " + alumno1.getCarnet());


        //iteracion
        for (Curso curso: alumno1.getCursos())
        {
            System.out.println("Curso: " + curso.getNombre() + "Valor: " + curso.getCosto());
        }

        //EJERCICIO 1 (CREAR 3 ALUMNOS CON 2 CURSOS CADA ALUMNO y Luego sacar el total a pagar de cada alumno y luego el total)


        Alumno alumno2= new Alumno("002", "Oscar Ruiz", "111", "2 calle 2-12");
        alumno2.agregarCurso(new Curso("05" , "Fisica" , 25));
        alumno2.agregarCurso(new Curso("04", "Etica" , 2));


        Alumno alumno3= new Alumno("003", "Zoe Li", "222", "3 calle 8-12");
        alumno3.agregarCurso(new Curso("05" , "Fisica" , 25));
        alumno3.agregarCurso(new Curso("01" , "Leyes" , 25));

        Alumno alumno4= new Alumno("004", "Feliks Reyes", "333", "5 calle 3-12");
        alumno4.agregarCurso(new Curso("05" , "Fisica" , 25));
        alumno4.agregarCurso(new Curso("04" , "Etica" , 25));

        double total=0;
        for (Curso curso: alumno2.getCursos())
        {
            total= total + curso.getCosto();
            System.out.println("Alumno: " + alumno2.getNombre() + "Cursos: " + alumno2.getCursos() + "Precio: " + curso.getCosto());
        }
        //EJEMPLO MAS ESTETICO

    }




}