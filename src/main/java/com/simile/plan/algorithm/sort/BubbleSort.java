package com.simile.plan.algorithm.sort;

import java.util.logging.Logger;

/**
 * 冒泡排序
 * 先将第一个位置的数和它后面的数据进行对比，比较完第一轮，确定了第一个位置的数
 * 再处理第二个位置，一直到最后一个位置
 * 像冒着的泡泡，先第一个，再第二个...的浮出水面
 * Created by yitao on 2019/1/10.
 */
public class BubbleSort implements Sortable {
    private static final Logger logger = Logger.getLogger(BubbleSort.class.getName());

    @Override
    public int[] sortDesc(int[] array) {
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
        logger.info("有效比较次数/总比较次数/数组大小=" + count + "/" + total + "/" + array.length);
        return array;
    }

    @Override
    public int[] sortAsc(int[] array) {
        int count = 0;
        int total = 0;
        for (int n = 0; n < array.length; n++) {
            for (int m = n + 1; m < array.length; m++) {
                if (array[m] < array[n]) {
                    //如果后一个数值比前一个数值大，则交换位置
                    int t = array[n];
                    array[n] = array[m];
                    array[m] = t;
                    count++;
                }
                total++;
            }
        }
        logger.info("有效比较次数/总比较次数/数组大小=" + count + "/" + total + "/" + array.length);
        return array;
    }

}
