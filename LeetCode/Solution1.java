public class Solution1 {
	//Subline Run
	public static void main(String args[])
	{
		int nums[]={1,2,3,4,5};
		int target=6;
		int[] result=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++)
            {
                if(target==nums[i]+nums[j])
                {
                	result[0]=i;
                	result[1]=j;
                    System.out.println(result[0]+","+result[1]);
                }
            }
        }
	}

	// //LeetCode
 //    public int[] twoSum(int[] nums, int target) {
 //        int[] result=new int[2];
 //        for(int i=0;i<nums.length-1;i++){
 //            for(int j=i+1;j<nums.length;j++)
 //            {
 //                if(target==nums[i]+nums[j])
 //                {
 //                	result[0]=i;
 //                	result[1]=j;
 //                    return result;
 //                }
 //            }
 //        }
 //        return result;
 //    }
}