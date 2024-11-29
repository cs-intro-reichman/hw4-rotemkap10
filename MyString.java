public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
        System.out.println(contains("resignation", "resi")); // true
        System.out.println(contains("our product will transform the market", "disrupt"));
        System.out.println(contains("Programming is both painful and engaging", "is"));
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newString = "";
        for(int i = 0; i<str.length();i++)
        {
            if((str.charAt(i)>64) && (str.charAt(i)<91))
            {
                newString += (char)(str.charAt(i)+32);
            }
            else
            {
                newString += str.charAt(i);
            }
        }

        return newString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        String newStr1 = str1;
        String newStr2 = str2;
        if(str2.isEmpty()){
            return true;
        }
        if(str1.isEmpty()){
            return false;
        }
        if (newStr2.length() > newStr1.length())
        {
            return false;
        }
    
        if (newStr2.length() > newStr1.length())
        {
            return false;
        }
        for(int i =0; i<str2.length(); i++)
        {
            for(int j = 0; j<str1.length(); j++)
            {
                if(newStr2.charAt(i) == newStr1.charAt(j) && (j+str2.length()<=str1.length()))
                {
                     if(str2.equals(str1.substring(j,j+str2.length())))
                        return true;
                       
                }
            }
        }
        return false;
    }
}

