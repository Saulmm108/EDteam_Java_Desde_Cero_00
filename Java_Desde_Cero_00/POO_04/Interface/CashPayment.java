package Java_Desde_Cero_00.POO_04.Interface;

public class CashPayment implements PaymentMethod{
    private String currency; //moneda
    

    public CashPayment(String currency) {
        this.currency = currency;
    }

    @Override
    public void othermethod() {
        System.out.println("Otro metodo");
    }

    @Override
    public void processPaymet(double amount) {
        System.out.println("Procesando el pegao Cash Payment" + currency);
    }//efectivo
    
}
