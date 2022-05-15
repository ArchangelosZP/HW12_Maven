import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 'stones:'");
        String stones = scanner.nextLine();
        System.out.println("Enter 'jewels:'");
        String jewels = scanner.nextLine();
        int counter = 0;
        for (int iJ=0;iJ<jewels.length();iJ++){
            for (int iS=0;iS<stones.length();iS++){
                if (jewels.charAt(iJ)==stones.charAt(iS)){counter++;}
            }
        }
        System.out.println("Rez: "+counter);

        System.out.println("Enter numbers separated by commas");
        String input = scanner.nextLine();
        int[] nArr = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
        counter=0;
        for (int i=0;i<nArr.length;i++){
            for (int ii=i+1;ii<nArr.length;ii++){
                if (nArr[i]==nArr[ii]){counter++;}
            }
        }
        System.out.println("Number of good pairs: "+counter);
    }
}
