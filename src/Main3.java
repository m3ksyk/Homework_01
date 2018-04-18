import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {


    static boolean verifyLogin(String input) {
        String reg = "^(?=.{5,}$)(?![0-9])[a-zA-Z0-9\\-_]+(?<![_-])$";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {
        String login1 = "abada";
        String login2 = "1mungo";
        String login3 = "the-man";
        String login4 = "man";
        String login5 = "man_nam";
        System.out.println(verifyLogin(login1));
        System.out.println(verifyLogin(login2));
        System.out.println(verifyLogin(login3));
        System.out.println(verifyLogin(login4));
        System.out.println(verifyLogin(login5));

    }
}