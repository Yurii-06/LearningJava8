package ua.proky;


public class Main {
    public static void main(String[] args) {
        Insurance current = new CarInsurance();
        int premium = current.premium();
        String category = current.category();
        System.out.println("premium : " + premium);
        System.out.println("category : " + category);
    }
}
