package manTree;
import java.util.Scanner;

	public class ManTree {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			if(n <= a) {
				System.out.println("true");
			}
			else if((n-1)%10 == 0) {
				System.out.println("true");
				}
			else if (n%10 == 0) {
				System.out.println("true");
				}
			else {
				System.out.println("false");
			}
			

		}

	}



