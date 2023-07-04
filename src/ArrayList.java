import java.util.LinkedList;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>(10);
        for (int i= 1; i<=10; i++) {
            String number;
            switch (i) {
                case 1:
                    number = "One";
                    break;
                case 2:
                    number = "Two";
                    break;
                case 3:
                    number = "Three";
                    break;
                case 4:
                    number = "Four";
                    break;
                case 5:
                    number = "Five";
                    break;
                case 6:
                    number = "Six";
                    break;
                case 7:
                    number = "Seven";
                    break;
                case 8:
                    number = "Eight";
                    break;
                case 9:
                    number = "Nine";
                    break;
                case 10:
                    number = "Ten";
                    break;
                default:
                    number = "";
                    break;
                    
                    
            }
            list.add(number);
            list.remove("Ten");
            list.remove("Nine");
            list.remove("Eight");
            list = new LinkedList<>();
            list.set(0, "Changed from One");


        }
        System.out.println(list);
    }
}
