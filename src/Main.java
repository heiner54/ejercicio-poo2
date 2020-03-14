import unac.edu.co.poo2.Asignatura;
import unac.edu.co.poo2.Estudiante;
import unac.edu.co.poo2.Exception.Notainsufiente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Asignatura> asignatura = new ArrayList<Asignatura>();
        List<Estudiante> estudiante = new ArrayList<Estudiante>();
        Asignatura listaMateria = new Asignatura();

        Asignatura m1 = new Asignatura("Electiva I");
        asignatura.add(m1);
        Asignatura m2 = new Asignatura("Electiva II");
        asignatura.add(m2);
        Asignatura m3 = new Asignatura("Electiva III");
        asignatura.add(m3);

        Scanner seleccion = new Scanner(System.in);
        String respuesta;
        int i = 1;
        do {
            System.out.println("3. Agregar alumno");
            System.out.println("5. Salir");

            respuesta = seleccion.next();
            switch (respuesta) {
                case "1":
                    /*System.out.println("Nombre de la Materia");
                    String nombreMateria = seleccion.next();
                    Materia a = new Materia(i, nombreMateria);
                    asignatura.add(a);
                    i++;
                    respuesta = "0";*/
                    break;
                case "2":
                    /*System.out.println("Introduce la id de la materia a consultar");
                    int idm = seleccion.nextInt();
                    if (asignatura.size() < idm) {
                        System.out.println("La materia " + asignatura.get(i).getNombreMateria() + " se encuentra registrada");
                    } else {
                        System.out.println(asignatura.get(idm - 1));
                    }
                    respuesta = "0";*/
                    break;
                case "3":
                    System.out.println("Ingrese nombre");
                    String nombre = seleccion.next();
                    System.out.println("ingrese Materia a escoger");
                    for (int j = 0; j < asignatura.size(); j++) {
                        System.out.println("Nombre de la Materia " +j +" " + asignatura.get(j).getNombre());
                    }
                    int j = seleccion.nextInt();
                    System.out.println("Nota de la Materia " + asignatura.get(j).getNombre());
                    Double nota = seleccion.nextDouble();
                    Asignatura es = new Asignatura(nombre);
                    asignatura.add(es);
                    i++;
                    try {
                        es.Notas(nota);
                    } catch (Notainsufiente ex) {
                        System.out.println(ex.getMessage());
                    /*} catch () {
                        System.out.println("No puede insertar caracteres de letras en un valor numerico");*/
                    } finally {

                    }
                    respuesta = "0";
                    break;
                case "4":
                    System.out.println("Alumnos en la clase: \n" + estudiante + listaMateria.toString());
                    respuesta = "0";
                    break;
                case "5":
                    System.out.println("adios");
                    respuesta = "1";
                    break;
                default:
                    System.out.println("Opción invalida. Debes elegir 1,2 ó 3");
                    respuesta = "0";

            }

        } while (respuesta == "0");

    }
}