package July_20_2022;
import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {
        int a[] = {3,2,2,3};
		int val = 3;
		
		int i =0;
		int j = a.length-1;
		
		while(i<j) {
			if(a[i]!=val) {
				i++;
			}
			
			if(a[j]==val) {
				j--;
			}
			
			if(a[i]==val && a[j]!=val && i<j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
				i++;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("i : "+i);
		System.out.println("j : "+j);
		
		int count =0;
		
		for(int k=0;k<a.length;k++) {
			
			if(a[k]==val) {
				count = k;
				break;
			}
			
		}
		
		System.out.println(count);

    }
}
