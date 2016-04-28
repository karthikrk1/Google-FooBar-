import java.util.*;
public class BetaRabbit {
	public static int answer(int x){
		int result = x%9;
		return result;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = in.nextInt();
		System.out.println(answer(x));
	}
}
