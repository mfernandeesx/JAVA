import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x,y,media;
        System.out.print("valor de  x: ");
        x = input.nextDouble();
        System.out.print("valor de  y: ");
        y = input.nextDouble();
        media = (x * y) / 2;
        System.out.println(" valor da media é = " + media);

    }
}
