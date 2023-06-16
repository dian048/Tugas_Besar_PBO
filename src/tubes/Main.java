package tubes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Game Battleship Laut China Selatan");

        Maps map = new Maps();
        map.Maps();

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