import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int eleman = 0;
		int min = eleman;
		Scanner inp = new Scanner(System.in);
		System.out.print("Dizideki Eleman Sayisini Giriniz: ");
		int boyut = inp.nextInt();
		int[] dizi = new int[boyut];
		System.out.println("Dizideki Elemanlari Giriniz");
		for (int i = 0; i < boyut; i++) {		
			System.out.print(i+" - Elemani Giriniz: ");
			eleman = inp.nextInt();
			dizi[i] = eleman;
		}
		for (int i : dizi) {
			Arrays.sort(dizi);
		}
		System.out.println(Arrays.toString(dizi));
		
		

	}

}
