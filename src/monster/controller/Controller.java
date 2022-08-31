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
		System.out.println(basicMonster);
		System.out.println(myMonster);
	}
}
