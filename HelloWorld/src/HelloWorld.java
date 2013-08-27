import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args) 
    {
    	
    	String name;
    	int nameLength;
    	
    	name = JOptionPane.showInputDialog("What is your name? ");
        nameLength = name.length();
        System.out.println(name);

        String strOut = "";
        while(nameLength>0)
        {
        	strOut = "";
        	for(int i=0;i<nameLength;i++)
        		strOut = strOut + "*";
        	
        	System.out.println(strOut);        	
        	nameLength--;
        }
        System.out.println(name);
     
    }

}