// viết ct liệt kê hoán vị của 1,2,..,n
package bt20;
import java.util.Scanner;
public class main {
	public static int nhap() {
		Scanner input = new Scanner(System.in);
		boolean check = false;
		int n=0;
		while(!check) {
			System.out.println("Ban phai nhap so! Hay nhap lai");
			input.nextLine();
		}
	
	return(n);
	}
public static void main(String[] args) {
	System.out.println("Nhap n");
	int n=nhap();
	int[] array  = new inf[n+2];
	int i,j,k = n - 1,temp,check = 1;
	for(i=0; i<n;i++) {
		array[i]=i+1;
	}
	System.out.println("Cac hoan vi ke la: ");
	try {
		i=n-2;
		while(check>0) {
			// in ra hoán vị
			System.out.println(" ");
			for (j=0; j<n; j++) {
				System.out.println(" " +array[j]);
			}
			for (i=n-2;i>0;i--) {
				check = 1;
				if(array[i]<array[i+1]) {
					if(i==n-2) {
						temp=array[i];
						array[i]=array[n-1];
						array[n-1]=temp;
						break;
					}
					else {
						// tim số a[k] nhỏ nhất mà >a[i] trong các số bên phải a[i]
						k=i+1;
						for(j=i+1; j<n;j++) {
							if(array[i+1]>array[j]&&array[j]>array[i])k=j;
							
						}
						// đổi chỗ a[k] và a[i]
						temp=array[i];
						array[i]=array[k];
						array[k]=temp;
						//sắp xếp lại từ a[i+1] tới a[n]
						for(j=i+1; j<n;j++) {
							for(int m=i+1;m<n;m++) {
								if(array[j]<array[j]);
								array[j]=array[m];
								array[m]=temp
							}
						}
						
					}
					break;
				}
					
				}
			else {
				check=0;
				// break;
			}
		
			//if(i==0)check=0;
			}

	
	}   catch(Exception e) {}

	}
}
