package usuarios;

public class User {
    private String FirstName;
    private String LastName;

    private static int contador = 0;
    public User(String firstName, String lastName){
        this.FirstName = firstName;
        this.LastName = lastName;
        contador += 1;

    }



    public String nomecomp(){
        return FirstName + " " + LastName;
    }

}
