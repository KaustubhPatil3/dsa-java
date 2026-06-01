class MaxBalancedPartitions
{
	public static int maxPartitions(String str)
	{
		int countL = 0;
		int countR = 0;
		int partitions = 0;
		
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'L')
			{
				countL++;
			}
			else
			{
				countR++;
			}
			
			if (countL == countR)
			{
				partitions++;
				countL = 0;
				countR = 0;
			}
		}
		
		return partitions;
	}
	
	public static void main(String[] args)
	{
		String str = "LRRRRLLRLLRL";
		System.out.println(maxPartitions(str));
	}
}