package ex05;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Contestant;

public class Ex05MissIt {
	private static final String pathname = "text\\MissIt.txt";
	public static void main(String[] args) throws FileNotFoundException {	
		List<List<Integer>> list = new ArrayList<>();
//		File file = new File(pathname);
//		
//		List<String> lines = FileUtils.read(file);
//		
//		lines.forEach(System.out::println);
		

		FileInputStream fileInputStream = new FileInputStream(pathname);
       Scanner scanner = new Scanner(fileInputStream);
        
        while(scanner.hasNextLine())
        {
           String s=scanner.nextLine()+" ";
           list.add(lineOfNumber(s));
           
        }

		System.out.println(list.toString());
		System.out.println();

		Map<Integer, Contestant> map = new HashMap<>();

		for(int i=1; i<list.size(); i++)
		{
			for(int j=1; j<list.get(i).size(); j++)
			{
				if(!map.containsKey(list.get(i).get(j)))
				{
					Contestant tmp=new Contestant(list.get(i).get(j));
					tmp.pushScore(4-j); 
					map.put(list.get(i).get(j), tmp);
				}
				else
				{
					Contestant tmp=map.get(list.get(i).get(j));
					tmp.pushScore(4-j);
					map.replace(list.get(i).get(j), tmp);
				}
			}
		}
		map = removeLowScore(map);
		if(map.size()>1)
			map=removeFirstPosition(map);
		if(map.size()>1)
			map=removeSecondPosition(map);

		for(Contestant a :map.values())
		{
			System.out.print(a.getId() + " ");
		}

	}
	
	static List<Integer> lineOfNumber(String s)
	{
		List<Integer> line=new ArrayList<>();
		int number=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				line.add(number);
				number=0;
			}
			else
			{
				number=number*10+(s.charAt(i)-'0');
			}
		}
		return line;
	}
	
	public static Map<Integer, Contestant> removeLowScore(Map<Integer, Contestant> map)
	{
		int score=0;
		for(Contestant a : map.values())
		{
			if(a.getScore() > score)
				score = a.getScore();
		}
		Map<Integer, Contestant> tmp=new HashMap<>();

		for(Contestant a : map.values())
		{
			if(a.getScore() == score)
				tmp.put(a.getId(), a);
		}
		return tmp;
	}

	public static Map<Integer, Contestant> removeFirstPosition(Map<Integer, Contestant> map)
	{
		int score=0;
		for(Contestant a :map.values())
		{
			if(a.numberOfFirstPosition() > score)
				score = a.numberOfFirstPosition();
		}
		Map<Integer, Contestant> tmp=new HashMap<>();

		for(Contestant a :map.values())
		{
			if(a.numberOfFirstPosition() == score)
				tmp.put(a.getId(), a);
		}
		return tmp;
	}

	public static Map<Integer, Contestant> removeSecondPosition(Map<Integer, Contestant> map)
	{
		int score = 0;
		for(Contestant a :map.values())
		{
			if(a.numberOfSecondPosition() > score)
				score = a.numberOfSecondPosition();
		}
		Map<Integer, Contestant> tmp = new HashMap<>();

		for(Contestant a :map.values())
		{
			if(a.numberOfSecondPosition()==score)
				tmp.put(a.getId(), a);
		}
		return tmp;
	}
}