class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Double> list = new ArrayList<>();
        for (double i : nums) {
            list.add(i);
        }
        return find(list);
    }

    ArrayList<Double> res = new ArrayList<>();
    public double find(ArrayList<Double> list) {
        if(list.isEmpty()){
            return Collections.min(res);
        }
        for (int i = 0; i < list.size(); i++) {
            double ans = (list.get(i) + list.get(list.size() - 1)) / 2;
            res.add(ans);
            break;
        }
        list.remove(0);
        list.remove(list.size() - 1);
        return find(list);
    }
}