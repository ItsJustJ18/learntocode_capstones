import java.time.LocalTime;
import java.time.LocalDate;

public class Transactions {

    private LocalDate date;

    private LocalTime time;

    private String description;

    private String vendor;

    private double userAmount;

    @Override
    public String toString() {
        return "Transactions{" +
                "date=" + date +
                ", time=" + time +
                ", description='" + description + '\'' +
                ", vendor='" + vendor + '\'' +
                ", userAmount=" + userAmount +
                '}';
    }

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

    public double getUserAmount() {
        return userAmount;
    }

    public void setUserAmount(double userAmount) {
        this.userAmount = userAmount;
    }

    public Transactions(LocalDate date, LocalTime time, String description, String vendor, double userAmount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.userAmount = userAmount;
    }
}



