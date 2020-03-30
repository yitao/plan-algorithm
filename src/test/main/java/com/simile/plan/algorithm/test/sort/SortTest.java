package com.simile.plan.algorithm.test.sort;

import com.simile.plan.algorithm.sort.QuickSort;
import com.simile.plan.algorithm.sort.SortTeacher;
import com.simile.plan.algorithm.sort.Sortable;
import org.junit.Test;

/**
 * 排序测试
 * created by yitao on 2020/03/30
 */
public class SortTest {

    @Test
    public void testSort(){
        int[] t1 = SortTeacher.createRandom(10);
        SortTeacher.print(t1, 50);
        System.out.println("--------------------");
        Sortable sortable = new QuickSort();
        long st = System.nanoTime();
        sortable.sortAsc(t1);
        long et = System.nanoTime();
        SortTeacher.print(t1, 50);
        System.out.println("--------------------");
        boolean res = SortTeacher.checkAsc(t1);
        System.out.println("排序结果：" + (res ? "成功" : "失败") + "，耗时：" + (et - st));
    }

}
