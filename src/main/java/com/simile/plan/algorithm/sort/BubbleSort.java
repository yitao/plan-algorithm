package com.simile.plan.algorithm.sort;

/**
 * 冒泡排序
 * Created by yitao on 2019/1/10.
 */
public class BubbleSort implements Sortable {

    public int[] sort(int[] array) {
        int count = 0;
        int total = 0;
        for (int n = 0; n < array.length; n++) {
            for (int m = n + 1; m < array.length; m++) {
                if (array[m] > array[n]) {
                    //如果后一个数值比前一个数值大，则交换位置
                    int t = array[n];
                    array[n] = array[m];
                    array[m] = t;
                    count++;
                }
                total++;
            }
        }
        System.out.println("有效比较次数/总比较次数/数组大小=" + count + "/" + total + "/" + array.length);
        return array;
    }

}
