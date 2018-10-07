import javax.swing.*;

public class Main {
    public static ThreeDigitNumbers PobierzNumber(){
        try {
            String number = JOptionPane.showInputDialog("Podaj trzy cyfrową liczbe (opcjonalnie z minusem)");
            ThreeDigitNumbers tdn = new ThreeDigitNumbers(number);
            if (!tdn.isCorrect) {
                JOptionPane.showMessageDialog(null, "Liczba nie jest poprawna");
                tdn = PobierzNumber();
            }
            return tdn;
        } catch (IncorrectFormatException e){
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        ThreeDigitNumbers tdn = PobierzNumber();
        JOptionPane.showMessageDialog(null, tdn.Wyswietl());
    }
}
