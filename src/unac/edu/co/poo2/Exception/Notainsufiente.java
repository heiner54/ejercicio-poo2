package unac.edu.co.poo2.Exception;

public class Notainsufiente extends Exception {
    private String message;

    public Notainsufiente(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }


}
