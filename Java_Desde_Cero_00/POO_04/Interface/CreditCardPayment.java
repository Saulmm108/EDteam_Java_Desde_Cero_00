package Java_Desde_Cero_00.POO_04.Interface;

public class CreditCardPayment implements PaymentMethod{
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void othermethod(int other) {
        System.out.println("Otro metodo: ");
    }

    @Override
    public void processPaymet(double amount) {
        System.out.println("Procesando el pago con la tarjeta de credito: " + cardNumber);
    }//Tarjeta

}
