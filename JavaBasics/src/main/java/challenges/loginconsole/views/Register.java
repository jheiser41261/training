package challenges.loginconsole.views;

import challenges.loginconsole.models.User;
import challenges.loginconsole.services.LoginService;

import java.util.Scanner;

public class Register {
    public static void view(){
        LoginService loginService = new LoginService();
        Scanner sc = new Scanner(System.in);

        User user = new User();
        System.out.println("REGISTER");
        System.out.print("Username: ");
        user.setUsername(sc.nextLine());

        System.out.print("Password: ");
        user.setPassword(sc.nextLine());

        System.out.print("First Name: ");
        user.setFirstName(sc.nextLine());

        System.out.print("Last Name: ");
        user.setLastName(sc.nextLine());

        loginService.addUser(user);
    }
}
