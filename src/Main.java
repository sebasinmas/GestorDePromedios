import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Float> notas = new ArrayList<Float>();

        //Este es el rango inclusivo en el que se generarán notas//
        int MAX = 7000;
        int MIN = 1000;
        //-------------------------------------------------------//

        llenarNotas(notas, MIN, MAX);
        procesarNotasFuncional(notas);
    }

    public static void llenarNotas(List<Float> notas,int MIN, int MAX) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            notas.add((rand.nextInt(MIN,MAX)+1)/1000.0f);
        }
        notas.sort(null);
//        Esta parte del código es para confirmar que mi algoritmo puede crear resultados en el rango [1.0 - 7.0]
//        int iterador = 0;
//        while (true){
//            float numero = (rand.nextInt(MIN,MAX)+1)/1000.0f;
//            if (numero == 7.00f){
//                System.out.println("El resultado de la nota es: " + numero);
//                break;
//            }
//            iterador++;
//            if (iterador >= 100000000) {
//                System.out.println("Se cumplieron 100000000 iteraciones");
//                break;
//            }
//
//        }

        System.out.println("Las notas generadas son: \n"+notas);

    }

    public static void procesarNotasFuncional(List<Float> notas) {
        System.out.println("El número de notas < a 3.6 es: "+notas.stream().filter(nota -> nota < 3.6f).count());
        System.out.println("El número de notas >= a 4.0 es: "+notas.stream().filter(nota -> nota >=4.0f).count());
        System.out.println("El número de notas entre [3.6 y 4.0) es: "+notas.stream().filter(nota -> nota >= 3.6f && nota <4.0f).count());
    }
    public static void procesarNotasImperativo(List<Float> notas) {
    }
}