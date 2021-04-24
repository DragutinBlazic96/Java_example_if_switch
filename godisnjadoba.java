public class godisnjadoba {
    public static void main(String[] args) {

        int mesec=6; /*mesec jun*/
        String godisnje_doba;

        if(mesec == 12 || mesec == 1 || mesec == 2){
            godisnje_doba ="zima";
        }

        else if(mesec == 3 || mesec == 4 || mesec == 5){
            godisnje_doba="prolece";
        }

        else if(mesec == 6 || mesec == 7 || mesec == 8){
            godisnje_doba ="leto";
        }

        else if(mesec == 9 || mesec == 10 || mesec == 11){
            godisnje_doba ="jesen";
        }
        else
            godisnje_doba = "nepostojeci mesec";


        System.out.println("Kada je mesec jun to je: " + godisnje_doba );

    }
}
