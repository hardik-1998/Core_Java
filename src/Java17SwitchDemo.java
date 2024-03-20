public class Java17SwitchDemo {
    public static void main(String[] args) {
        Month month = Month.JANUARY;
        var result = switch (month) {
            case JANUARY, MARCH, MAY, JULY, SEP, NOV -> "odd";
            case FEBRUARY, APRIL, JUNE, AUG, OCT, DEC -> "even";
            default -> "neither";
        };
            System.out.println("Month: " + result);
        ThreadSafeSingleInstance abc = ThreadSafeSingleInstance.getInstance();
        System.out.println("abc = " + abc);
        ThreadSafeSingleInstance def = ThreadSafeSingleInstance.getInstance();
        System.out.println("def = " + def);
        System.out.println(abc == def);
        }
    }
