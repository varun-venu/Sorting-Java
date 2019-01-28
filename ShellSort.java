public class ShellSort
{
	public void sort(int[] arr)
	{
		int i,j,gap,temp,n=arr.length;
		for(gap=n/2;gap>0;gap/=2)
		{
			for(i=gap;i<n;i++)
			{
				temp=arr[i];
				
				for(j=i;j>=gap && arr[j-gap]>temp;j-=gap)
				{
					arr[j]=arr[j-gap];
				}
				arr[j]=temp;
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
		ShellSort s=new ShellSort();
		System.out.println("Before Sorting");
		s.printArray(arr);
		System.out.println("After Sorting");
		s.sort(arr);
		s.printArray(arr);
	}
}