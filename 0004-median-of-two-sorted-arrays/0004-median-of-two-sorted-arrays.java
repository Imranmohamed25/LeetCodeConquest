class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            al.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            al.add(nums2[i]);
        }
        Collections.sort(al);

        int start = 0;
        int end = al.size()-1;
        int mid = (start + end)/2;

        if(al.size()%2 != 0){
            return  al.get(mid);
        }
        else if(al.size()%2 == 0){
            double result = ((double)al.get(mid) + al.get(mid + 1))/2;
            System.out.println(result);
            return result;
        }

        return 0;
    }
}