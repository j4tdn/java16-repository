package view;

import service.ItemGroupService;
import service.ItemGroupServiceIpml;

public class Ex04HibernateCacheDemo {

	private static ItemGroupService itemGroupService;
	
	static
	{
		itemGroupService = new ItemGroupServiceIpml();
	}
	public static void main(String[] args) {
		
		itemGroupService.demoHibernateCache();
	}
}
