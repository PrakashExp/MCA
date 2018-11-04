import java.sql.*;
import java.io.*;
import javax.swing.JOptionPane;
public class ass4emp extends javax.swing.JFrame {
 Connection con=null;
 int empno;
 String ename,grade,gra,job;
 float sal,commi;
    public ass4emp() {
        initComponents();
         try
    {
    Class.forName("oracle.jdbc.driver.OracleDriver");  
    con=DriverManager.getConnection("jdbc:oracle:thin:@172.16.7.4:1521:oracle","smca11","password");  
   Statement st=con.createStatement();  
    System.out.println("connection succesfull");
   }
    catch(ClassNotFoundException e)
    {
        System.err.println(e);
    }
    catch(SQLException e)
    {
    System.err.println(e);
}
    }

    
   

    
    private void txtsalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsalKeyPressed
int com=0;
        if(evt.getKeyCode()==evt.VK_ENTER)  
{
    int sal=Integer.parseInt(txtsal.getText());
    if(sal < 2000 || sal >7000)
    {
        JOptionPane.showMessageDialog(null,"SALARY SHOULD BETWEEN 2000 AND 7000","eRROR!",JOptionPane.ERROR_MESSAGE);
        txtsal.selectAll();
    }
    else
    {
    
    if(cmb1.getSelectedItem()=="Clerk" )
    {
        com=sal*5/100;
      
    }
     if(cmb1.getSelectedItem()=="Analyst" )
     {
          com=sal*10/100;
         
     }
      if(cmb1.getSelectedItem()=="Manager" )
      {
          com=sal*15/100;
          
      }
      if(RA.isSelected())
  com=com+300;
else if(RB.isSelected())
     com=com+200;
else if(RC.isSelected())
 com=com+100;
      txtcm.setText(com + "");
    }
}
    }


    private void jbaddActionPerformed(java.awt.event.ActionEvent evt) {        try
    {
Statement st1=null;
 st1=con.createStatement();  
ResultSet rs;
empno=Integer.parseInt(txtno.getText());
ename=txtname.getText();
if(RA.isSelected())

    grade="A";

else if(RB.isSelected())
    grade="B";
else if(RC.isSelected())
    grade="C";
if(cmb1.getSelectedItem()=="Clerk" )
{
    job="Clerk";
        
    }
else if(cmb1.getSelectedItem()=="Analyst" )
{
    job="Analyst";
        
    }
else if(cmb1.getSelectedItem()=="Manager" )
      {
job="Manager";
        
    }
if(grach.isSelected())
    gra="yes";
else
    gra="no";
sal=Float.parseFloat(txtsal.getText());
commi=Float.parseFloat(txtcm.getText());
rs=st1.executeQuery("select * from employee where Empno="+empno+"");
  if(rs.next()==true)
   JOptionPane.showMessageDialog(null,"Already present","eRROR!",JOptionPane.ERROR_MESSAGE);
 else
  {
  st1.executeUpdate("insert into employee values('"+empno+"','"+ename+"','"+grade+"','"+job+"','"+gra+"',"+sal+","+commi+")");
 JOptionPane.showMessageDialog(null,"Added","Success",JOptionPane.ERROR_MESSAGE);
    }
    }
catch(SQLException e)
    {
    System.err.println(e);
}
    
    }
    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {      empno=Integer.parseInt(txtno.getText());
      Statement st2=null;
 
ResultSet rs2;
try
{
    st2=con.createStatement();  
rs2=st2.executeQuery("select * from employee where Empno="+empno+"");
  if(rs2.next()==true)
  {
  txtno.setText(rs2.getInt("Empno") + "");
  txtname.setText(rs2.getString("Empname") + "");
  grade=rs2.getString("Grade");
  System.out.println(grade);
  if(grade.equals("A"))
      RA.setSelected(true);
  else if(grade.equals("B"))
      RB.setSelected(true);
   else if(grade.equals("C"))
      RC.setSelected(true);
  job=rs2.getString("Job");
  if(job.equals("Clerk" ))
{
   cmb1.setSelectedItem("Clerk");
        
    }
  else if(job.equals("Analyst" ))
{
    cmb1.setSelectedItem("Analyst");

        
    }
else if(job.equals("Manager"))
      {
cmb1.setSelectedItem("Manager");
        
    }
        gra=rs2.getString("Graduate");  
  if(gra.equals("yes"))
      grach.setSelected(true);
  else
       grach.setSelected(false);
  
  
 txtsal.setText(rs2.getFloat("Salary") + ""); 
 txtcm.setText(rs2.getFloat("Commission") + ""); 
      }
  else
  {
   JOptionPane.showMessageDialog(null,"Employee not present","eRROR!",JOptionPane.ERROR_MESSAGE);
  }
}
catch(SQLException e)
    {
    System.err.println(e);
}
    }

    private void jbdelActionPerformed(java.awt.event.ActionEvent evt) {         empno=Integer.parseInt(txtno.getText());
      Statement st2=null;
 
ResultSet rs2;
try
{
    st2=con.createStatement();  
rs2=st2.executeQuery("select * from employee where Empno="+empno+"");
 int res=JOptionPane.showConfirmDialog(null,"Are you sure you want to delete?","Deleting!!!", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
 if(res==JOptionPane.YES_OPTION) 
 {
  if(rs2.next()==true)
  {
       st2.executeUpdate("delete from employee where empno='"+empno+"'");
  }
  else
  {
       JOptionPane.showMessageDialog(null,"Employee not present","eRROR!",JOptionPane.ERROR_MESSAGE);
  }
}
}
  catch(SQLException e)
    {
    System.err.println(e);
}
    }
    private void jbeditActionPerformed(java.awt.event.ActionEvent evt) {    
          try
    {
Statement st1=null;
 st1=con.createStatement();  
ResultSet rs;empno=Integer.parseInt(txtno.getText());
ename=txtname.getText();
if(RA.isSelected())

    grade="A";

else if(RB.isSelected())
    grade="B";
else if(RC.isSelected())
    grade="C";
if(cmb1.getSelectedItem()=="Clerk" )
{
    job="Clerk";
        
    }
else if(cmb1.getSelectedItem()=="Analyst" )
{
    job="Analyst";
        
    }
else if(cmb1.getSelectedItem()=="Manager" )
      {
job="Manager";
        
    }
if(grach.isSelected())
    gra="yes";
else
    gra="no";
sal=Float.parseFloat(txtsal.getText());
commi=Float.parseFloat(txtcm.getText());
st1.executeUpdate("update employee set Empno="+empno+",Empname='"+ename+"',Grade='"+grade+"',Job='"+job+"',Graduate='"+gra+"',Salary="+sal+",Commission="+commi+" where Empno="+empno+"");
        
}
  catch(SQLException e)
    {
    System.err.println(e);
}
    }
   
    
    
 
    
    
    public static void main(String args[]) {
   
}
