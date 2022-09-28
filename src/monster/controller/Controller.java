package monster.controller;
import monster.model.MarshmallowMonster;
import java.util.ArrayList;
public class Controller
{
	private MarshmallowMonster basicMonster; 
	private MarshmallowMonster myMonster;
	
	public Controller()
	{
		this.basicMonster = new MarshmallowMonster();
		this.myMonster = new MarshmallowMonster("Carrot", 2000, 100, true, true, 0.9, 99.999);
	}
	public void start()
	{
		manyMonsters();
		System.out.println("i made a monster!");

	//	useGetters();
	//	useSetters();

	}
	
	private void manyMonsters()
	{
		ArrayList<MarshmallowMonster> monsterList = new ArrayList<>();
		for (int index = 0; index < 10_000; index++)
		{
			MarshmallowMonster current = new MarshmallowMonster();
			current.setName("I am monster #" + index);
			current.setlegCount(index*3);
			
			monsterList.add(current);
		}
		
		for (MarshmallowMonster currentMonster : monsterList)
		{
			if (currentMonster.getlegCount() % 17 == 4)
					{
							currentMonster.sethasTail(false);
												}


		}
		for (MarshmallowMonster currentMonster : monsterList)
		{
			if (currentMonster.gethasTail())
			{
				System.out.println(currentMonster.getName());
			}
		}
		MarshmallowMonster randomMonster;
		for (int index=0; index<10; index++)
		{
			int randomSpot = (int) (Math.random() * monsterList.size());
			randomMonster = monsterList.get(randomSpot);
			System.out.println("The random spot is: " + randomSpot);
			System.out.println("the randomMonster name is: " + randomMonster.getName());
		}
	}
	

	private void useGetters()
	{
		System.out.println("The basic mosnter name is: " + basicMonster.getName() + " i have so many legs - a whole " + basicMonster.getlegCount() + ", also i have " + basicMonster.getspookylegCount() + " spooky legs! do i have a tail????" + basicMonster.gethasTail());
		System.out.println("The percentage of how cute I am is " + basicMonster.getpercentOfCute());
		System.out.println("The fact that i have a mouth is " + basicMonster.gethasMouth());
		System.out.println("The percent of how much ribbon I have is " + basicMonster.getpercentOfRibbon());
		System.out.println(myMonster);
	}
	private void useSetters()
	{
		System.out.println("The name is currently : " + myMonster.getName());
		String betterName = "Harlow Lux";
		myMonster.setName(betterName);
		System.out.println("The name is now: " + myMonster.getName());
		System.out.println("The leg count is " + myMonster.getlegCount());
		int betterlegCount = 9;
		myMonster.setlegCount(betterlegCount);
		System.out.println("The leg count now is: " + myMonster.getlegCount());
		int betterspookylegCount = 100;
		myMonster.setspookylegCount(betterspookylegCount);
		System.out.println("The spooky leg count is " + myMonster.getspookylegCount());
		System.out.println("The percent of ribbon is currently: " + myMonster.getpercentOfRibbon());
		
		double betterRibbon = 88.88;
		myMonster.setpercentOfRibbon(betterRibbon);
		System.out.println("The name is now: " + myMonster.getpercentOfRibbon());
		boolean betterhasTail = true;
		myMonster.sethasTail(betterhasTail);
		System.out.println("The fact that the monste now has a tail is " + myMonster.gethasTail());
		boolean betterhasMouth = false;
		myMonster.sethasTail(betterhasMouth);
		System.out.println("The fact that the monste now has a tail is " + myMonster.gethasMouth());
	}

}
