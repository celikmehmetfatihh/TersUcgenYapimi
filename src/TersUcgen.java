import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen ters ucgen icin basamak sayisi giriniz: ");
        int basamak = input.nextInt();
        int temp = basamak;

        for(int i=0; i<basamak; i++){
            //space maker
            for(int j=0; j<=i; j++)
                System.out.print(" ");
            //star maker
            for(int j=0; j<(temp*2)-1; j++){
                System.out.print("*");
            }
            temp--;
            System.out.println();
        }
    }
}
