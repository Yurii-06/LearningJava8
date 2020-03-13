package ua.proky.java8.task24;

import java.util.Date;

public class Transaction {
    private String uuid;
    private State state;
    private Long sum;
    private Date date;

    public Transaction(String uuid, State state, Long sum, Date date) {
        this.uuid = uuid;
        this.state = state;
        this.sum = sum;
        this.date = date;
    }

    public String getUuid() {
        return uuid;
    }

    public State getState() {
        return state;
    }

    public Long getSum() {
        return sum;
    }

    public Date getDate() {
        return date;
    }
}
