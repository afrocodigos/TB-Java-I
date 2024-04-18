public class printVariaveis {
    public static double valorPi = 3.14;
    public static int [] nota = new int[4];
    public static double [] notaDosAlunos = {10.0, 9.0, 8.7};
    public static double [][] matrizNotas = {{10,9.8},{9.7,9.3},{9.0,9.6}};

    public static void main (String[] args){
        for (int i = 0; i < 4; i++) {
            nota[i] = i;
        }

        System.out.println("Variável double:\n" + valorPi);
        System.out.println("Vetor de inteiros:\n" + nota[0] + ", " + nota[1] + ", " + nota[2] + ", " + nota[3]);
        System.out.println("Vetor de doubles:\n" + notaDosAlunos[0] + ", " + notaDosAlunos[1] + ", " + notaDosAlunos[2]);
        System.out.println("Matriz de doubles:\n" + matrizNotas[0][0] + ", " + matrizNotas[0][1] +
                "\n" + matrizNotas[1][0] + ", " + matrizNotas[1][1] +
                "\n" + matrizNotas[2][0] + ", " + matrizNotas[2][1]);
    }
}
