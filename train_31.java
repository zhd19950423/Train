package offer_train;
/*
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
 */
public class train_31 {
	//蛮力法O(n^x)
	public int NumberOf1Between1AndN_Solution(int n) {
		int count=0;
        while(n>0){
            String str=String.valueOf(n);
            char [] chars=str.toCharArray();
            for(int i=0;i<chars.length;i++){
                if(chars[i]=='1')
                    count++;
            }
            n--;
        }
        return count;    
    }
	
	//特殊分析法O(n)
	public int NumberOf1Between1AndN_Solution_On(int n) {
		int count=0;
	    for(int i = 1; i <= n; i *= 10)
	    {
	        //i表示当前分析的是哪一个数位
	        int a = n / i;
	        int b = n % i;
	        if(a % 10 == 1) {
	        	count = count + ((a + 8) / 10) * i + (b + 1);
	        }else {
	        	count = count + ((a + 8) / 10) * i;
	        }
	    }
	    return count;   
    }
}
