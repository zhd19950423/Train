package offer_train;

public class train_53 {
    public static boolean isNumeric(char[] str) {
        String S = String.valueOf(str);
        int index = -1;
        if (S.contains("e")) {
            index = S.indexOf("e");
        }
        if (S.contains("E")) {
            index = S.indexOf("E");
        }
        if (index > 0 && index < S.length() - 1) {
            String left = S.substring(0, index);
            String right = S.substring(index + 1);
            if (left.contains(".") && isLegalXiaoshu(left) && isLegalZhengshu(right)) {
                return true;
            } else if (isLegalZhengshu(left) && isLegalZhengshu(right)) {
                return true;
            }
        } else if (index < 0) {
            if(S.contains(".") && isLegalXiaoshu(S)){
                return true;
            }
            if (isLegalZhengshu(S)){
                return true;
            }
        }
        return false;
    }

    public static boolean isLegalXiaoshu(String str) {
        int index = str.indexOf(".");
        if (index > 0 && index < str.length() - 1) {
            String Z = str.substring(0, index);
            String X = str.substring(index + 1);
            String regex = "^[0-9]+$";
            if (isLegalZhengshu(Z) && X.matches(regex)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLegalZhengshu(String str) {
        String regex = "^[0-9]+$";
        if (str.startsWith("+") || str.startsWith("-")) {
            str = str.substring(1);
        }
        if (str.length() > 1) {
            if(str.matches(regex) && !str.startsWith("0")){
                return true;
            }

        } else {
            if(str.matches(regex) || str.equals("")){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] chars = {'-', '1', 'E','-','1','6'};
        String q = "-012.55";
        System.out.println(isNumeric(chars));
    }
}
