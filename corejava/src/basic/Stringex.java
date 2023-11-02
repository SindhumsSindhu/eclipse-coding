package basic;

public class Stringex {

	public static void main(String[] args) {
String str = " welocome to edubridge";
        
        //Welcomeconvert string into character array
        char[] arr = str.toCharArray();
        
        String tempStr = "";
        
        for(char c:arr){
            
            if(c != ' '){
                tempStr += c;
            }
           // System.out.println(c);
            System.out.println("Temp"+tempStr);
        }
         str = tempStr;
        System.out.println(str);

	}

}
