public class godisnjadoba_case {
    public static void main(String[] args) {
        int mesec=6; /* jun  */
        String godisnje_doba;



        switch (mesec){

            case 1:
            case 2:
            case 12:
                godisnje_doba="zima";
                break;

            case 3:
            case 4:
            case 5:
                godisnje_doba="prolece";
                break;

            case 6:
            case 7:
            case 8:
                godisnje_doba="leto";
                break;

            case 9:
            case 10:
            case 11:
                godisnje_doba="jesen";
                break;

            default:
                godisnje_doba="ne postoji";


        }
        System.out.println("Ako je mesec jun godisnje doba je "+godisnje_doba +".");




    }





}

