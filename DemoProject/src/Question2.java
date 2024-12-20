import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// input
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int last = obj.nextInt();
		int iter = 800;
		int step = 2;
		List<Integer> values = new ArrayList<Integer>();

		// process - section 1
		while (iter <= last) {
			values.add(iter);
			iter += step;
			step += 2;
		}
		for (int i = 0; i < values.size(); i++) {
			System.out.print(values.get(i) + " ");
		}

		// process section- 2
		List<Integer> sumarr = new ArrayList<Integer>();

		for (int i = 0; i < values.size(); i++) {
			int tempnum = values.get(i);
			int sum = 0;
			while (tempnum > 0) {
				int dig = tempnum % 10;
				sum += dig;
				tempnum /= 10;
			}
			sumarr.add(sum);
		}
		System.out.print("\n");
		for (int i = 0; i < sumarr.size(); i++) {
			System.out.print(sumarr.get(i) + " ");
		}

		// process section -3
		int count = 0;
		for (int i = 0; i < sumarr.size(); i++) {
			if ((sumarr.get(i) / 10) == 1) {
				count += 1;
			}
		}
		System.out.println("\n");
		System.out.println("Count Value : " + count);
	}
}
