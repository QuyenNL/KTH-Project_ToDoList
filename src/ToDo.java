import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Create a simple To Do List containing tasks.
 * The user can add, remove, edit tasks.
 * He/she can also mark the tasks as done, save the tasks and return to what have been saved.
 * @author quyennguyen
 */
public class ToDo {

    //instance variables
    ArrayList<Task> taskList = new ArrayList<>();

    /**
     * Build a new, empty ToDo.
     */

    public ToDo() {
    }

    public void addTask() {
        String todo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a title to the task");
        todo = scanner.nextLine();

        Date date = new Date();
        System.out.println("Add deadline to the task (\"dd/MM/yyyy\")");
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.next());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Boolean done;
        //System.out.println("This task has been done");
        //todo = scanner.next();


        Task userInput = new Task(todo, date, true);
        taskList.add(userInput);

    }

    public static void main(String[] args) {
        ToDo toDo = new ToDo();


        System.out.println("Welcome to your To Do List!");

        System.out.println( "You have " + toDo.taskList.size() + " tasks");

        System.out.println("Please choose one of the following options:");
        System.out.println("1 - Show task list");
        System.out.println("2 - Add new task");
        System.out.println("3 - Edit task");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer-value!");
        int userChoice = scanner.nextInt();

        if(userChoice == 1){
            System.out.println("This is your current To Do List");
        }
        else if(userChoice == 2) {
            System.out.println("Please fill in the task");
            toDo.addTask();

        }
        else {
            System.out.println("Which task do you want to edit?");
        }

    }
}
