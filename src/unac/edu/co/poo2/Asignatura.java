package unac.edu.co.poo2;

import unac.edu.co.poo2.Exception.Notainsufiente;

public class Asignatura {
    public String Nombre;

    public Asignatura() {
    }

    public Asignatura(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void Notas(Double nota) throws Notainsufiente {
        if(nota >=0){
            System.out.println("Nota aceptada");
        }else{
            throw new Notainsufiente("el valor de la nota es mas elevado que el establecido por la institucion");
        }
    }
}
