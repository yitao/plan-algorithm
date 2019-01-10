package com.simile.plan.algorithm.sort;

/**
 * Created by yitao on 2019/1/10.
 */
public class SortRunner {

    public static void main(String[] args) {
        int[] t1 = SortTeacher.createRandom(100);
//        SortTeacher.print(t1, 50);
        System.out.println("--------------------");
        Sortable sortable = new BubbleSort();
        long st = System.nanoTime();
        sortable.sort(t1);
        long et = System.nanoTime();
//        SortTeacher.print(t1, 50);
        System.out.println("--------------------");
        boolean res = SortTeacher.check(t1);
        System.out.println("排序结果：" + (res ? "成功" : "失败") + "，耗时：" + (et - st));
    }
}
