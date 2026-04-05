public class RemoveDuplicates
{
    public static void duplicate(int i,String str,StringBuilder s,boolean map[])
    {
        if(i==str.length())
        {
            System.out.println(s);
            return;
        }

        char curr=str.charAt(i);

        if(map[curr-'a']==true)
        {
            duplicate(i+1, str, s, map);
        }
        else
        {
            map[curr-'a']=true;
            duplicate(i+1, str, s.append(curr), map);
        }

    }
    public static void main(String args[])
    {
        String str="apnacollege";

        duplicate(0,str,new StringBuilder(""),new boolean [26]);
    }
}