package offer_train;

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 */
public class train_49 {
    public int StrToInt(String str) {
        boolean isZheng = true;
        if(str.startsWith("+")){
            str = str.substring(1);
        }else if(str.startsWith("-")){
            isZheng = false;
            str = str.substring(1);
        }
        if(str.equals("")) return 0;
        char[] chars = str.toCharArray();
        int[] result = new int[str.length()];
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {
            if ((int) chars[i] > 47 && (int) chars[i] < 58) {
                result[i] = (int) chars[i] - 48;
            } else {
                return 0;
            }
        }
        int index = 0;
        if (result[0] != 0) {
            for (int i = result.length - 1; i >= 0; i--) {
                sum = sum + result[i] * (int)Math.pow(10, index++);
            }
        } else {
            return 0;
        }
        if(!isZheng){
            sum = -sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        train_49 train_49 = new train_49();
        System.out.println(train_49.StrToInt("-12345"));
    }
}
