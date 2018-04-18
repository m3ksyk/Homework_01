import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {

    public static void main(String[] args) {
        //this part adds employees named other than "kowalski" to an arraylist
        String reg = "(Kowalsk){1}";
        List<String> list = new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        List<String> list3= new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("earnings.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                Pattern compiledPattern = Pattern.compile(reg);
                Matcher matcher = compiledPattern.matcher(line);
                if(matcher.matches() == false){
                    list.add(line);
                }

            }

            for (String line:list) {
                String[] splitArray = line.split("\\.");
                String[] splitArray2=splitArray[0].split(",");

                int val=Integer.parseInt(splitArray[2].trim());
                list2.add(val);
            }

            Collections.sort(list2);

            for (int value:list2.subList(list2.size()-3,list2.size()))
                for (String line : list) {
                    Pattern compiledPattern = Pattern.compile(String.valueOf(value));
                    Matcher matcher = compiledPattern.matcher(p);
                    if(matcher.find()) {
                        list3.add(p);
                        break;
                    }
                }
                for (String person:list3) {
                    System.out.println(person);

                }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
