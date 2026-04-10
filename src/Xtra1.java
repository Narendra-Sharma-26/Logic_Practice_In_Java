
// Program to Convert Interger to Roman Number. (1 - 100)

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Xtra1 {

    public String integerToRoman(int number) {

        Map<Integer, String> mainMap = new HashMap<>();

        mainMap.put(1, "I");
        mainMap.put(2, "II");
        mainMap.put(3, "III");
        mainMap.put(4, "IV");
        mainMap.put(5, "V");
        mainMap.put(6, "VI");
        mainMap.put(7, "VII");
        mainMap.put(8, "VIII");
        mainMap.put(9, "IX");
        mainMap.put(10, "X");
        mainMap.put(20, "XX");
        mainMap.put(30, "XXX");
        mainMap.put(40, "XL");
        mainMap.put(50, "L");
        mainMap.put(60, "LX");
        mainMap.put(70, "LXX");
        mainMap.put(80, "LXXX");
        mainMap.put(90, "XC");
        mainMap.put(100, "C");

        String romanString = "";

        if (mainMap.containsKey(number)) {
            romanString += mainMap.get(number);
            return romanString;
        } else {
            int tensdigit = (number / 10) * 10;
            int unitdigit = number % 10;

            romanString = romanString + mainMap.get(tensdigit) + mainMap.get(unitdigit);
            return romanString;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;

        while (true) {

            System.out.print("Enter a Integer to get its Roman equivalent (1-100): ");
            String input = sc.nextLine();

            try {
                num = Integer.parseInt(input);
                if (num > 100 || num < 1){
                    throw new IllegalArgumentException("Number must be between 1 and 100");
                }
                break;
                    
            } catch (NumberFormatException e) {
                System.out.println("INVALID INPUT!!!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        Xtra1 obj = new Xtra1();

        String result = obj.integerToRoman(num);

        System.out.println(result);

    }
}
