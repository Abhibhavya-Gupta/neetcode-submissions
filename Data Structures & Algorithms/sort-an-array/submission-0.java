class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
}        

    private void quickSort(int[] arr, int low, int high) {
        if(low>=high)
        {
            return;
        }
        int i=low-1;
        int j=low;
        int pivot=high;

        pivot = partition(arr,i,j,pivot); //re-arrange elem around pivot

        quickSort(arr,low,pivot-1);

        quickSort(arr,pivot+1,high);

    }

    private int partition(int[] arr, int i, int j, int pivot) {

        while(j<pivot)
        {
            while(arr[j]>arr[pivot] && j<pivot)
            {
                j++;
            }
            if(j==pivot) break;
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
       //i+1 swap with pivot
        int temp=arr[i+1];
        arr[i+1]=arr[pivot];
        arr[pivot]=temp;

        pivot=i+1;
        return pivot;
    }

