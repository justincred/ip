package ui;
import tasklist.Task;

import java.util.ArrayList;
import java.util.Scanner;
public class Ui {
    private Scanner sc;
    private static final String ALLTASKSHEADER = "Here are the tasks in your list!";
    public Ui() {
        this.sc = new Scanner(System.in);
    }
    public void showLoadingError(String error) {
        System.out.println(error);
    }
    public String takeInput() {
        return sc.nextLine();
    }
    public void showWelcome() {
        String message = "____________________________________________________________\n" +
                "Hello! I'm Jux\n" +
                "What can I do for you?\n";
        System.out.println(message);
    }
    public void showGoodbye() {
        String end = "____________________________________________________________\n" +
                "Bye. Hope to see you again soon!\n" +
                "____________________________________________________________";
        System.out.println(end);
    }
    public void printTaskMarked(String task) {
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(task);
    }
    public void printTaskUnMarked(String task) {
        System.out.println("OK, I've marked this task as not done yet:");
        System.out.println(task);
    }

    public void printList(ArrayList<Task> taskList) {
        for (int i = 0; i < taskList.size();i++) {
            System.out.println(taskList.get(i));
        }
    }
    public void printDeletedTask(String task) {
        System.out.println("Noted. I've removed this task:");
        System.out.println(task);
    }
    public void printEmptyTaskList() {
        System.out.println("Now, your list is empty!");
    }
    public void printTaskAfterword(String task) {
        System.out.println("You entered:" );
        System.out.println(task);
    }
    public void printNotFound() {
        System.out.println("Task not found!");
    }
    public void printNumberOfTasks(int num) {
        if (num == 1) {
            System.out.println("You now have 1 task remaining");
        } else{
            System.out.println("You now have " + num + " tasks remaining");
        }
    }
    public void printListWithIndexing(ArrayList<Task> taskList) {
        System.out.println(ALLTASKSHEADER);
        for (int i = 0; i < taskList.size();i++) {
            int j = i + 1;
            String listMessage = j + "." +  taskList.get(i);
            System.out.println(listMessage);
        }
    }

}
