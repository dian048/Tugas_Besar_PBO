package tubes;

import java.util.Scanner;
public class input_serangan extends Maps{
    public static void chinaTurn(){
        int x=-1,y=-1;
        while((x < 0 || x >= shipX) || (y < 0 || y >= shipY)){
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan Titik Serangan China ( " + Maps.player1 +" ) !! " );
            System.out.print("input posisi x : ");
            x = input.nextInt();
            System.out.print("input posisi y : ");
            y = input.nextInt();
            if((x >= 0 && x < shipX) && (y >= 0 && y < shipY)){
                if (ship[x][y] == 'y')
                {
                    System.out.println("Bagus, Kamu Mengenai Sasaran(1 Kapal Amerika Hancur)!!");
                    ship[x][y] = '*';
                    --Maps.jum_ship_amerika;
                }
                else if (ship[x][y] == 'x') {
                    System.out.println("Oh tidak, kamu menambak kapal kamu sendiri");
                    ship[x][y] = '!';
                    --Maps.jum_ship_china;
                }
                else if (ship[x][y] == ' ') {
                    System.out.println("Sorry, you missed");
                    ship[x][y] = '-';
                }
                else if((x < 0 || x >= shipX) || (y < 0 || y >= shipY))
                    System.out.println("Kamu tidak bisa menempat lokasi /kordinat diatas 7 " );
            }
        }
    }
    public static void amerikaTurn(){

        int x=-1,y=-1;
        while((x < 0 || x >= shipX) || (y < 0 || y >= shipY)){
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan Titik Serangan Amerika ( " + Maps.player2 +" ) !! " );
            System.out.print("input posisi x : ");
            x = input.nextInt();
            System.out.print("input posisi y : ");
            y = input.nextInt();
            if ((x >= 0 && x < shipX) && (y >= 0 && y < shipY)){
                if (ship[x][y] == 'x')
                {
                    System.out.println("Bagus, Kamu Mengenai Sasaran(1 Kapal China Hancur)!!");
                    ship[x][y] = '*';
                    --Maps.jum_ship_china;
                }
                else if (ship[x][y] == 'y') {
                    System.out.println("Oh tidak, kamu menambak kapal kamu sendiri");
                    ship[x][y] = '!';
                    --Maps.jum_ship_amerika;
                }
                else if (ship[x][y] == ' ') {
                    System.out.println("Sorry, you missed");
                    ship[x][y] = '-';
                }
                else if((x < 0 || x >= shipX) || (y < 0 || y >= shipY))
                    System.out.println("Kamu tidak bisa menempat lokasi/kordinat diatas 7 " );
            }
        }

    }
}
