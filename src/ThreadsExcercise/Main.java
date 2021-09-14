package ThreadsExcercise;

import static ThreadsExcercise.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();


        new Thread(() ->
                System.out.println(ANSI_YELLOW + "Hello from the anonymous class thread"))
                .start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_PURPLE + "Hello from the anonymous class's implementation of run().");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_GREEN + "AnotherThread terminated, so I'm running again.");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_GREEN + "I couldn't wait after all. I was interrupted.");
                }
            }
        });

        myRunnableThread.start();
    }
}
