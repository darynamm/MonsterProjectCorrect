package monster.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import monster.model.MarshmallowMonster;

public class MarshmallowMonsterTest
{
	private MarshmallowMonster testedMonster;

	@BeforeEach
	public void setUp() throws Exception
	{
		testedMonster = new MarshmallowMonster();
	}

	@AfterEach
	public void tearDown() throws Exception
	{
		testedMonster = null;
	}

	@Test
	public void testToString()
	{
		assertNotNull(testedMonster.toString(), "The toString method must not return null.");
		assertTrue(testedMonster.toString().indexOf("@") == -1, "You must override the toString method.");
	}
	
	@Test
	public void testDataMembers()
	{
		Field [] testedFields = testedMonster.getClass().getDeclaredFields();
		assertTrue(testedFields.length >= 6, "You need at least 6 data members in your Monster class!");
		
		for (Field currentField : testedFields)
		{
			assertTrue(Modifier.isPrivate(currentField.getModifiers()), "All data members MUST be private!");
		}
		
	}
	
	@Test
	public void testSetters()
	{
		Method [] testedMethods = testedMonster.getClass().getDeclaredMethods();
		
		int minSetterCount = 6;
		int setterCount = 0;
		for (Method currentMethod : testedMethods)
		{
			if (currentMethod.getName().indexOf("set") == 0)
			{
				setterCount++;
				assertTrue(currentMethod.getParameterCount() == 1, "All setters have exactly 1 parameter");
			}
			assertTrue(Modifier.isPublic(currentMethod.getModifiers()), "All setters must be public!");

		}
		
		assertTrue(setterCount >= minSetterCount, "You need at least " + minSetterCount + " setter methods");
	}

	@Test
	public void testGetters()
	{
		Method [] testedMethods = testedMonster.getClass().getDeclaredMethods();
		
		int minGetterCount = 6;
		int getterCount = 0;
		for (Method currentMethod : testedMethods)
		{
			if (currentMethod.getName().indexOf("get") == 0)
			{
				getterCount++;
				assertTrue(currentMethod.getParameterCount() == 0, "All setters have exactly 0 parameters");
			}
			assertTrue(Modifier.isPublic(currentMethod.getModifiers()), "All getters must be public!");

		}
		
		assertTrue(getterCount >= minGetterCount, "You need at least " + minGetterCount + " getter methods");
	}
	
	@Test
	public void testConstructors()
	{
		Constructor[] monsterConstructors = testedMonster.getClass().getDeclaredConstructors();
		assertTrue(monsterConstructors.length > 1, "You should have at least 2 written constructors for the MarshmallowMonster class!");
		int minimumParameterCount = 6;
		int validConstructorCount = 1;
		for (Constructor currentConstructor : monsterConstructors)
		{
			int currentParamCount = currentConstructor.getParameterCount();
			if (currentParamCount >= minimumParameterCount)
			{
				validConstructorCount += 1;
			}
		}
		assertTrue(validConstructorCount > 1, "At least one constructor must have " + minimumParameterCount + " parameters");
	}


}
