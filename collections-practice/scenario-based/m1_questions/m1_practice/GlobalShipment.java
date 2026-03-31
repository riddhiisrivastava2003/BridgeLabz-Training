import java.util.*;


public class GlobalShipment{

    static Set<String>modes=new HashSet<>(Arrays.asList("AIR","SEA","ROAD","RAIL","EXPRESS","FREIGHT"));

    static Set<String> status = new HashSet<>(Arrays.asList("DELIVERED","CANCELLED","IN_TRANSIT"));

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++){


            String record = sc.nextLine();

            if(validate(record))

                System.out.println("COMPLIANT RECORD");
            else

                System.out.println("NON-COMPLIANT RECORD");
        }
    }

    static boolean validate(String record){

        String[] parts=record.split("\\|");

        if(parts.length!=5)return false;

        return validCode(parts[0]) &&
                validDate(parts[1]) &&
                modes.contains(parts[2]) &&
                validWeight(parts[3]) &&
                status.contains(parts[4]);
    }

    static boolean validCode(String code){

        if(!code.matches("SHIP-[1-9][0-9]{5}"))
            return false;

        String digits=code.substring(5);



        int count=1;
        for(int i=1;i<digits.length();i++){
            if(digits.charAt(i)==digits.charAt(i-1)){
                count++;
                if(count>3) return false;
            }
            else count=1;
        }
        return true;
    }


    static boolean validDate(String date){

        try{


            String[] d=date.split("-");
            int y=Integer.parseInt(d[0]);

            int m=Integer.parseInt(d[1]);
            int day=Integer.parseInt(d[2]);

            if(y<2000||y>2099)return false;
            if(m<1||m>12)return false;



            int[] days={31,28,31,30,31,30,31,31,30,31,30,31};


            if(m==2 && leap(y)) days[1]=29;

            return day>=1 && day<=days[m-1];

        }
        catch(Exception e){
            return false;
        }

    }

    static boolean leap(int y)
    {
        return (y%400==0) || (y%4==0 && y%100!=0);
    }


    static boolean validWeight(String w)
    {

        if(!w.matches("(0|[1-9][0-9]{0,5})(\\.[0-9]{1,2})?"))
            return false;



        double val=Double.parseDouble(w);
        return val>=0 && val<=999999.99;
    }
}