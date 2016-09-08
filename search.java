import java.util.Scanner;
public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int s_num;
		Scanner in = new Scanner(System.in);
		
		s_num = in.nextInt();
		
		binary_Search(s_num);


	}
	public static int binary_Search(int num){
		
		int[] arr = new int[1000];
		
		for(int i=0; i < 1000; ++i)
			arr[i] = i+1;
			
		
		int first = 0;
		int last = arr.length;
		int middle = (first + last) / 2;
		
		while(true)
		{
			middle = (first + last) / 2;

			if(num == arr[middle])
				break;
			else if(num > arr[middle])
				first = middle;
			else if(num < arr[middle])
				last = middle;
		}
		
		System.out.println(middle);
		
		
		return middle;
	}

}
