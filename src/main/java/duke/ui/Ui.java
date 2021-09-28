package duke.ui;

import duke.data.Duke;
import duke.data.TaskList;
import duke.task.Task;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ui {
    // Constants
    public static final String LOGO = " ____        _        \n"
                                    + "|  _ \\ _   _| | _____ \n"
                                    + "| | | | | | | |/ / _ \\\n"
                                    + "| |_| | |_| |   <  __/\n"
                                    + "|____/ \\__,_|_|\\_\\___|\n";
    public static final String DIVIDER = "____________________________________________________________";

    private final Scanner in;
    private final PrintStream out;

    public Ui() {
        this(System.in, System.out);
    }

    public Ui(InputStream in, PrintStream out) {
        this.in = new Scanner(in);
        this.out = out;
    }

    public String readCommand(){
        return in.nextLine();
    }

    public void showWelcome(){
        System.out.println("Hello from\n" + LOGO);
        String greet = " Hello! I'm Yuxin's Duke\n"
                     + " What can I do for you?\n";
        System.out.println(DIVIDER + "\n" + greet + DIVIDER);
    }

    public void showLine(){
        System.out.println(DIVIDER);
    }

    public void showLoadingError(){

    }

    public void showError(String errorInformation){
        System.out.println("OOPS!!! " + errorInformation + "  :-(");
    }

    public void showExit(){
        System.out.println("Bye. Hope to see you again soon!");
    }
}
