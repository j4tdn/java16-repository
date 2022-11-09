package sorting.object.type;

import utils.ArrayUtils;

public class Ex01BubbleSortWithString {
	private enum NullOption
	{
		NUll_FIRST,
		NULL_LAST
	}
	public static void main(String[] args) {
		String[] data = new String[]{"a", "c", "b", "d"};
		bubbleSort(data);
		ArrayUtils.printf("digits", data);

		System.out.println("============");
		data = new String[] {null, "a", "c",null, "b", "d",null};
		bubbleSort(data, NullOption.NULL_LAST);
		ArrayUtils.printf("digits", data);
		
	}
	// null last, null first
	// handle null values
	private static void bubbleSort(String[] elements, NullOption no)
	{
		for(int round = 0; round < elements.length; round ++)
		{
			for(int i  = 0; i < elements.length - round - 1;i++)
			{
				
				String s1 = elements[i];
				String s2 = elements[i+1];
				if(NullOption.NUll_FIRST.equals(no))
				{
					if(s1 == null)
					{
						continue;
					}
					if(s2 == null)
					{
						String tmp = elements[i];
						elements[i] = elements[i +1 ];
						elements[i+1] = tmp;
						continue;
					}
				}
				else if(NullOption.NULL_LAST.equals(no))
				{
					if(s1 == null && s2 != null)
					{
						String tmp = elements[i];
						elements[i] = elements[i +1 ];
						elements[i+1] = tmp;
						continue;
					}
					if(s2 == null)
					{
						continue;
					}
				}
				if(s1.compareTo(s2) > 0)
				{
					String tmp = elements[i];
					elements[i] = elements[i +1 ];
					elements[i+1] = tmp;
				}
			}
		}
	}
	// sorting ascending - sắp xếp giảm dần
	// un- handle null 
	private static void bubbleSort(String[] elements)
	{
		for(int round = 0; round < elements.length; round ++)
		{
			for(int i  = 0; i < elements.length - round - 1;i++)
			{
				if(elements[i].compareTo(elements[i+1]) > 0)
				{
					String tmp = elements[i];
					elements[i] = elements[i +1 ];
					elements[i+1] = tmp;
				}
			}
		}
	}
}
