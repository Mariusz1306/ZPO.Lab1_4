import javax.swing.*;

public class Main {
    public static ThreeDigitNumbers PobierzNumber(){
        String number = JOptionPane.showInputDialog("Podaj trzy cyfrową liczbe (opcjonalnie z minusem)");
        ThreeDigitNumbers tdn = new ThreeDigitNumbers(number);

        return tdn;

    }

    public static void main(String[] args) {
        ThreeDigitNumbers tdn = PobierzNumber();
        JOptionPane.showMessageDialog(null, tdn.Wyswietl());
    }
}