package tubes;

public class score_serangan extends Maps{
    public static void battle(){
        input_serangan pl = new input_serangan();
        pl.chinaTurn();
        pl.amerikaTurn();

        Maps_hasil map = new Maps_hasil();
        //map.printMaps();

        System.out.println();
        System.out.println("Score Perolehan");
        System.out.println("Kapal China : " + Maps.jum_ship_china + " | Kapal Amerika: " + Maps.jum_ship_amerika);
        System.out.println();

//        if(Maps.jum_ship_china > 0 && Maps.jum_ship_amerika <= 0) {
//            System.out.println("China Memenangkan Pertempuran :)");
//            System.out.println("Score Akhir Perolehan Kedua Pihak!!");
//            System.out.println("Kapal China : " + Maps.jum_ship_china + " | Kapal Amerika: " + Maps.jum_ship_amerika);
//        }else(Maps.jum_ship_amerika > 0 && Maps.jum_ship_china <= 0) {
//            System.out.println("Amerika Memenangkan Pertempuran");
//            System.out.println("Score Akhir Perolehan Kedua Pihak!!");
//            System.out.println("Kapal China : " + Maps.jum_ship_china + " | Kapal Amerika: " + Maps.jum_ship_amerika);
//        }
//        System.out.println();
        gameOver();
    }
    public static void gameOver(){
        if(Maps.jum_ship_china > 0 && Maps.jum_ship_amerika <= 0)
            System.out.println("China Memenangkan Pertempuran :)");
        else if(Maps.jum_ship_amerika > 0 && Maps.jum_ship_china <= 0)
            System.out.println("Amerika Memenangkan Pertempuran");
        System.out.println();
    }
}




