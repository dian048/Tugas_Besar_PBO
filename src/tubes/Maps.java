package tubes;
import  java.util.Scanner;


public class Maps implements peta{

    protected static int shipX = 8;
    protected static int shipY = 8;
    protected static int jum_ship_china;
    protected static int jum_ship_amerika;
    protected static int[][] miss = new int[shipX][shipY];
    protected static char[][] ship = new char[shipX][shipY];

    Scanner scanner = new Scanner(System.in);
    public static String player1;
    public static String player2;


    @Override
    public void Maps(){
        System.out.print("  ");
        for(int i = 1; i < shipY; i++)
            System.out.print(i);
        System.out.println();

        for(int i = 1; i < ship.length; i++) {
            for (int j = 1; j < ship[i].length; j++) {
                ship[i][j] = ' ';
                if (j == 1)
                    System.out.print(i + "|" + ship[i][j]);
                else if (j == ship[i].length - 1)
                    System.out.print(ship[i][j] + "|" + i);
                else
                    System.out.print(ship[i][j]);
            }
            System.out.println();
        }

        System.out.print("  ");
        for(int i = 1; i < shipY; i++)
            System.out.print(i);
        System.out.println();
    }

    public static void inputPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama player 1 : ");
        player1 = scanner.nextLine();
        System.out.print("Masukkan nama player 2 : ");
        player2 = scanner.nextLine();

    }
}

