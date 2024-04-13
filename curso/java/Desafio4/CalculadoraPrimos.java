package Desafio4;

class CalculadoraPrimos {

    //#region ...Método exibirNumerosPrimosEObterSoma
    public void exibirNumerosPrimosEObterSoma(int inicio, int fim) {
        int somaPrimos = 0;
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.println("O número " + i + " é Primo!");
                somaPrimos += i;
            }
        }
        System.out.println("A soma dos números primos entre " + inicio + " e " + fim + " é: " + somaPrimos);
    }
    //#endregion

    //#region ...Método ehPrimo
    private boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    //#endregion
}
