
/**
 * Write a description of class testRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testRunner
{
    public static void main(String args[])
    {
        int[] a = new int[]{0,0,0,0,0};
        int[] b = new int[]{-1,0,0,0,0,0,1};
        test c = new test();
        System.out.println(c.findMedianSortedArrays(a,b));
    }
}
