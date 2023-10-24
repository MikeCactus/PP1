import java.util.Scanner;

public class Menu {
		public Menu() {
			fib_arr res_arr = new fib_arr(EnterN());
			res_arr.res_output();
		}
		public static int EnterN() {
			int n = -1;
			Scanner input = new Scanner(System.in);
			
			do{
				System.out.print("Введіть кількість перших чисел Фібоначчі:");
				while(!input.hasNextInt()) {
					input.next();
					System.out.println("Хибні дані");
				}
				n = input.nextInt();
			}while(n < 0);
			input.close();
			return n;
		}
}
