package semana02;

/**
 *
 * @author Aimar Berrocal
 */
public class Alumno {
    int codigo, nota1, nota2;
    String nombre;
    
    double promedio(){
        return (nota1 + nota2) / 2.0;
    }
}
