public class Permutations 
{
    public static void permut(String s,String ans)
    {
        if (s.length()==0)
        {
            System.out.print(" "+ans);
            return;
        }

        for (int i=0;i<s.length();i++)
        {
            char curr= s.charAt(i);
            String str=s.substring(0,i)+s.substring(i+1,s.length());
            permut(str,ans+curr);
        }
    }
    public static void main(String args[])    
    {
        String s="KRP";

        permut(s,"");
    }
}
