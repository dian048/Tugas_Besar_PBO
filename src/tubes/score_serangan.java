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
        gameOver();
    }
    public static void gameOver(){
        if(Maps.jum_ship_china > 0 && Maps.jum_ship_amerika <= 0)
            System.out.println("China ( " + Maps.player1 + " ) " + "Memenangkan Pertempuran :)");
        else if(Maps.jum_ship_amerika > 0 && Maps.jum_ship_china <= 0)
            System.out.println("Amerika ( " + Maps.player2 + " ) " + "Memenangkan Pertempuran");
        System.out.println();
    }
}




