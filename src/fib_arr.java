import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class fib_arr {
	public fib_n array[];
	public fib_arr(int n) {
		if(n<=2)
			return;
		this.array = new fib_n[n];
		this.array[0]= new fib_n(1);
		this.array[1] = new fib_n(1);
		for(int i = 0; i < n-2; i++) {
			this.array[i+2] = new fib_n((int) (this.array[i].get_fib_num()  + this.array[i+1].get_fib_num()));
		}
	}


public List suitable() {//які числа можна задати як  x^2 + 1(на 1 більше ніж певний квадрат)
	List<Integer> temp = new ArrayList<Integer>();
	int j = 0;
	for(int i = 0; i < array.length; i++) {
		if(array[i].is_suitable())
		temp.add((int) array[i].get_fib_num()); 
		}
	return temp;
}

public void res_output() {
	System.out.println("\n Числа Фібоначчі, які задовольняють умову завдання з їх порядковими номерами в послідовності Фібоначі:");
	List<Integer> res = this.suitable();
	for(int i = 0; i < res.size(); i++) {
		System.out.println(res.get(i));
		}
}

	
}
