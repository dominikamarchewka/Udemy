package ThreadsExcercise;
import static ThreadsExcercise.ThreadColor.ANSI_GREEN;

public class AnotherThread extends Thread{
    @Override
    public void run (){
        System.out.println(ANSI_GREEN + "Hi");
    }
}
