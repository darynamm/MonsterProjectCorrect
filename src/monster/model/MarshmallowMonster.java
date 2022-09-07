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

public MarshmallowMonster(String name, int legCount, int spookylegCount, boolean hasTail, boolean hasMouth, double percentOfRibbon, double percentOfCute)
{
	this.name = name;
	this.legCount = legCount;
	this.spookylegCount = spookylegCount;
	this.hasTail = hasTail;
	this.hasMouth = hasMouth;
	this.percentOfRibbon = percentOfRibbon;
	this.percentOfCute = percentOfCute;
}

public String toString()


{
	String description = "I am a monster!";
	description += "\n";
	description += "My name is " + name + "\n";
	description += "I have: " + legCount + " legs!";
	description += "I have " + spookylegCount + " spooky legs!";
	return description;
}


public String getName()
{
	return this.name;
	
}
public int getlegCount()
{
	return this.legCount;
}
public int getspookylegCount()
{
	return this.spookylegCount;
}
public boolean gethasTail()
{ 
	return this.hasTail;
}
public boolean gethasMouth()
{
	return this.hasMouth;
}
public double getpercentOfRibbon()
{
	return this.percentOfRibbon;
	
}
public double getpercentOfCute()
{
	return this.percentOfCute;
}
public void setName(String name)
{
	this.name = name;
}
public void setlegCount(int legCount)
{
	this.legCount = legCount;
}
public void setspookylegCount(int spookylegCount)
{
	this.spookylegCount = spookylegCount;
}
public void sethasMouth(boolean hasMouth)
{
	this.hasMouth = hasMouth;
}
public void percentOfRibbon(double percentOfRibbon)
{
	this.percentOfRibbon = percentOfRibbon;
}
}