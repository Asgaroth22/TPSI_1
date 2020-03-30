package labs.lab1;

import java.util.Arrays;

enum GatunekPiwa
{

    LAGER, PILZNER, PORTER, STOUT, PIWO_Z_BIEDRONKI
}

public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void zad1()
    {
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.floor(Math.random() * 49)) + 1;
        }
        Arrays.sort(arr);
        for (int i : arr)
        {
            System.out.println(i);
        }
    }

    public static void zad2()
    {
        Integer arr[] = new Integer[6];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.floor(Math.random() * 49)) + 1;
        }
        Arrays.sort(arr);
        for (Integer i : arr)
        {
            System.out.println(i);
        }
    }

    public static void zad3()
    {
        GatunekPiwa gatunki[] = new GatunekPiwa[3];
        for (int i = 0; i < gatunki.length; i++)
        {
            int x = (int) (Math.floor(Math.random() * GatunekPiwa.values().length));
            gatunki[i] = GatunekPiwa.values()[x];
        }
        for (GatunekPiwa gat : gatunki)
        {
            switch (gat)
            {
                case LAGER:
                case PILZNER:
                    System.out.println("piwo jasne");
                    break;
                case PORTER:
                case STOUT:
                    System.out.println("piwo ciemne");
                    break;
                case PIWO_Z_BIEDRONKI:
                    System.out.println("piwo tanie");
                    break;
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Zad 1:");
        zad1();
        System.out.println("\nZad 2:");
        zad2();
        System.out.println("\nZad 3:");
        zad3();

    }

}
