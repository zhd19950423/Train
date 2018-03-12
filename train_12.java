package offer_train;


/*
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 */
public class train_12 {
	public double Power(double base, int exponent) {
		double result = 1;
		if(exponent == 0) {
			return 1;
		}
		boolean flag = false;
		if(exponent < 0) {
			flag = true;
			exponent = -exponent;
		}
		
		for(int i = 0; i < exponent; i++) {
			result = result * base;
		}
		if (flag) {
			result = 1 / result;
		}
        return result;
	}
}
