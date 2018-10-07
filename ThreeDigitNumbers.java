import java.util.HashMap;

public class ThreeDigitNumbers {
    private String number;
    private HashMap<String, String> dictionary;
    boolean isCorrect;

    public ThreeDigitNumbers(String number) {
        HashMap<String, String> hmap = new HashMap<String, String>(11);

        hmap.put("-", "minus");
        hmap.put("0", "zero");
        hmap.put("1", "jeden");
        hmap.put("2", "dwa");
        hmap.put("3", "trzy");
        hmap.put("4", "cztery");
        hmap.put("5", "pięć");
        hmap.put("6", "sześć");
        hmap.put("7", "siedem");
        hmap.put("8", "osiem");
        hmap.put("9", "dziewieć");

        this.dictionary = hmap;
        this.number = number;
        this.isCorrect = isCorrectlyFormatted();
        if (!isCorrect())
            throw new IncorrectFormatException("Numer ma niepoprawny format", this);
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String Wyswietl(){
        String digit_by_digit = "";
        for (int i=0; i < this.number.length(); i++){
            digit_by_digit = digit_by_digit + dictionary.get(String.valueOf(this.number.charAt(i))) + " ";
        }
        return digit_by_digit;
    }

    public boolean isCorrectlyFormatted(){
        if (this.number.startsWith("-")){
            if (this.number.length() != 4)
                return false;
            try{
                Integer.parseInt(this.number);
            } catch (NumberFormatException e){
                return false;
            }
        } else {
            if (this.number.length() != 3)
                return false;
            try{
                Integer.parseInt(this.number);
            } catch (NumberFormatException e){
                return false;
            }
        }
        return true;
    }
}