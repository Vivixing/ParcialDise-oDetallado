public abstract class CalculoSumaDivision implements DetectarNumero{
    /**
     * Este método calcula la suma de los divisores de un número
     * @param numero El número con el que se calcula la suma de los divisores.
     * @return La suma de los divisores del número.
     */
    protected int calculosumaDivision(int numero) {
        int suma = 0;

        for (int variableCalculoSumaDivision = 1; variableCalculoSumaDivision < numero; variableCalculoSumaDivision++) {
            if (numero % variableCalculoSumaDivision == 0) {
                suma += variableCalculoSumaDivision;
            }
        }

        return suma;
    }
}
