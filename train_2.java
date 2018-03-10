package offer_train;
/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class train_2 {
	static String string0 = "  we";
	static String string1 = " we  are hello ";
	static String string2 = "hello  ";
	public static String replaceSpace(String str) {
		String newstr = str.toString();
		int index = str.indexOf(" ");
		while(index >= 0) {
			newstr = newstr.substring(0, index) + "%20" + newstr.substring(index+1);
			index = newstr.indexOf(" ");
		}
		String result = newstr;
		return result;
    }
	public static void main(String[] args) {
		
		System.out.println(replaceSpace(string0));
		System.out.println(replaceSpace(string1));
		System.out.println(replaceSpace(string2));
	}
}
