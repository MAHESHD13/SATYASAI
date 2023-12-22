package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_03 {

	public static void main(String[] args) 
	{
		ArrayList<Players_01> players =new ArrayList<Players_01>();
		
		Players_01 player1=new Players_01();
		player1.setPid(101);
		player1.setPname("dhoni");
		player1.setPage(31);
		player1.setPteam("csk");
		
		Players_01 player2=new Players_01();

		player2.setPid(102);
		player2.setPname("virat kohli");
		player2.setPage(28);
		player2.setPteam("rcb");
		
		Players_01 player3=new Players_01();

		player3.setPid(103);
		player3.setPname("rahul");
		player3.setPage(22);
		player3.setPteam("csk");
		
		Players_01 player4=new Players_01();

		player4.setPid(104);
		player4.setPname("rashid khan");
		player4.setPage(25);
		player4.setPteam("kkr");
		
		Players_01 player5=new Players_01();

		player5.setPid(105);
		player5.setPname("raina");
		player5.setPage(21);
		player5.setPteam("csk");
		
		Players_01 player6=new Players_01();

		player6.setPid(106);
		player6.setPname("andree rusell");
		player6.setPage(35);
		player6.setPteam("kkr");
		
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		players.add(player5);
		players.add(player6);
		
		for(Players_01 player:players)
		{
			if(player.getPname().equals("dhoni"))
			{
				System.out.println(player);
			}
		}

		System.out.println("************************************");
		for(Players_01 player:players)
		{
			if(player.getPage()<30)
			{
				System.out.println(player);
			}
		}
		System.out.println("************************************");
		
		for(Players_01 player:players)
		{
			if(player.getPid()==101)
			{
				player.setPname("MSDhoni");
				player.setPage(33);
			}
		}
		
		Players_01 maxage=players.get(0);
		for(Players_01 player :players) 
		{
			if(player.getPage() > maxage.getPage())
			{
				maxage=player;
			}
		}
		players.remove(maxage);
		
		System.out.println("-----------------");
		
		Players_01 minage=players.get(0);
		for(Players_01 player :players) 
		{
			if(player.getPage() < minage.getPage())
			{
				minage=player;
			}
		}
		System.out.println(minage);
		System.out.println("*********************");
		for(Players_01 player:players)
		{
			System.out.println(player);
		}
		System.out.println("*************");
		
			
		
	}

}
