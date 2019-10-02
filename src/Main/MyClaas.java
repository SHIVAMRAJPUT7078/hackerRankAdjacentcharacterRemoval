package Main;

import java.util.Scanner;

public class MyClaas {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
     for(int i = 1; i <= n; i++){
        String test = scanner.nextLine().trim();
        int count=0;
        for (int j = 0; j < test.length()-1; j++) {
            if(test.charAt(j)==test.charAt(j+1))
                count++;
        }
        System.out.println(count);
    }

    }
}

