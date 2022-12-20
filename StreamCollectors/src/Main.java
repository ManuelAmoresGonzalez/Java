import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Manuel", "JuanBautista");
        Alumno alumno2 = new Alumno("Manuela", "Juan Cahavez");
        Alumno alumno3 = new Alumno("Maria", "Florencia");
        Alumno alumno4 = new Alumno("Marlen", "Florencia");

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);


        Map<String, List<Alumno>> porEscuela = new HashMap<>();
        Map<String, List<Alumno>> porEscuelaDos = new HashMap<>();



// Forma antigüa y no tan correcta
        for(Alumno alumno: alumnos){
            if(!porEscuela.containsKey(alumno.getEscuela())){
                porEscuela.put(alumno.getEscuela(), new ArrayList<>());
            }
            porEscuela.get(alumno.getEscuela()).add(alumno);
        }
        System.out.println(porEscuela);



//Forma moderna y la mas correcta
        porEscuelaDos = alumnos.stream()
                        .collect(Collectors.groupingBy(Alumno::getEscuela));

        System.out.println(porEscuelaDos);
    }
}



class Alumno{
    private String nombre;
    private String escuela;
    public Alumno(String nuevoNombre, String nuevaEscuela){
        nombre = nuevoNombre;
        escuela = nuevaEscuela;
    }

    public String getEscuela(){
        return escuela;
    }

    public String getNombre() {
        return nombre;
    }
}