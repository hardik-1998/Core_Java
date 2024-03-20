import java.util.*;

public class PracticeCompareto {
    public static void main(String[] args) {

        Comparator<String> sortBylen = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                }
                else return 0;
            }
        };

//        List<String> strings = new ArrayList<>();
        TreeSet<String> strings = new TreeSet<>(new myCompateto());
        strings.add("sakar");
        strings.add("abhishek");
        strings.add("hardik");
        strings.add("hiren");
//        Collections.sort(strings, sortBylen);
        System.out.println(strings);
    }
}

class myCompateto implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        if (s1.length() == s2.length()) {
            return 1;
        }
        else if (s1.length() < s2.length()) return 1;
        else if (s1.length() > s2.length()) {
            return -1;
        }else return 0;
    }
}
