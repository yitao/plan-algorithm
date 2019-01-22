package com.simile.plan.algorithm.sort;

/**
 * 快速排序
 * Created by yitao on 2019/1/10.
 */
public class QuickSort implements Sortable {

    public int[] sortDesc(int[] array) {
        quickSort(array, 0, array.length - 1, SORT_DIRECTION_DESC);
        return array;
    }

    public int[] sortAsc(int[] array) {
        quickSort(array, 0, array.length - 1, SORT_DIRECTION_ASC);
        return array;
    }

    public void quickSort2(int[] array, int left, int right, int direct) {
        if (left >= right) {
            return;
        }
        int m = array[right];
        int l = left, r = right;
        while (l < r) {
            if (direct == SORT_DIRECTION_DESC) {
                while (l < r && array[l] >= m) {
                    ++l;
                }
                array[r] = array[l];
                while (l < r && array[r] <= m) {
                    --r;
                }
                array[l] = array[r];
            } else {
                while (l < r && array[l] <= m) {
                    ++l;
                }
                array[r] = array[l];
                while (l < r && array[r] >= m) {
                    --r;
                }
                array[l] = array[r];
            }
        }
        array[r] = m;
        quickSort2(array, left, r - 1, direct);
        quickSort2(array, r + 1, right, direct);
    }

    public void quickSort(int[] array, int left, int right, int direct) {
        if (left >= right) {
            return;
        }
        int m = array[left];
        int l = left, r = right;
        while (l < r) {
            if (direct == SORT_DIRECTION_DESC) {
                while (l < r && array[r] <= m) {
                    --r;
                }
                array[l] = array[r];
                while (l < r && array[l] >= m) {
                    ++l;
                }
                array[r] = array[l];
            } else {
                while (l < r && array[r] >= m) {
                    --r;
                }
                array[l] = array[r];
                while (l < r && array[l] <= m) {
                    ++l;
                }
                array[r] = array[l];
            }
        }
        array[l] = m;
        quickSort(array, left, l - 1, direct);
        quickSort(array, l + 1, right, direct);
    }

}
