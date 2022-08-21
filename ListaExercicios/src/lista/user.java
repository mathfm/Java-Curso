package lista;



public class user {
    private String firstname;
    private String lastname;
    private int age;

    public user(String firstnameUser, String lastnameUser, int ageUser){
        this.firstname = firstnameUser.toUpperCase();
        this.lastname = lastnameUser.toUpperCase();
        this.age = ageUser;
    };
    public void setFirstname(String firstnameUser){
        this.firstname = firstnameUser;
    }
    public void setLastName(String lastnameUser){
        this.lastname = lastnameUser;
    }
    public void setAge(int ageUser){
        this.age = ageUser;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
}
