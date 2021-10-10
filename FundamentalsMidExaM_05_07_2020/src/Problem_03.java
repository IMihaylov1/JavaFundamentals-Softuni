import java.util.*;
import java.util.stream.Collectors;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        for (Integer target : targets) {
            sum += target;
        }
        double aver = 1.0 * sum / targets.size();
        List<Integer> greater = new ArrayList<>();

        if (targets.size() == 1) {
            System.out.println("No");
            return;
        }
        for (Integer target : targets) {
            int taken = target;
            if (taken > aver) {
                greater.add(taken);
            }else if(taken==aver){
                System.out.println("No");
                return;
            }
        }
        Collections.sort(greater);
        Collections.sort(greater, Collections.reverseOrder());
        List<Integer> greterTop5 = new ArrayList<>();


        if (greater.size() <= 5) {
            for (Integer integer : greater) {
                System.out.print(integer + " ");
            }
            return;
        } else if (greater.size() > 5) {


            for (int i = 0; i < greater.size(); i++) {
                int greatNum1 = greater.get(i);
                int greatNum2 = greater.get(i+1);
                if (greatNum1 >= greatNum2) {
                    greterTop5.add(greatNum1);
                }
                if (greterTop5.size() == 5) {
                    break;
                }

            }
        }
        for (Integer integer : greterTop5) {
            System.out.print(integer + " ");
        }

    }

}

