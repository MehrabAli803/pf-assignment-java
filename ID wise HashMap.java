import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    int id;
    double amount;

    Transaction(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() { return id; }
    public double getAmount() { return amount; }
}

public class IdWiseSum {
    public static void main(String[] args) {
        // 1. Setup Sample Data
        List<Transaction> data = Arrays.asList(
            new Transaction(101, 50.0),
            new Transaction(102, 20.0),
            new Transaction(101, 30.5),
            new Transaction(103, 100.0),
            new Transaction(102, 15.0)
        );

        // 2. Summing using Java Streams (Modern Approach)
        Map<Integer, Double> sumById = data.stream()
            .collect(Collectors.groupingBy(
                Transaction::getId, 
                Collectors.summingDouble(Transaction::getAmount)
            ));

        // 3. Display Results
        System.out.println("--- Sum Results per ID ---");
        sumById.forEach((id, total) -> 
            System.out.println("ID: " + id + " | Total Sum: " + total)
        );
    }
}