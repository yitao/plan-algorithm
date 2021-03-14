package com.simile.plan.algorithm.sort;

/**
 * Created by yitao on 2021/03/14.
 */
public class Nim {

    /**
     * 先手取石头的玩家是否可以赢得这个游戏
     * 2021-03-14分析：
     * 先手必赢规则：
     * 1）其中一堆石头数量为0。0,N(N为任意数)
     * 2）两堆石头数量一样。N,N(N为任意数)
     * 3）一堆石头数量为1，另外一堆石头的数量大于2。1,N(N>2)
     * 4）两堆石头数量相差1。N,M(|M-N|=1)
     * 5）一堆石头数量为2，另外一堆石头数量不等于1。2,N(N!=1)
     * --------------------
     *
     * @param n
     * @param m
     * @return
     */
    public boolean nim(int n, int m) {
        int tmp = n;
        if (n > m) {
            //使得 n <= m
            n = m;
            m = tmp;
        }
        if (n == 0 || m == 0) {
            return true;
        }
        if (n == m) {
            return true;
        }
        if (n == 1 && m > 2) {
            return true;
        }
        if (m - n == 1) {
            return true;
        }
        if (n == 2 && m != 1) {
            return true;
        }
        return false;
    }
}
