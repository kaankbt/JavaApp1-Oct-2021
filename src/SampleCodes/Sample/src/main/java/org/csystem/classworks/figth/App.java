package org.csystem.classworks.figth;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.console.Console;

class App {
    public static void main(String[] args)
    {
        Fighter f = new Fighter();

        f.setTitle("Short");
        f.setName("John");
        f.setStrength(79);
        f.setAgility(100);
        f.setHealth(98);

        Console.writeLine("Sum Of Abilities:%d", f.sumOfAbilities());
        Console.writeLine("Average Of Abilities:%f", f.averageOfAbilities());

        //...
    }
}

class Fighter {
    private String m_title;
    private String m_name;
    private final int [] m_abilities = new int[Ability.COUNT.ordinal()];
    private enum Ability {HEALTH, DURABILITY, STRENGTH, AGILITY, COUNT}
    //...

    public String getTitle()
    {
        return m_title;
    }

    public void setTitle(String title)
    {
        //...
        m_title = title;
    }

    public String getName()
    {
        //...
        return m_name;
    }

    public void setName(String name)
    {
        //...
        m_name = name;
    }

    public int getStrength()
    {
        return m_abilities[Ability.STRENGTH.ordinal()];
    }

    public void setStrength(int strength)
    {
        //...
        m_abilities[Ability.STRENGTH.ordinal()] = strength;
    }

    public int getAgility()
    {
        return m_abilities[Ability.AGILITY.ordinal()];
    }

    public void setAgility(int agility)
    {
        //...
        m_abilities[Ability.AGILITY.ordinal()] = agility;
    }

    public int getHealth()
    {
        return m_abilities[Ability.HEALTH.ordinal()];
    }

    public void setHealth(int health)
    {
        //...
        m_abilities[Ability.HEALTH.ordinal()] = health;
    }

    public int getDurability()
    {
        return m_abilities[Ability.DURABILITY.ordinal()];
    }

    public void setDurability(int durability)
    {
        //...
        m_abilities[Ability.DURABILITY.ordinal()] = durability;
    }
    public int sumOfAbilities()
    {
        return ArrayUtil.sum(m_abilities);
    }

    public double averageOfAbilities()
    {
        return (double)sumOfAbilities() / Ability.COUNT.ordinal();
    }
}
