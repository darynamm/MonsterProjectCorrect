package monster.controller;
import monster.model.MarshmallowMonster;
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
		System.out.println("i made a monster!");
		System.out.println("The basic mosnter name is: " + basicMonster.getName() + " i have so many legs - a whole " + basicMonster.getlegCount() + ", also i have " + basicMonster.getspookylegCount() + " spooky legs! do i have a tail????" + basicMonster.gethasTail());
		System.out.println("The percentage of how cute I am is " + basicMonster.getpercentOfCute());
		System.out.println("The fact that i have a mouth is " + basicMonster.gethasMouth());
		System.out.println("The percent of how much ribbon I have is " + basicMonster.getpercentOfRibbon());
		System.out.println(myMonster);
		

	}
}
