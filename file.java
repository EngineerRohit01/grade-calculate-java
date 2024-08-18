import java.util.Scanner;

public class file{
	public static void main(String[] args){
		Scanner marks = new Scanner(System.in);
			System.out.print("enter  your marks");
			int mark = marks.nextInt();
			
			if(mark >= 90 && mark <= 100){
			System.out.print("Congrats you got grade A");
			}
			else if(mark >=80 && mark <= 89){
			System.out.print("Congrats you got grade B");
			}
			else if(mark>=70 && mark<=79){
			System.out.print("Congrats you got grade C");
			}
			else if(mark>=60 && mark<=69){
			System.out.print("Congrats you got grade D");
			}
			else{
			System.out.print("You need to more efferts for good grade");
			}
	}
}