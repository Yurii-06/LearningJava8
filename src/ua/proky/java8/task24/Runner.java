package ua.proky.java8.task24;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Transaction> firstTransactions = List.of(
            new Transaction("774cedda-9cde-4f53-8bc2-5b4d4859772a", State.CANCELED, 1000L,
                new Date(System.currentTimeMillis())));

        List<Transaction> secondTransactions = List.of(
            new Transaction("337868a7-f469-43c0-9042-3422ce37ee26a", State.FINISHED, 8000L,
                new Date(System.currentTimeMillis())),
            new Transaction("f8047f86-89e7-4226-8b75-74c55a4d7e31", State.CANCELED, 10000L,
                new Date(System.currentTimeMillis()))
            );

        Account firstAcc = new Account("1001", 0L, firstTransactions);
        Account secondAcc = new Account("1002", 8000L, secondTransactions);

        List<Account> accounts = List.of(firstAcc, secondAcc);

        long sum = accounts.stream()
            .filter(account -> account.getBalance() > 0)
            .flatMap(account -> account.getTransactions().stream())
            .filter(transaction -> transaction.getState().equals(State.CANCELED))
            .mapToLong(Transaction::getSum)
            .sum();

        System.out.println(sum);
    }
}
