package offer_train;
/*
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 */
public class train_7 {
    public int Fibonacci(int n) {    	
		return this.calculateFibonacci(n);
    }
    public int calculateFibonacci(int n) {
    	int result = 1;
    	if (n == 0 || n == 1) {
    		return result;
    	}
    	else {
			result =  calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
		}
		return result;
    }
}
