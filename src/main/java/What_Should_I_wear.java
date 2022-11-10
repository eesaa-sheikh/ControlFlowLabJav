import java.util.Scanner;
public class What_Should_I_wear {
    public static void main(String[] args) {
        System.out.println("Let Jarvis pick out your clothes today");
        System.out.println("what is the weather like today?");
        Scanner Cweather = new Scanner(System.in);
        String weather = Cweather.nextLine();

        if (weather.equals("bad"));{
        System.out.println("Please tell me how bad");}

        Scanner deg = new Scanner(System.in);
        String howBad = deg.nextLine();

        if (howBad.equals("Snow"));{
        System.out.println("That's a problem");
        System.out.println("Now tell me the temperature?");}

        Scanner val = new Scanner(System.in);
        int Temp = val.nextInt();

        if (Temp == 0 );
        System.out.println("That's brutal!");
        System.out.println("Here is what I found:" );
        System.out.println();
        System.out.println("https://www.shein.co.uk/Men-Double-Breasted-Drop-Shoulder-Belted-Overcoat-p-11457216-cat-3137.html?src_identifier=ai%3D17212%60an%3Duksale%60on%3DBanner%60cn%3D2clearance0725%60hz%3Dclearance0516-01%60ps%3D5%60jc%3DitemPicking_02595039&src_module=campaign&src_tab_page_id=page_activity_factory1668112201180&mallCode=1&scici=campaign_uksale_17212~~ON_1,CN_2clearance0725,HZ_clearance0516-01,HI_hotZone_qijj4ukdt~~1~~itemPicking_02595039~~");

        }

    }
