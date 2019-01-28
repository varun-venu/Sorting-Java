public class QuickSort
{
	public int partition(int[] arr,int low,int high)
	{
		int pivot=arr[(low+high)/2],temp;
		while(low<=high)
		{
			while(arr[low]<pivot)
			{
				low++;
			}
			while(arr[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		return low;
	}
	public void sort(int[] arr,int low,int high)
	{
		int pi=partition(arr,low,high);
		if(low<pi-1)
		{
			sort(arr,low,pi-1);
		}
		if(pi<high)
		{
			sort(arr,pi,high);
		}
	}
	public void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
	public static void main(String[] args) {
		int arr[]={5,3,7,1,9,4,6,8,2,10};
		QuickSort q=new QuickSort();
		System.out.println("Before Sorting");
		q.printArray(arr);
		System.out.println("After Sorting");
		q.sort(arr,0,arr.length-1);
		q.printArray(arr);
	}
}