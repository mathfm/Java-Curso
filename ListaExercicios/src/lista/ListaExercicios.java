package lista;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ListaExercicios {
    public static void main(String[] args) {

        int[] numeros = new int[]{4, 5, 8, 1, 6, 0};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        List<ListaUser> usuarios = new ArrayList<>();
        int j = 0;



        while (j < 10){
            ListaUser lista = new ListaUser("User", j);
            usuarios.add(lista);
            j++;
        }



        user[] ids = new user[]{
                new user("Carlos", "Jose", 18),
                new user("joao", "rodrigo", 25)
        };


        for (user id : ids) {
            System.out.printf("\nusuario: %s %s", id.getFirstname(), id.getLastname());
        }
    }
}