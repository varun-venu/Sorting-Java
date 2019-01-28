public class SelectionSort
{
	public void sort(int[] arr)
	{
		int i,j,min_index,temp,n=arr.length;
		for(i=0;i<n-1;i++)
		{
			min_index=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
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
		SelectionSort s=new SelectionSort();
		System.out.println("Before Sorting");
		s.printArray(arr);
		System.out.println("After Sorting");
		s.sort(arr);
		s.printArray(arr);
	}
}