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
        System.out.println("Voy a procesar de manera imperativa:");
        procesarNotasImperativo(notas);
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
        int notasMenorA36=0;
        int notasMayorOIgualA4=0;
        int notasEntre36y39=0;

        for (Float nota : notas) {
            if (nota < 3.6f)
                notasMenorA36++;
            if (nota >= 4.0f)
                notasMayorOIgualA4++;
            if (nota >= 3.6f && nota <4.0f)
                notasEntre36y39++;
        }
        System.out.println("Notas menor a 3.6: "+notasMenorA36);
        System.out.println("Notas mayor o igual a 4.0: "+notasMayorOIgualA4);
        System.out.println("Notas entre [3.6-4.0): "+notasEntre36y39);
    }
}