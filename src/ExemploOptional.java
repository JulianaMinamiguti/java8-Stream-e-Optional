import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        String nome = "Java";

        Optional<String> nomeOptional1 = Optional.of(nome);
        Optional<String> nomeOptional2 = Optional.empty();

        System.out.println(nomeOptional1.isPresent());
        System.out.println(nomeOptional2.isPresent());

        String nomeVazio= null;
        Optional<String>nomeVazioOptional = Optional.ofNullable(nomeVazio);
        nomeVazioOptional.ifPresent(System.out::println);

        String nomeOuDefault = nomeVazioOptional.orElse("JAVA 8");
        System.out.println(nomeOuDefault);

        String nomeOuGerado =
                nomeVazioOptional.orElseGet(()-> "JAVA 11");
        System.out.println(nomeOuGerado);

        nomeVazioOptional
                .orElseThrow(() -> new RuntimeException("Java"));
            }
        }
