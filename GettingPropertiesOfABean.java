Bean Introspection:

Getting the details of the properties, methods, events and features of a bean is called bean introspection. To extract the details of a bean you can make use of Introspector class and BeanInfo interface.

BeanInfo interface:

BeanInfo defines methods that return descriptors for each property, method, or event that you want exposed. The following are the prototypes for these methods:

    PropertyDescriptor[] getPropertyDescriptors();
    MethodDescriptor[]   getMethodDescriptors();
    EventSetDescriptor[] getEventSetDescriptors();





import java.beans.*;

   public class EmpBean implements Serializable{

	
        int mempno; 
        String mempName;
        public EmpBean()
	   {
	   }
        public int getEmpNo() {
            return mempno;
        }
        public void setEmpNo(int i) {
	   mempno=i;
        }

        public void setEmpName(String s) {
            mempName=s;
        }

        public String getEmpName() {
            return mempName;
        }
        
    
    
    }



class GettingPropertiesOfABean
{
public static void main(String arg[])
{

try {
        BeanInfo bi = Introspector.getBeanInfo(EmpBean.class);
        PropertyDescriptor pds[] = bi.getPropertyDescriptors();

        for (int i=0; i<pds.length; i++) 
       {

            String propName = pds[i].getName();
            System.out.println(propName);
        }

    } 
  catch (java.beans.IntrospectionException e) 
    {
        System.out.println(e);
    }

}
}







    
 