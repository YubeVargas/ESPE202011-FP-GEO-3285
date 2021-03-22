/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searchiing;

/**
 *
 * @author David V
 */
class BinarySearch {

    public static int binarySearch(int[] value, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (value[mid] == x) {
                return mid;
            }
            if (value[mid] > x) {
                return binarySearch(value, left, mid - 1, x);
            }
            return binarySearch(value, mid + 1, right, x);
        }
        return -1;
    }
    
}
