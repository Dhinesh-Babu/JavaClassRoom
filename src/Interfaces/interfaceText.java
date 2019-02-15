package Interfaces;

class Multi extends Thread {

}
class Driver {
    public static void  main(String[] args) {
        Multi t1 = new Multi();
        t1.start();
    }
}