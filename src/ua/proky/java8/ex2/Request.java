package ua.proky.java8.ex2;

public class Request {
    private final String data;

    public Request(String requestData) {
        this.data = requestData;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return data;
    }
}
