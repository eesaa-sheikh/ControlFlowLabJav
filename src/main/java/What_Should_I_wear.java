import java.util.Scanner;
public class newWeather {
    public static void main(String[] args) {
        int temperature = 20;

        System.out.println("Hello, I will be choosing your clothes today!");

        System.out.println("Please tell me what the weather is like");

        //string scanner
        Scanner op = new Scanner(System.in);
        String option = op.nextLine();

        //int Scanner

        int temp = op.nextInt();

        if ((option.equals("Hot") && (temperature < temp))) {
            System.out.println("Thanks for this input");
            System.out.println("The temp is " + temp);
            System.out.println("The whether is " + option);
            System.out.println("This is hot");
            System.out.println("This is What I found:https://www.boohooman.com/oversized-graffiti-t-shirt-and-short-set/BMM10414-105-34.html?istCompanyId=9de2f27a-9672-4ac4-b061-147ce3c3a633&istFeedId=9179cc73-11c3-442f-bb56-f89a61fdc694&istItemId=pmplpaaxm&istBid=t&gclid=Cj0KCQiAyMKbBhD1ARIsANs7rEHBmsvt-CMvg3vh9pHxwE2ggB42Qdx1I6B7QEmsPpRdpGpGtMqfa20aAlrjEALw_wcB&gclsrc=aw.ds" );
        }
        else if (option.equals("Cold") && (temperature > temp)){
            System.out.println("Thanks for this input");
            System.out.println("The temp is " + temp);
            System.out.println("The whether is " + option);
            System.out.println("This is cold");
            System.out.println("This is What I found:https://uk.tommy.com/alaska-casual-fit-hooded-puffer-jacket-dm0dm15445bds?utm_source=google&utm_medium=organic&utm_campaign=uk_free-cpc-shopping&cmpid=ch:cpc|so:google|ca:|cr:|lb:18327623425|ag:|pi:&gclid=Cj0KCQiAyMKbBhD1ARIsANs7rEEI0AEkUWi-vSV6FWON-dXgm1BOpeZVR7pLnbpM5uUPbXVPrxyG4kkaAh38EALw_wcB&gclsrc=aw.ds");
        }
        System.out.println("Did you enjoy your experience?");
        Scanner choice = new Scanner(System.in);
        String chc = choice.nextLine();

        if (chc.equals("Yes")){
            System.out.println("Thanks for using our service");
        } 
            
        }


    }
