package MultiThreading;

public class Main {
    public static void main(String[] args) {
        Multi_Thread T1 = new Multi_Thread(100);
        Multi_Thread T2 = new Multi_Thread(1000);
        T1.start();
        T2.start();
    }
}
