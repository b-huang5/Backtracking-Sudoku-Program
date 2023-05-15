import java.util.*;
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int m_count = 0;
        int n_count = 0;
        int len = (m + n) / 2;
        int[] median = new int[len + 1];
        if((m + n) % 2 == 0) {
            for(int i = 0; i < len + 1; i++) {
                if(m_count == m && n_count != n) {
                    median[i] = nums2[n_count];
                    n_count++;
                }
                else if(n_count == n && m_count != m) {
                    median[i] = nums1[m_count];
                    m_count++;
                }
                else if (n_count == n && m_count == m) {
                    return (median[len] + median[len - 1]) / 2.0;
                }
                else if(nums1[m_count] > nums2[n_count]) {
                    median[i] = nums2[n_count];
                    n_count++;
                }
                else if(nums1[m_count] < nums2[n_count]) {
                    System.out.println(median[i]);
                    System.out.println(nums1[m_count]);
                    median[i] = nums1[m_count];
                    m_count++;
                }
                else {
                    median[i] = nums1[m_count];
                    m_count++;
                }
            }
            return (median[len] + median[len - 1]) / 2.0;
        }
        for(int i = 0; i < len + 1; i++) {
            if(m_count == m && n_count != n) {
                median[i] = nums2[n_count];
                n_count++;
            }
            else if(n_count == n && m_count != m) {
                median[i] = nums1[m_count];
                m_count++;
            }
            else if (n_count == n && m_count == m) {
                return median[len];
            }
            else if(nums1[m_count] > nums2[n_count]) {
                median[i] = nums2[n_count];
                n_count++;
            }
            else if(nums1[m_count] < nums2[n_count]) {
                median[i] = nums1[m_count];
                m_count++;
            }
            else {
                median[i] = nums1[m_count];
                m_count++;
            }
        }
        return median[len];
    }
}

