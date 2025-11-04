import java.util.Optional;
import java.util.Scanner;

public class ExemploComIsPresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nomeDigitado = scanner.nextLine();

        //Criando o Optional com operador ternário - condição? valor se verdadeiro: valor se falso:
        Optional<String> nomeOptional = Optional.ofNullable(nomeDigitado.isBlank()? null : nomeDigitado);

        //usando o ifPresent:
        nomeOptional.ifPresent(nome -> System.out.println("Olá : " + nome));

        //Usando o isEmpty:
        if(nomeOptional.isEmpty()){
            System.out.println("Olá, visitante!");

            //Podemos substituir o if por um operador ternário:

            System.out.println("Olá, " + nomeOptional.orElse("visitante") + "!");
        }
            scanner.close();

    }
}
