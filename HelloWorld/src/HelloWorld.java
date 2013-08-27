import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        int intC = 15;
        String strOut = "";
        while(intC>0){
        	strOut = "";
        	for(int i=0;i<intC;i++){
        		strOut = strOut + "*";
        	}
        	System.out.println(strOut);        	
        	intC--;
        }
    }

}