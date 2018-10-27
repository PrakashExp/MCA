

import java.beans.*;

public class TestBean
{

protected PropertyChangeSupport psupport=new PropertyChangeSupport(this);

protected int startvalue;

public TestBean()
{
startvalue=99;
}

public void setAmount(int newvalue)
{
int oldvalue=startvalue;
startvalue=newvalue;
psupport.firePropertyChange("amount", new Integer(oldvalue), new Integer(newvalue));
}

public int getAmount()
{
return startvalue;
}

public void addPropertyChangeListener(PropertyChangeListener l)
{
psupport.addPropertyChangeListener(l);
}

public void removePropertyChangeListener(PropertyChangeListener l)
{
psupport.removePropertyChangeListener(l);
}
}



import java.beans.*;
import java.io.*;

public class TestBeanPropertyChangeDemo implements PropertyChangeListener
{

protected TestBean ourbean;

public static void main(String arg[])
{

ourbean=(TestBean)Beans.instantiate(null,"TestBean");

if(ourbean=null)
{
System.out.println("Could not instantiate TestBean");
System.exit(0);
}

ourbean.addPropertyChangeListener(this);

ourbean.setAmount(1234);
System.exit(0);
}

public void propertyChange(PropertyChangeEvent e)
{
String changedproperty;
Object oldvalue, newvalue;
changedproperty=e.getPropertyName();
oldvalue=e.getOldValue();
newvalue=e.getNewValue();
System.out.println("TestBean property is " + changedproperty);
System.out.println("Old Value was  " + oldvalue);
System.out.println("New Value is  " + new value);
}
}


