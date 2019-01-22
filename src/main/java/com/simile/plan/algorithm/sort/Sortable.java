package com.simile.plan.algorithm.sort;

/**
 * 可排序的
 * Created by yitao on 2019/1/10.
 */
public interface Sortable {
    int SORT_DIRECTION_ASC = 0;
    int SORT_DIRECTION_DESC = 1;

    int[] sortDesc(int[] array);

    int[] sortAsc(int[] array);

}
