import java.util.Scanner;
public class Student_Grade_Calculatot {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
System.out.println("Welcome to Student Grade Calculator: ");
System.out.println("Enter Number of Subjects: ");
int Numofsub=scn.nextInt();
	int Totalmarks=0;
	for(int i=0;i<Numofsub;i++) {
	System.out.println("Enter Marks Obtained in Subject "+(i+1)+":");
	int marks=scn.nextInt();
	Totalmarks+=marks;
  }
	double avrgepercent=(double)Totalmarks/Numofsub;
	char Grade;
	if(avrgepercent>=90) {
		Grade='o';	
	}else if (avrgepercent>=80) {
		Grade='A';
	}else if (avrgepercent>=70) {
	Grade='B';
	}else if (avrgepercent>=60) {
	Grade='C';
	}else if (avrgepercent>=50) {
	Grade='D';
	}else if (avrgepercent>=40) {
	Grade='E';
	}else {
	Grade='F';
 }
	System.out.println("Total Marks Obtained: "+Totalmarks);
	System.out.println("Average Percentage: "+avrgepercent+"%");
	System.out.println("Grade Obtained:"+Grade);       
   }
}
