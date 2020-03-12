import java.util.*;
import java.sql.Time;
public class Task {
    String todo;
    Date date;
    Boolean done;

    Task(String taskName, Date date, Boolean done){
        todo = taskName;
        this.date = date;
        this.done = done;
    }

}
