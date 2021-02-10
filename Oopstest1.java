package Test;
import java.util.Scanner;
public class Oopstest1 {
		public static void main(String[] args) {

			int a;
			int child=0;
			int adult = 0;
			int senior=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("how many age elements do you need :");
			a=sc.nextInt();
			int arr[] = new int[a];
			System.out.println("Age Persons:");
			for(int i=0;i<a;i++) {
				arr[i]=sc.nextInt();

			}
			for(int j=0;j<arr.length;j++) {

				if(arr[j]<=18) {
					
					child++;

				}

				else if(arr[j]>18 && arr[j]<=54) {
					
					adult++;

				}
				else {	
					
					senior++;
				}

			}
			System.out.println("Childrens:"+child);
			System.out.println("Adults:"+adult);
			System.out.println("seniorCitizens:"+senior);

		}

	}


