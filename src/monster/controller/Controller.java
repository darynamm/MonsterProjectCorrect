package monster.controller;
import monster.model.MarshmallowMonster;
public class Controller
{
	private MarshmallowMonster basicMonster; 
	
	public Controller()
	{
		this.basicMonster = new MarshmallowMonster();
	}
	public void start()
	{
		System.out.println("i made a monster!");
		System.out.println(basicMonster);
	}
}
