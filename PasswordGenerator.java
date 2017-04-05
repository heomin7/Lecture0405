import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class PasswordGenerator {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("input your name:");

        String name = in.nextLine();

        String prefix = "$$";
        String postfix = "##";

        name = name.substring(0,1).toUpperCase() + name.substring(1);

        int strCntSquare = (name.length())* (name.length());

        String passwordGenerator = prefix + name + strCntSquare + postfix;

        System.out.println(passwordGenerator);

        in.close();


    }
}
