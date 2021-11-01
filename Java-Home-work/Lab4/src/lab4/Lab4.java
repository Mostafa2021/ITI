package lab4;
public class Lab4 {

    public static void main(String[] args) {
        String s1="First";
        String s2="Second";
        String Longer=MyString.betterString(s1, s2, (a,b)->a.length()>b.length());
        String First=MyString.betterString(s1, s2, (a,b)->true);
        
        
        System.out.println("Longer : "+Longer);
        System.out.println("First : "+First);
    }
    
}
