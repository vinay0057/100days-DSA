package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //sb have some initial capacity
        sb.append("Hello");// if we use append method then, if the string length is less than 16
        //than it wont double it, until unless it is full
        //but if at creation time i pass any string in the constructor than it will automatically
        //doubles the length
        //System.out.println(sb.length()+" "+sb.capacity());

        sb.setCharAt(0, 'M');
        System.out.println(sb);

       //String s =  sb.toString();
        //System.out.println(s);

        //System.out.println(sb.reverse());
       // sb.replace(0,3, "Hmn");
        //System.out.println(sb);

        String s = "abcd";
        /*String result = ""; every time new object in the memory
        for(int i=s.length()-1; i>=0; i--){
            result += s.charAt(i);
        }
        s = result;
        System.out.println(s);*/

        /*StringBuilder sbs = new StringBuilder();
        sbs.append(s);
        sbs.reverse();
        s = sbs.toString();
        System.out.println(s);*/
    }
}
