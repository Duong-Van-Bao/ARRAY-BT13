import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int a[] = nhapMang(scan, n);
        xuatMang(a);
        inSLPTGiongNhau(a);
	}

	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}	
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập a > 0 và n phải là chẵn ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <  2 || n % 2 != 0);
		return n;
	}
	
	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
	
	public static int[] demPhanTu(int a[]) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = 0;
			for(int j = 0;  j < a.length; j++) {
				if(a[i] == a[j]) {
					if(j < i) {
						break;
					} else {
						b[i]++;
					}
				}
			}
		}
		return b;
	}
	
	public static void inSLPTGiongNhau(int a[]) {
		int b[] = demPhanTu(a);
		for(int i = 0; i < b.length; i++) {
			if(b[i] != 0) {
				System.out.print(a[i] + "[" + b[i] + "]" + "\t");
			}
		}
	}
}
