/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target) {
    int i,j;
    for(i=0;i<numsSize;i++)
    {
        for(j=i+1;j<numsSize;j++)
        {
            if(target==nums[i]+nums[j])
            {
                break;    
            }
        }
        if(j != numsSize)
            break;
    }
    
    int *result=(int *)malloc(sizeof(int)*2);
    result[0]=i;
    result[1]=j;
    return result;
}