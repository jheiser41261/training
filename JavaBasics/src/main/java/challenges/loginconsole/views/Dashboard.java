package challenges.loginconsole.views;

import challenges.loginconsole.services.LoginService;

import java.util.Scanner;

public class Dashboard {
    public static void view(){
        LoginService loginService = new LoginService();
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while(running) {
            System.out.println("DASHBOARD VIEW");
            System.out.println("0 - Exit" + "\n");
            System.out.print("> ");
            String input = sc.nextLine();

            switch (input){
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("INVALID INPUT");
                    break;
            }
        }
    }
}
