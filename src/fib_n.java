import java.lang.Math;
/**
 * @author Mykhailo
 * @version 11/09/2023
 *  
 */
public class fib_n {
/**contains number and value of one member of Fibonacci sequence
 */
	public fib_n(int n) {
		set_fib_num(n);
	}
private long fib_num ;


/**
 * sets the number of Fibonacci sequence
 * @param num sequence number
 */
public void set_fib_num(int num) {
	this.fib_num = num;
}
/**
 * getter of num 
 * @return num
 */
	public long get_fib_num() {
	return this.fib_num;
}

/**
 * checking the number
 * @return true or false
 */
public boolean is_suitable() {
	return !((Math.sqrt(this.fib_num-1)) - (long)Math.sqrt(this.fib_num-1) > 0);
}
}
