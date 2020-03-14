package unac.edu.co.poo2;

import unac.edu.co.poo2.Exception.Notainsufiente;

public class Estudiante {
    private int idAlumno;
    private String nombre;
    private float nota;

    public Estudiante(int idAlumno, String nombre, float nota) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.nota= nota;
    }

    public void setNota(float nota){
        this.nota=nota;
    }


    @Override
    public String toString() {
        return "ID Alumno: "+idAlumno+" Nombre: "+nombre+  "+nota+" + nota;
}
}
