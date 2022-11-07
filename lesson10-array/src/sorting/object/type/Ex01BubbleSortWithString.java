package sorting.object.type;

import utils.ArrayUtils;

public class Ex01BubbleSortWithString {
	
	private enum NullOption {
		NULL_FIRST,
		NULL_LAST
	}

		public static void main(String[] args) {
			String[] data =  { "a","c","f","b","d"};
			//bubbleSort(data);
			ArrayUtils.printf("data --> ", data);
			
			System.out.println("=====================");
			
			data = new String[] {null,"a1","c3",null,"b2","f5","d4",null};
			bubbleSort(data,NullOption.NULL_FIRST);
			ArrayUtils.printf("data --> ", data);
			
			
		}
		
		// sorting ascending
		private static void bubbleSort(String[] elements, NullOption no) {
			for(int round = 0; round < elements.length; round++) {
				for(int i = 0; i < elements.length - round -1; i++) {
					String s1 = elements[i];
					String s2 = elements[i+1];
					
					if(NullOption.NULL_FIRST.equals(no)) {
						if(s1==null) {
							continue;
						}
						if(s2==null) {
							String tmp = elements[i];
							elements[i] = elements[i+1];
							elements[i+1] = tmp;
							continue;
						}
						
					} else if(NullOption.NULL_LAST.equals(no)) {
						if(s1==null && s2 != null) {
							String tmp = elements[i];
							elements[i] = elements[i+1];
							elements[i+1] = tmp;
							continue;
						}
						if(s2==null) {
							continue;
					}
				}
			}
		}
		}
	}


