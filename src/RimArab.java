public class RimArab {
    public static int NumToArab(String elem){
        boolean f = false;
        for(int i=0;i<elem.length();i++) {
            if(elem.charAt(i) != '1' && elem.charAt(i) != '5' && elem.charAt(i) != '6' && elem.charAt(i) != '8' && elem.charAt(i) != '0' && elem.charAt(i) != '4' && elem.charAt(i) != '7' && elem.charAt(i) != '9' && elem.charAt(i) != '2' && elem.charAt(i) != '3')
                f =  true;
            if (f) break;
        }
        if(f) return -1;
        else return Integer.parseInt(elem);
    }
    public static int NumToRim(String elem){
        if(elem.equals("I")) return 1;
        else if(elem.equals("II")) return 2;
        else if(elem.equals("III")) return 3;
        else if(elem.equals("IV")) return 4;
        else if(elem.equals("V")) return 5;
        else if(elem.equals("VI")) return 6;
        else if(elem.equals("VII")) return 7;
        else if(elem.equals("VIII")) return 8;
        else if(elem.equals("IX")) return 9;
        else if(elem.equals("X"))return 10;
        else return -1;
    }
}
