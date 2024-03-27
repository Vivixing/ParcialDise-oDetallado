public class NumeroDefectivo extends CalculoSumaDivision{
    /**
     * Este método detecta si un número es defectivo
     * @param numero El número para verificar si es defectivo.
     */
    public void detectar(int numero) {
        int suma = calculosumaDivision(numero);

        if (numero > suma) {
            System.out.println("El número " + numero + " es defectivo");
        } else {
            System.out.println("El número " + numero + " no es defectivo");
        }
    }
}
