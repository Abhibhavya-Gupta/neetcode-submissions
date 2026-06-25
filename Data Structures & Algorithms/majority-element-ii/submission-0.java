class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int r=n%3!=0?(n/3):(n/3);
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>r) ans.add(entry.getKey());
        }
        //hashap => num:freq
        //O(n) space 

        //for O(1) => Moore's algo
        return ans;

    }
}