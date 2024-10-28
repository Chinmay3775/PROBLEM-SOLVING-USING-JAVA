class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int u=0;
        for(int i : nums){
            u^=i;
        }
        return u;
    }
};
