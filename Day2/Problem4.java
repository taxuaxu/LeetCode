
public class Problem4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;
        int totalLength = length1 + length2;

        int [] mergedArray = new int[length1+length2];

        int i = 0; 
        int j = 0; 
        int k = 0;

        while (i < length1 && j < length2) {
            if(nums1[i] <= nums2[j]){
                mergedArray[k++]=nums1[i++];
            }
            else{
                mergedArray[k++]=nums2[j++];
            }
        }

        while (i < length1) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < length2) {
            mergedArray[k++] = nums2[j++];
        }

    
        if (totalLength % 2 == 1) {
            return mergedArray[totalLength / 2];
        } else {
            int mid1 = mergedArray[totalLength / 2 - 1];
            int mid2 = mergedArray[totalLength / 2];
            return (mid1 + mid2) / 2.0;
        }
    }

}
