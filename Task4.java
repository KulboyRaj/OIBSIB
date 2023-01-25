
import java.util.Scanner;
import java.time.LocalDateTime;
class user {
    String username;
    String password;
    String email;
    user(String username, String password, String email){
        this.email=email;
        this.password=password;
        this.username=username;
    }
}
public class Task4 {
    public static void main(String[] args){
        int AccountCount=0,search=-1;
        LocalDateTime now = LocalDateTime.now();
        user[] arr1=new user[10];
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Choose option");
            System.out.println("1 login");
            System.out.println("2 SignUp");
            int a=sc.nextInt();
            if(a==1){
                search=-1;
                System.out.println("Enter username");
                String Username=sc.next();
                System.out.println("Enter password");
                String UserPassword=sc.next();
                for (int i=0;i<AccountCount;i++){
                    if(arr1[i].username.equals(Username)){
                        if(arr1[i].password.equals(UserPassword)){
                            System.out.println("Login Successfully");
                            search=i;
                            break;

                        }
                    }
                }
                if(search==-1){
                    System.out.println("Try again");
                }
                else {
                    while(true) {
                        System.out.println("Welcome "+arr1[search].username+" !");
                        int choose;
                        System.out.println("1 Profile");
                        System.out.println("2 Give test");
                        System.out.println("3 Logout");
                        choose=sc.nextInt();
                        if(choose==1){

                                System.out.println("Username : "+arr1[search].username);
                                System.out.println("Password : "+arr1[search].password);
                                System.out.println("Email : "+arr1[search].email);
                                System.out.println("1 save");
                                System.out.println("2 update");
                                int up;
                                up=sc.nextInt();
                                if(up==2){
                                    System.out.println("Enter Email");
                                    String Email1=sc.next();
                                    sc.nextLine();
                                    System.out.println("Enter username");
                                    String Username1=sc.next();
                                    System.out.println("Enter password");
                                    String UserPassword1=sc.next();
                                    arr1[search].email=Email1;
                                    arr1[search].username=Username1;
                                    arr1[search].password=UserPassword1;
                                    System.out.println(arr1[search].password);
                                    System.out.println("Profile Update Successfully");
                                }
                        } else if (choose==2) {
                            while(true) {
                                System.out.println("1 Maths");
                                System.out.println("2 Science");
                                int choose1 = sc.nextInt();
                                if (choose1 == 1) {
                                    int[] ans = new int[]{4, 3, 2, 4, 1};
                                    int option, marks = 0, count = 0;
                                    int startTime = now.getMinute();
                                    System.out.println("1. what is 3+5?");
                                    System.out.println("1.) 4");
                                    System.out.println("2.) 5");
                                    System.out.println("3.) 6");
                                    System.out.println("4.) 8");
                                    option = sc.nextInt();
                                    if (option == ans[count])
                                        marks++;
                                    count++;
                                    int currentTime = now.getMinute();
                                    if (currentTime - startTime > 5) {
                                        System.out.println("your marks is:" + marks+"/5");
                                        break;
                                    }
                                    System.out.println("Remaining time : " + (5 - (currentTime - startTime)) + "Min");
                                    System.out.println("2. what is 3*9?");
                                    System.out.println("1.) 41");
                                    System.out.println("2.) 50");
                                    System.out.println("3.) 27");
                                    System.out.println("4.) 24");
                                    option = sc.nextInt();
                                    if (option == ans[count])
                                        marks++;
                                    count++;
                                    currentTime = now.getMinute();
                                    if (currentTime - startTime > 5) {
                                        System.out.println("your marks is:" + marks+"/5");
                                        break;
                                    }
                                    System.out.println("Remaining time : " + (5 - (currentTime - startTime)) + "Min");
                                    System.out.println("3. what is sin 30?");
                                    System.out.println("1.) 4");
                                    System.out.println("2.) 0.5");
                                    System.out.println("3.) 0.6");
                                    System.out.println("4.) 8.1");
                                    option = sc.nextInt();
                                    if (option == ans[count])
                                        marks++;
                                    count++;
                                    currentTime = now.getMinute();
                                    if (currentTime - startTime > 5) {
                                        System.out.println("your marks is:" + marks+"/5");
                                        break;
                                    }
                                    System.out.println("Remaining time : " + (5 - (currentTime - startTime)) + "Min");
                                    System.out.println("4. what is 10-5?");
                                    System.out.println("1.) 4");
                                    System.out.println("2.) -5");
                                    System.out.println("3.) -6");
                                    System.out.println("4.) 5");
                                    option = sc.nextInt();
                                    if (option == ans[count])
                                        marks++;
                                    count++;
                                    currentTime = now.getMinute();
                                    if (currentTime - startTime > 5) {
                                        System.out.println("your marks is:" + marks+"/5");
                                        break;
                                    }
                                    System.out.println("Remaining time : " + (5 - (currentTime - startTime)) + "Min");
                                    System.out.println("5. what is square of 9?");
                                    System.out.println("1.) 81");
                                    System.out.println("2.) 25");
                                    System.out.println("3.) 36");
                                    System.out.println("4.) 9");
                                    option = sc.nextInt();
                                    if (option == ans[count])
                                        marks++;
                                    count++;
                                    currentTime = now.getMinute();
                                    if (currentTime - startTime > 5) {
                                        System.out.println("your marks is:" + marks+"/5");
                                        break;
                                    }
                                    System.out.println("Remaining time : " + (5 - (currentTime - startTime)) + "Min");
                                    System.out.println("1 Save");
                                    option = sc.nextInt();
                                    if (option == 1) {
                                        System.out.println("your marks is:" + marks+"/5");
                                        marks = 0;
                                        count = 0;
                                        break;
                                    }


                                } else if (choose1 == 2) {
                                    int[] ans = new int[]{2, 4, 3, 3, 3};
                                    int option, marks = 0, count = 0;
                                    int startTime = now.getMinute();
                                    System.out.println("1. What is the PH of H2O?");
                                    System.out.println("1.) 6");
                                    System.out.println("2.) 7");
                                    System.out.println("3.) 8");
                                    System.out.println("4.) 9");
                                    option = sc.nextInt();
                                    if (option == ans[count])
                                        marks++;
                                    count++;
                                    int currentTime = now.getMinute();
                                    if (currentTime - startTime > 5) {
                                        System.out.println("your marks is:" + marks+"/5");
                                        break;
                                    }
                                    System.out.println("Remaining time : " + (5 - (currentTime - startTime)) + "Min");
                                    System.out.println("2. Which of the following gas is reduced in the reduction process?");
                                    System.out.println("1.) Oxygen");
                                    System.out.println("2.) Helium");
                                    System.out.println("3.) Carbon");
                                    System.out.println("4.) Hydrogen");
                                    option = sc.nextInt();
                                    if (option == ans[count])
                                        marks++;
                                    count++;
                                    currentTime = now.getMinute();
                                    if (currentTime - startTime > 5) {
                                        System.out.println("your marks is:" + marks+"/5");
                                        break;
                                    }
                                    System.out.println("Remaining time : " + (5 - (currentTime - startTime)) + "Min");
                                    System.out.println("3. Which of the following compound is mainly used in hand sanitizer?");
                                    System.out.println("1.) Aldehyde");
                                    System.out.println("2.) Acetic acid");
                                    System.out.println("3.) Alcohol");
                                    System.out.println("4.) Ketone");
                                    option = sc.nextInt();
                                    if (option == ans[count])
                                        marks++;
                                    count++;
                                    currentTime = now.getMinute();
                                    if (currentTime - startTime > 5) {
                                        System.out.println("your marks is:" + marks+"/5");
                                        break;
                                    }
                                    System.out.println("Remaining time : " + (5 - (currentTime - startTime)) + "Min");
                                    System.out.println("4. What is the S.I unit of frequency?");
                                    System.out.println("1.) Diopter");
                                    System.out.println("2.) Second");
                                    System.out.println("3.) Hertz");
                                    System.out.println("4.) Meter");
                                    option = sc.nextInt();
                                    if (option == ans[count])
                                        marks++;
                                    count++;
                                    currentTime = now.getMinute();
                                    if (currentTime - startTime > 5) {
                                        System.out.println("your marks is:" + marks+"/5");
                                        break;
                                    }
                                    System.out.println("Remaining time : " + (5 - (currentTime - startTime)) + "Min");
                                    System.out.println("5. Acid turns blue litmus paper into which color?");
                                    System.out.println("1.) Black");
                                    System.out.println("2.) Blue");
                                    System.out.println("3.) Red");
                                    System.out.println("4.) Orange");
                                    option = sc.nextInt();
                                    if (option == ans[count])
                                        marks++;
                                    count++;
                                    currentTime = now.getMinute();
                                    if (currentTime - startTime > 5) {
                                        System.out.println("your marks is:" + marks+"/5");
                                        break;
                                    }
                                    System.out.println("Remaining time : " + (5 - (currentTime - startTime)) + "Min");
                                    System.out.println("1 Save");
                                    option = sc.nextInt();
                                    if (option == 1) {
                                        System.out.println("your marks is:" + marks + "/5");
                                        marks = 0;
                                        count = 0;
                                        break;

                                    }
                                }
                            }

                        }
                        else if (choose==3){
                            break;
                        }
                    }
                }
            } else if (a==2) {
                System.out.println("Enter Email");
                String Email=sc.next();
                sc.nextLine();
                System.out.println("Enter username");
                String Username=sc.next();
                System.out.println("Enter password");
                String UserPassword=sc.next();
                arr1[AccountCount]=new user(Username,UserPassword,Email);
                AccountCount+=1;
            }

        }

    }
}