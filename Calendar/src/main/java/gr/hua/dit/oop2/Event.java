package gr.hua.dit.oop2;

public class Event {
    private String time;   //maybe localdatetime
    private String date;  //maybe localdate //if changed, change constructors ALSO
    private String title;
    private String description;

    //constructor WITH time
    public Event(String date, String title, String description, String time) {
        this.date = date;
        this.title = title;
        this.description = description;
        this.time=time;
    }

    //constructor WITHOUT time
    public Event(String date, String title, String description) {
        this.date = date;
        this.title = title;
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    // Setter for time
    public void setTime(String time) {
        this.time = time;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Event { " +
                "time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}' ;
    }

    /// EVENTOPTIONS



    //public static







}
