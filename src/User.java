/*import java.util.Scanner;

abstract class Validation{
    public abstract void checkUserData();
}



class User{

    public String name;
    public String surname;
    public int age;

    private String password;

    public User(String userName, String userSurname, int userAge){
        this.name = userName;
        this.surname = userSurname;
        this.age = userAge;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public String getPassword(){
        return this.password;
    }

    public static void main(String[] args) {

        User user = new User("Thabo","Gumede",23);
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your password"+user.name+" "+user.surname);x
        user.setPassword(object.nextLine());

        System.out.println("The user is: "+user.name+" "+user.surname+" "+user.age+" pass is: "+ user.getPassword());

    }
}*/