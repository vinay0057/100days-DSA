package Strings;



public class BasicIntro {
    public static void main(String[] args) {
        /*int a = 123;
        String s = "";
        System.out.println(s+a);*/

        String s = "isThisText";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') count++;
        }

        System.out.println(count + 1);

    }
}
