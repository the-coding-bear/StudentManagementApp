import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {
        System.out.print("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Press 1 to Add student");
            System.out.println("Press 2 to Delete student");
            System.out.println("Press 3 to Display student");
            System.out.println("Press 4 to Exit app");
            int c = Integer.parseInt(br.readLine());

            if (c==1){
                //add student
            } else if (c==2) {
                //delete student
            } else if (c==3) {
                //display student
            } else if (c==4) {
                //exit
                break;
            }else{

            }
        }
        System.out.println("Thank you for using my application....");
        System.out.println("See you soon...bye bye");
    }
}