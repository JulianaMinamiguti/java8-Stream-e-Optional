import java.util.List;
import java.util.stream.Collectors;

public class FiltrarNomes {
    public static void main(String[] args) {

        // Lista original de nomes
        List<String> nomes = List.of("José", "Joao", "Maria");

        // Filtrar nomes que começam com "J" e remover duplicados
        List<String> filtrados = nomes.stream()
                .filter(nome -> nome.startsWith("J"))
                .distinct()
                .collect(Collectors.toList());

        // Imprimir lista original
        System.out.println("Lista original:");
        nomes.forEach(System.out::println);

        // Imprimir lista filtrada
        System.out.println("\nNomes filtrados que começam com 'J':");
        filtrados.forEach(System.out::println);
    }
}