import java.util.Scanner;
public class NumberGame {
public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int Maxattempts=10;
int finalscore=0;
boolean playAgain=true;
System.out.println(" Welcome to the  Number game Dear Player !");
System.out.println(" Hello player you have about " +Maxattempts+ " attempts to win the game");
    while(playAgain) {
    int random=getrandNum(1,100);
    boolean expected=false;
	for(int i=0;i<Maxattempts;i++) {
	System.out.println("Attempt " +(i+1)+ "/"+Maxattempts+" Enter your expected:" );
	int user=scn.nextInt();
	if(user==random) {
	expected=true;
	finalscore+=1;
	System.out.println(" Congratulations! You won the Game and the correct number was " + random +" in " + (i + 1) + " attempts.");
	break;
	}
	else if(user > random) {
	System.out.println("Too High. Try again");					
	}else {
    System.out.println(" Too Low. Try again ");
	}
}
if(expected==false) {
System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was "+ random + ".");
}
System.out.println(" Do you want to play again(yes/no)? ");
String trail=scn.next();
playAgain=trail.equalsIgnoreCase("yes");	
}
System.out.println(" Thank you for participation , Hope enjoyed it ");
System.out.println(" Here is your finalscore :" +finalscore);
}
public static int getrandNum(int min, int max) {
	return (int)(Math.random()*(max-min-1)+min);
}
}
