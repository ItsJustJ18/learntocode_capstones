import java.time.LocalTime;
import java.time.LocalDate;

public class Transactions {

    private LocalDate date;

    private LocalTime time;

    private String description;

    private String vendor;

    private Double userAmount;



    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Double getUserAmount() {
        return userAmount;
    }

    public void setUserAmount(double userAmount) {
        this.userAmount = userAmount;
    }

    public Transactions(LocalDate date, LocalTime time, String description, String vendor, Double userAmount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.userAmount = userAmount;
    }

    @Override
    public String toString() {
        return date +
                "|" + time +
                "|" + description +
                "|" + vendor + "|" + userAmount;

        //2024-10-17|06:30:11|Megan|Rockafella|250
    }
}



