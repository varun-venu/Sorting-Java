public class BubbleSort
{
	public void sort(int[] arr)
	{
		int i,j,temp,n=arr.length;
		for(i=1;i<n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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
		BubbleSort b=new BubbleSort();
		System.out.println("Before Sorting");
		b.printArray(arr);
		System.out.println("After Sorting");
		b.sort(arr);
		b.printArray(arr);
	}
}