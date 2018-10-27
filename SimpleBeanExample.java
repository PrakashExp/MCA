Steps for creating and using a Java Bean:

- Create a directory (example :    mycomponents)
- Create the bean     (example :   MyBean)


import java.io.*;

public class MyBean implements Serializable
{
   protected  int amount;
 
   public MyBean()
   {
   }
 
   public void setAmount(int amount)
   {
      this.amount = amount;
   }
 
   public int getAmount()
   {
      return amount;
   }
   public float comm()
   {
      return(0.05f*amount);
   }
}


- Save the bean  in the directory created.



- Compile the Bean: 
     
     javac MyBean.java



- Create a manifest file: manifest.mf

     Name: MyBean.class
     Java-Bean: True



- Create the JAR file: 

     jar cfm MyBean.jar manifest.tmp MyBean.class 


- Using the bean :

  - Set CLASSPATH to the jar file
   
     set CLASSPATH=%CLASSPATH%; c:\mycomponents\MyBean.jar


- Create a program to use the bean: 


import java.beans.*;

class BeanDemo
{
public static void main(String arg[])
{

try {
           
MyBean bean = (MyBean)Beans.instantiate(ClassLoader.getSystemClassLoader(), 
"MyBean");


or

MyBean bean = (MyBean)Beans.instantiate(null,"MyBean");

or

MyBean bean=new MyBean();


        bean.setAmount(10000);
        int amt=bean.getAmount();
        System.out.println(amt);
        System.out.println(bean.comm());



    } catch (ClassNotFoundException e) {
    } catch (IOException e) {
    }

}
}




 





























