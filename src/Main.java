import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numRandom = Arrays.asList("1", "4", "6", "8", "2", "3", "5");
        numRandom.forEach(System.out::println);
        //coloque os 5 numeros dentro de um set

        System.out.println("Os 5 primeiros");
        Set<String> collect = numRandom.stream().limit(5).collect(Collectors.toSet());
        System.out.println(collect);

        System.out.println("Lista em inteiros");
        List<Integer> integerList = numRandom.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(integerList);

        System.out.println("Numeros pares maiores que 2");
        List<Integer> ListPares = integerList.stream()
                .filter(integer -> integer % 2 == 0 && integer > 2).collect(Collectors.toList());
        System.out.println(ListPares);

        System.out.println("Media dos numeros");
        integerList.stream().mapToInt(s -> s).average().ifPresent(System.out::println);

        System.out.println("Remover os valores impares");
        integerList.removeIf(integer -> integer % 2 == 1);
        System.out.println(integerList);
    }
}