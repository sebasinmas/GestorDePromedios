import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Float> notas = new ArrayList<Float>();
        Random rand = new Random();
        int MAX = 7000;
        int MIN = 1000;

        for (int i = 0; i < 10; i++) {
            notas.add((rand.nextInt(MIN,MAX)+1)/1000.0f);
        }

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

        System.out.println(notas);
    }
}