package offer_train;

import java.util.ArrayList;
import java.util.List;

/**
 * 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。HF作为牛客的资深元老,自然也准备了一些小游戏。
 * 其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....
 * 这样下去....直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
 * 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 */
public class train_46 {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0 && m == 0) {
            return -1;
        }
        // 初始化人数
        List<Integer> start = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            start.add(i);
        }
        //从下标为K开始计数
        int k = 0;
        while (start.size() > 1) {
//            System.out.println(start);
            //第m人的索引位置
            k = (k + m) % (start.size()) - 1;
            // 判断是否到队尾  到队尾时候k=-1
            if (k < 0) {
//                System.out.println(start.get(start.size() - 1));
                start.remove(start.size() - 1);
                k = 0;
            } else {
//                System.out.println(start.get(k));
                start.remove(k);
            }
        }
        return start.get(0);
    }

    public static void main(String[] args) {
        train_46 train_46 = new train_46();
        System.out.println(train_46.LastRemaining_Solution(17, 5));
    }
}
