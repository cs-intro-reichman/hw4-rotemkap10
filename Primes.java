public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean ar[] = new boolean [n+1];
        System.out.println("Prime numbers " + n);
        for(int i =0; i<ar.length;i++)
        {
            ar[i] = true;
        }
        int index = 2;
        for(int i =2; i<ar.length; i++)
        {
            index = i;
            while(index<ar.length)
            {
                if(index+i<ar.length)
                {
                    ar[i+index] = false;
                }
                
                index = index + i;
            }
        }
        int count = 0;
        ar[0] = false;
        ar[1] =false;
        for(int i =0; i<ar.length; i++)
        {
            if(ar[i] == true)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count +" primes between 2 and " + n +" (" + (count*100)/n +"% are primes)");

        }
       
       

        
    }  
