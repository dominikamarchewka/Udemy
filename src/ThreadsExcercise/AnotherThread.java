package ThreadsExcercise;
import java.sql.SQLOutput;

import static ThreadsExcercise.ThreadColor.ANSI_GREEN;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "Hi");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println(ANSI_GREEN + "Another thread woke me up");
            return;
        }

        System.out.println(ANSI_GREEN + "Three seconds have passed and I'm awake");
    }
}
