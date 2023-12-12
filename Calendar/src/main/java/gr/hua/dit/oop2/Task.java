package gr.hua.dit.oop2;

public class Task extends Event{

    private String deadline;
    private boolean isFinished;

    //constructor WITH time  // de ftiaxnoume WITHOUT time giati ETSI
    public Task(String date, String title, String description, String time, String deadline, boolean isFinished ) {
        super(date, title, description, time);
        this.deadline = deadline;
        this.isFinished = isFinished;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }


    public String toString() {
        return "Task{" +
                "time='" + getTime() + '\'' +
                ", date='" + getDate() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", deadline='" + deadline + '\'' +
                ", isFinished=" + isFinished +
                '}';
    }


}
