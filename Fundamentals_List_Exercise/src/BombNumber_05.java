import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] powerNumAndBombNum = scanner.nextLine().split("\\s+");
        int specialBombNum = Integer.parseInt(powerNumAndBombNum[0]);
        int powerOfBomb = Integer.parseInt(powerNumAndBombNum[1]);

     while (input.contains(specialBombNum)){
         int bombPosition = input.indexOf(specialBombNum);

         int leftBound = Math.max(0,bombPosition-powerOfBomb);
         int rightBound = Math.min(input.size()-1,bombPosition+powerOfBomb);

         for (int i = rightBound; i >=leftBound ; i--) {
             input.remove(i);
         }
     }
     int sum = 0;
        for (Integer integer : input) {
            sum += integer;
        }
     System.out.print(sum);

        // Същотото като горния цикъл:!!!
       // int sums = input.stream().mapToInt(Integer::intValue).sum();

    }
}
