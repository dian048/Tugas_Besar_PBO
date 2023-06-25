package tubes;
import java.util.Scanner;

public class Main {
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

        Maps.inputPlayer();

        save_koordinat save = new save_koordinat();
        //memanggil input kapal cina
        save.saveKordinatC();
        //memanggil input kapal amerika
        save.saveKordinatA();

        //membuat objek dari class score_serangan
        score_serangan battle = new score_serangan();
        do{
            battle.battle();
        }while(Maps.jum_ship_china !=0 && Maps.jum_ship_amerika !=0);

    }


}