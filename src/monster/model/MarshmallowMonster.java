package monster.model;

public class MarshmallowMonster
{
	//Name (string) legCount(Int), spookylegCount(Int),eyeCount (Int), earCount(Int), hasTail(Boolean),hasNose(Boolean), hasMouth(Boolean), percentOfRibbon (Double), percentOfCute(Double)

	private String name;
	private int legCount;
	private int spookylegCount;
	private boolean hasTail;
	private boolean hasMouth;
	private double percentOfRibbon;
	private double percentOfCute;
	
	public MarshmallowMonster()
	{
		this.name = "Celia";
		this.legCount = 4;
		this.spookylegCount = 2;
		this.hasTail = true;
		this.hasMouth = true;
		this.percentOfRibbon = 0.9;
		this.percentOfCute = 99.999;
	}
}
