import java.util.*;
public class bill {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int pen = sc.nextInt();
        int pencil = sc.nextInt();
        int eraser = sc.nextInt();
        System.out.println("Bill Without GST : " + (pen + pencil + eraser));

        System.out.println("Bill With GST : " + ((pen + pencil + eraser) + (pen + pencil + eraser)*0.18));

    }
}
