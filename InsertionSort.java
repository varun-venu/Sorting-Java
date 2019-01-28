public class InsertionSort
{
	public void sort(int[] arr)
	{
		int i,j,temp,n=arr.length;
		for(i=1;i<n;i++)
		{
			temp=arr[i];
			
			for(j=i-1;j>=0 && arr[j]>temp;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
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
		InsertionSort i=new InsertionSort();
		System.out.println("Before Sorting");
		i.printArray(arr);
		System.out.println("After Sorting");
		i.sort(arr);
		i.printArray(arr);
	}
}