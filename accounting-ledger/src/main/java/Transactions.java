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

    public String getVendor() {
        return vendor;
    }

    public Double getUserAmount() {
        return userAmount;
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


    }
}



