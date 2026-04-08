public  class Subsets 
{

    public static void subset(String s,String sub,int i)
    {
        if(i==s.length())
        {
            System.out.println(sub);
            return;
        } 

        subset(s,sub+s.charAt(i),i+1);
        subset(s,sub,i+1);
    }

    public static void main(String args[])
    {
        String str ="KRP";
        subset(str,"",0);
    }
}
