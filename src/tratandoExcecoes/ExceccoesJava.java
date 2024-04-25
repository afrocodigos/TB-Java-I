package tratandoExcecoes;

public class ExceccoesJava {
    //checked excepction
    public static void verificarTamanhoDoTweet(String tweet) {
       try {
          if (tweet.length() > 5) {
            throw new Exception("Tweet muito longo! Para um tweet ser válido precisa até 5 caracteres");
          } else {
            System.out.println("Tweet publicado com sucesso" + tweet);
          }
       } catch (Exception exception) {
        System.out.println("Erro: " + exception.getMessage());
       }
    }

    //unchecked exception
    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }

    public static void main(String[] args) {
        //checked excepction
        System.out.println("-------checked excepction----------");
        verificarTamanhoDoTweet("Meu nome é Júlio César, mas podem me chamar de Júlião");
        System.out.println("-------------------");
        verificarTamanhoDoTweet("JC");

        System.out.println("-------------------");
        //unchecked exception
        System.out.println("--------unchecked exception----------");
        try {
            int resultado = dividir(7, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException exception) {
            System.out.println("Erro ao dividir por zero:" +exception.getMessage());
        }

    }
}

