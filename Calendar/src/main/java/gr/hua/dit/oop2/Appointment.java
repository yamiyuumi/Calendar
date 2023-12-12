package gr.hua.dit.oop2;

public class Appointment extends Event {

    private String startingTime;
    private String duration;

    //constructor WITHOUT time giati ETSI //VASIKA efoson exei startingTime de xreiazetai time
    public Appointment(String date, String title, String description, String startingTime, String duration ) {
        super(date, title, description);
        this.startingTime = startingTime;
        this.duration = duration;
    }

    // Getter for startingTime
    public String getStartingTime() {
        return startingTime;
    }

    // Setter for startingTime
    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    // Getter for duration
    public String getDuration() {
        return duration;
    }

    // Setter for duration
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String toString() {
        return "Appointment { " +
                "startingTime='" + startingTime + '\'' +
                ", duration='" + duration + '\'' +
                ", date='" + getDate() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", description='" + getDescription() +
                '}';
    }



}
