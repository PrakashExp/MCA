

Button cmdCalc=new Button("Add");
Button cmdExit=new Button("Exit");

cmdCalc.addActionCommand("Add");
cmdExit.addActionCommand("Exit");

public void actionPerformed(ActionEvent e)
{


if(e.getActionCommand()=="Add")






















import java.awt.*;


class MyFrame extends Frame
{

MyFrame(String str)
{
super(str);
}

public boolean action(Event e, Object obj)
{

if(e.target instanceof Button)
{
System.out.println("Button pressed is  " +obj);
}

return true;
}
}






public class SubClassedContainer
{

public static void main(String arg[])
{

MyFrame f=new MyFrame("A Subclassed Container Window!");
Button cmd1=new Button("I am a vanilla Button");
Button cmd2=new Button("I am a StrawBerry Button");


f.setLaout(new FlowLayout());
f.setSize(200,200);

f.add(cmd);

f.setVisible(true);
}
}
