package com.simile.plan.algorithm.sort;

import java.util.Random;

/**
 * 排序的老师
 * 创建题目
 * 检查题目
 * Created by yitao on 2019/1/10.
 */
public class SortTeacher {

    /**
     * 创建随机的整数数组
     *
     * @param size 数组大小
     * @return
     */
    public static int[] createRandom(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        for (int i = 0; i < size; i++) {
            int t = array[i];
            int r = Math.abs(new Random().nextInt() % size);
            array[i] = array[r];
            array[r] = t;
        }
        return array;
    }

    /**
     * 打印数组
     *
     * @param array     数组
     * @param lineLimit 每行数字打印数量上限
     */
    public static void print(int[] array, int lineLimit) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i != 0 && (i + 1) % lineLimit == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    /**
     * 检查数组是否是降序的
     *
     * @param array 数组
     * @return false 数组是无序的
     * true 数组是有序的
     */
    public static boolean checkDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }


    /**
     * 检查数组是否是升序的
     *
     * @param array 数组
     * @return false 数组是无序的
     * true 数组是有序的
     */
    public static boolean checkAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
