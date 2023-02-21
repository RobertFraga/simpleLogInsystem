import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        String UserName;// username
        String PassWord;// password
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Register Username: ");// Register Username
        String user = Input.nextLine();
        System.out.print("Register Password: ");// Register Password
        String pass = Input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Username:" + user + " " + "Password:" + pass + "\n");// Show the registered info

        System.out.print("Enter Username: ");// ask to Enter Username
        UserName = Input.nextLine();
        if(UserName.equals(user)){
            System.out.print("Enter Password: ");// ask to Enter Password
            PassWord = Input.nextLine();

            if(PassWord.equals(pass)){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Welcome!!!");
            }

            else if(!PassWord.equals(pass)){
                do{
                    System.out.print("Try Again: ");
                    PassWord = Input.nextLine();
                }while (!PassWord.equals(pass));
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Welcome!!!");
            }
        }


        else if(!UserName.equals(user)){
            do{
                System.out.print("Try Again: ");
                UserName = Input.nextLine();
            }while (!UserName.equals(user));
            System.out.print("Enter Password: ");
            PassWord = Input.nextLine();

            if(PassWord.equals(pass)){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Welcome!!!");
            }

            else if(!PassWord.equals(pass)){
                do{
                    System.out.print("Try Again: ");
                    PassWord = Input.nextLine();
                }while (!PassWord.equals(pass));
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Welcome!!!");
            }
        }


    }
}
