class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Always run binary search on the smaller array to prevent out of bounds
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int min = 0;
        int max = m; // Range is 0 to m (we can take anywhere from 0 to all elements of nums1)
        
        // +1 ensures the left side has the extra element if the total length is odd
        int halfLen = (m + n + 1) / 2;

        while (min <= max) {
            int splitA = (min + max) / 2;
            int splitB = halfLen - splitA;

            // Handle edge cases using MIN/MAX values if a partition takes 0 elements
            int maxLeftA = (splitA == 0) ? Integer.MIN_VALUE : nums1[splitA - 1];
            int minRightA = (splitA == m) ? Integer.MAX_VALUE : nums1[splitA];
            
            int maxLeftB = (splitB == 0) ? Integer.MIN_VALUE : nums2[splitB - 1];
            int minRightB = (splitB == n) ? Integer.MAX_VALUE : nums2[splitB];

            // Cross-check: Is the partition valid?
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                // We found the correct split
                if ((m + n) % 2 == 0) {
                    // Even total: average of the two middle numbers
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
                } else {
                    // Odd total: max of the left side (since left side has the extra element)
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                // A's left side is too big. We must take fewer elements from A.
                max = splitA - 1;
            } else {
                // A's left side is too small. We must take more elements from A.
                min = splitA + 1;
            }
        }
        
        return 0.0; 
    }
}
