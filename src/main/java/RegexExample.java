import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by HHER on 9/14/2017.
 */
public class RegexExample {

    private static final String input = "Given I  visit   homedepot!.,com";
    private static final String output = "neviG I  tisiv   topedemoh!.,moc";

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }

    public static void main(String[] args){

        System.out.print(regexHomeDepot(input));

    }

    public static String regexHomeDepot(String input){
        String output = "";

        Pattern pattern = Pattern.compile("(\\w+)(\\s+)(\\w+)(\\s+)(\\w+)(\\s+)(\\w+)([!.,]+)(\\w+)");
        Matcher matcher = pattern.matcher(input);

        for (int i = 1; i < matcher.groupCount() + 1; i++){
            if (matcher.group(i).matches("\\w+")){
                for (int j = matcher.group(i).length()-1 ; j >= 0; j--){
                    output = output + matcher.group(i).charAt(j);
                }
            } else {
                output = output + matcher.group(i);
            }
        }

        return output;
    }

}
