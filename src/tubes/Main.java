package tubes;
import java.util.Scanner;

public class Main {
    private  static String player1;
    private  static String player2;
    public static void main(String[] args){
        System.out.println("\t\t\t\t\t\t\t\tGame Battleship Laut China Selatan");

        System.out.println("==============================================================================================================");
        System.out.println("DESKRIPSI SINGKAT");
        System.out.println("==============================================================================================================");
        System.out.println("Tiap negara memiliki 5 kapal perang. Ketika perang, setiap pihak tidak mengetahui posisi kapal negara lain.");
        System.out.println("Tiap pihak menentukan 5 lokasi kapal masing, lalu tiap pihak secara bergantian saling menembak.");
        System.out.println("Pertempuran berakhir ketika semua kapal di salah satu pihak habis terbom. Pihak yang paling lama ");
        System.out.println("Pihak yang bertahan paling lama adalah pemenangnya.");
        System.out.println("==============================================================================================================");
        System.out.println();

        //membuat objek maps
        Maps map = new Maps();
        //memanggil maps
        map.Maps();

        //memanggil fungsi input nama player
//        Maps.inputPlayer();
        Scanner input = new Scanner(System.in);
        save_koordinat save = new save_koordinat();
        System.out.print("Masukkan nama player1 : ");
        Main.player1 = input.nextLine();
        save.setPlayer1(Main.player1) ;

        //memanggil input kapal cina
        save.saveKordinatC();

        System.out.print("Masukkan nama player 2 : ");
        Main.player2 = input.nextLine();
        save.setPlayer2(Main.player2) ;

        //memanggil input kapal amerika
        save.saveKordinatA();

        //membuat objek dari class score_serangan
        score_serangan battle = new score_serangan();
        do{
            battle.battle();
        }while(Maps.jum_ship_china !=0 && Maps.jum_ship_amerika !=0);

    }


}