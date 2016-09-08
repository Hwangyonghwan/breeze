
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 3 ,83, 75, 33, 92, 34};
		
		int temp;
		
		for(int i=0; i < arr.length; ++i)
			for(int j=0; j < arr.length -1 -i; ++j)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				

			}
		
		for(int k =0; k < arr.length; ++k)
			System.out.print(arr[k] + " ");
		System.out.println("");
	}

}
