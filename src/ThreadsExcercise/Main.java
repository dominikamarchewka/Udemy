package ThreadsExcercise;

import static ThreadsExcercise.ThreadColor.ANSI_RED;
import static ThreadsExcercise.ThreadColor.ANSI_YELLOW;

public class Main{

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();

        new Thread() {
            public void run (){
                System.out.println(ANSI_YELLOW + "Hello from the anonymous class thread");
            }
        }.start();

        anotherThread.start();
    }
}
