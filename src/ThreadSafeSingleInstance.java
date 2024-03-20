public final class ThreadSafeSingleInstance {
    String s1;
    private static ThreadSafeSingleInstance abc = null;
    private ThreadSafeSingleInstance(){}

    public static ThreadSafeSingleInstance getInstance() {
        if(abc == null) {
            synchronized (ThreadSafeSingleInstance.class) {
                if (abc == null) {
                    abc = new ThreadSafeSingleInstance();
                }
            }
        }
        return abc;
    }
}
