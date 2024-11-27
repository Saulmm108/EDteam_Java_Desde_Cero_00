package Java_Desde_Cero_00.POO_04.Interface;

public class Main {
    public static void main(String[] args) {
        
        CashPayment cashPayment = new CashPayment("Sole");
        CreditCardPayment creditCardPayment = new CreditCardPayment("1234-3324-3132-4123");

        cashPayment.processPaymet(200);
        creditCardPayment.processPaymet(140);
    }
}
