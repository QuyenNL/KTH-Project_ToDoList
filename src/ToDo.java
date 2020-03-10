import java.sql.Time;
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
        Task userInput = new Task("Get home", new Date(), new Time(12312L), true);
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

        }
        else {
            System.out.println("Which task do you want to edit?");
        }

    }
}
