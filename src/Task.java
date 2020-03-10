import java.util.*;
import java.sql.Time;
public class Task {
    String todo;
    Date date;
    Time time;
    Boolean done;

    Task(String taskName, Date date, Time time, Boolean done){
        todo = taskName;
        this.date = date;
        this.time = time;
        this.done = done;
    }

}
