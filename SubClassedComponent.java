
import java.awt.*;



class MyButton extends Button
{
MyButton(String s)
{
super(s);
}
public boolean action(Event e, Object obj)
{
System.out.println("Pressed button is" + obj);
return true;
}
}


public class SubClassedComponent 
{

public static void main(String arg[])
{

Frame f;
MyButton cmd1;
MyButton cmd2;



f=new Frame("A Vanilla Frame Window");
cmd1=new MyButton("I am vanilla button");
cmd2=new MyButton("I am Stawberry button");

f.setLayout(new FlowLayout());
f.add(cmd1);
f.add(cmd2);

f.setSize(200,200);
f.setVisible(true);
}
}




