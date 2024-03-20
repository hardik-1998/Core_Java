import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner x1 = new StringJoiner(",");
        StringJoiner x2 = new StringJoiner(",","{","}");
        StringJoiner x3 = new StringJoiner(":");
        x1.add("Hardik").add("Hiren").add("Pravin");
        x2.add("Hardik").add("Hiren").add("Pravin");
        x3.add("My").add("Family");

        System.out.println(x1.toString());//Hardik,Hiren,Pravin
        System.out.println(x2.toString());//{Hardik,Hiren,Pravin}
        System.out.println(x3.toString());//My:Family
        System.out.println(x1.merge(x3));
        String date1 = String.join("-","2023","08","22");
        System.out.println(date1);//2023-08-22

        List<String> languages = Arrays.asList("Java","Python","JavaScript");
        System.out.println(languages);//[Java, Python, JavaScript]
        System.out.println(String.join(", ",languages));//Java, Python, JavaScript
        System.out.println(languages.stream().map(x -> x).collect(Collectors.joining("|")));//Java|Python|JavaScript
    }
}
