public class NumeroPerfecto extends CalculoSumaDivision{
    /**
     * Este método detecta si un número es perfecto
     * @param numero El número para verificar si es perfecto.
     */
    public void detectar(int numero) {
        int suma = calculosumaDivision(numero);

        if (numero == suma) {
            System.out.println("El número " + numero + " es perfecto");
        } else {
            System.out.println("El número " + numero + " no es perfecto");
        }
    }
}
