public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String []newSentence = new String [sentences.length];
        String [] newKey = new String [keywords.length];
        for(int i =0; i<keywords.length; i++)
        {
            newKey[i] = lowerCase(keywords[i]);
        }
        for(int i =0; i<sentences.length; i++)
        {
            newSentence[i] = lowerCase(sentences[i]);
        }
        for(int i =0; i < sentences.length; i++)
        {
            for(int j = 0; j < keywords.length; j++)
            {
                if(contains(newSentence[i],newKey[j]))
                {
                    System.out.println(sentences[i]);
                    break;
                }
                
            }
        }
       
    }


        

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
    public static boolean contains(String str1, String str2) {
        String newStr1 = lowerCase(str1);
        String newStr2 = lowerCase(str2);
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
