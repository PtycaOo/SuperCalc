public class NumValidator {

    public boolean isValid(String num, String num2){
        try {
            int value = Integer.parseInt(num);
            int value2 = Integer.parseInt(num2);
            if(value <=10 && value2 <= 10){
                return true;
            } else {
                System.out.println("В операциях участвуют только числа меньше 10");
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
