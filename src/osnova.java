import java.util.Scanner;

public class osnova {
    static int input1Int = 0, input2Int =0;
    static boolean input1B = false, input2B = false;
    public static void main(String[] args) {
        System.out.println("Введите два числа и арифметический оператор:");
        Scanner sc=new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int counter = 0;
        String input1 = "" , input2 = "", Arithmetic_Expression = "";
        for(String elem : input)
        {
            if(counter == 0) input1 = elem;
            if(counter == 1) Arithmetic_Expression = elem;
            if (counter == 2) input2 = elem;
            counter++;
        }
        if (input1.contains("I") || input1.contains("V") || input1.contains("X"))
            input1B = true;
        if (input2.contains("I") || input2.contains("V") || input2.contains("X"))
            input2B = true;
        if (input1B == input2B) {

            if(input1B) {
                input1Int = RimArab.NumToRim(input1);
                input2Int = RimArab.NumToRim(input2);
            }else {
                input1Int = RimArab.NumToArab(input1);
                input2Int = RimArab.NumToArab(input2);
            }
            if(input1Int > 0 && input1Int <= 10 && input2Int > 0 && input2Int <= 10)
                raschyot.Arithmetic_Expression(Arithmetic_Expression);
            else
                System.out.println("Некорректный ввод данных");
        }else
            System.out.println("Некорректный ввод данных");

    }
}

