public class NumeroAbundante extends CalculoSumaDivision{
    /**
     * Este método detecta si un número es abundante
     * @param numero El número para verificar si es abundante.
     */
    public void detectar(int numero) {
        int suma = calculosumaDivision(numero);

        if (suma > 2 * numero) {
            System.out.println("El número " + numero + " es abundante");
        } else {
            System.out.println("El número " + numero + " no es abundante");
        }
    }

}
