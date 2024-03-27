import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Programa que detecta los siguientes tipos de números:");
        System.out.println("1. Perfecto");
        System.out.println("2. Defectivo");
        System.out.println("3. Abundante");
        System.out.println("Seleccione su opción 1, 2 o 3: ");

        String input = bufferedReader.readLine();
        int option = Integer.parseInt(input);

        System.out.println("------------");
        System.out.println("Escriba el número: ");

        input = bufferedReader.readLine();
        int numero = Integer.parseInt(input);

        switch (option) {
            case 1:
                DetectarNumero numeroPerfecto = new NumeroPerfecto();
                numeroPerfecto.detectar(numero);
                break;
            case 2:
                DetectarNumero numeroDefectivo = new NumeroDefectivo();
                numeroDefectivo.detectar(numero);
                break;
            case 3:
                DetectarNumero numeroAbundante = new NumeroAbundante();
                numeroAbundante.detectar(numero);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    }
}
