import java.util.Scanner;


public class HOLES {
	static int hole = 0;

	public static int countHole(String text){
	String[] charHoles=new String[] {"A", "D", "O","P","R", "B"};
	for(int i=0; i<text.length();i++){
		char textCharacter = text.charAt(i);
		if(textCharacter == 'A' || textCharacter == 'a' || textCharacter == 'D' || textCharacter == 'd'|| textCharacter == 'O' || textCharacter == 'o'|| textCharacter == 'P' || textCharacter == 'p'|| textCharacter == 'R'|| textCharacter == 'q' || textCharacter == 'b' || textCharacter == 'g' || textCharacter == 'e'){
			hole=hole+1;
		}
		else if(textCharacter == 'B'){
			hole= hole+2;
		}
	}
	return hole;
}

public static void main(String[] args){
	String text;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the text to check the number of holes:");
	text=scan.nextLine();
	countHole(text);
	System.out.println("The number of holes in the text are: " + hole); 
	scan.close();
}

}
