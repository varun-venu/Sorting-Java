public class MergeSort
{
	public void sort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			sort(arr,low,mid);
			sort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	public void merge(int[] arr,int low,int mid,int high)
	{
		int[] left=new int[mid-low+1];
		int[] right=new int[high-mid];
		for(int i=0;i<left.length;i++)
		{
			left[i]=arr[low+i];
		}
		for(int j=0;j<right.length;j++)
		{
			right[j]=arr[mid+1+j];
		}
		int i=0,j=0,k=low;
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else
			{
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length)
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			arr[k]=right[j];
			j++;
			k++;
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
		MergeSort m=new MergeSort();
		System.out.println("Before Sorting");
		m.printArray(arr);
		System.out.println("After Sorting");
		m.sort(arr,0,arr.length-1);
		m.printArray(arr);
	}
}