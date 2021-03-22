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
class LinearSearch {

    static int search(int[] arrangement, int x) {
        int n = arrangement.length;
        for (int i = 0; i < n; i++) {
            if (arrangement[i] == x) {
                return i;
            }
        }
        return -1;
    }
    
}
