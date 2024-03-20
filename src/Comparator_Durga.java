import java.util.Comparator;
import java.util.TreeSet;

public class Comparator_Durga {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new myComparator());
        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(1);
        System.out.println(treeSet);
    }
}
class myComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if ((Integer)o1 < (Integer) o2) return 1;
        else if ((Integer)o1 > (Integer) o2) {
            return -1;
        }else return 0;
    }
}
