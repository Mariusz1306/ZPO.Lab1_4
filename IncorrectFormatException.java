public class IncorrectFormatException extends RuntimeException {
    ThreeDigitNumbers incorrectnumber;
    public IncorrectFormatException(String message, ThreeDigitNumbers incorrectnumber) {
        super(message);
        this.incorrectnumber = incorrectnumber;
    }
}