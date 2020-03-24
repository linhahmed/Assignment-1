import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		int i, j;
		System.out.println("Enter the Universe set(Please put , between the elements):");
		Scanner scan = new Scanner(System.in);
		String u = scan.nextLine();
		String[] ua = u.split(",");
		Arrays.sort(ua);
		for (String a : ua)
			System.out.println(a);
		System.out.println("Enter the number of subsets:");
		int num = scan.nextInt();
		scan.nextLine();
		String arr[][] = new String[num + 1][ua.length];
		for (i = 0; i < ua.length; i++) {
			arr[0][i] = ua[i];
		}
		for (String a : arr[0])
			System.out.println(a);
		String SP;
		for (i = 1; i <= num; i++) {
			if (i == 1) {
				System.out.println("Enter the 1st subset elements(Please put , between every element & another.):");
			} else if (i == 2) {
				System.out.println("Enter the 2nd subset elements(Please put , between every element & another.):");
			} else if (i == 3) {
				System.out.println("Enter the 3rd subset elements(Please put , between every element & another.):");
			} else {
				System.out.println(
						"Enter the " + i + "th subset elements(Please put , between every element & another.):");
			}
			SP = scan.nextLine();
			String[] flag = SP.split(",");
			Arrays.sort(flag);
			j = 0;
			for (int k = 0; k <= ua.length; k++) {
				if (j == flag.length)
					break;
				if (k == ua.length) {
					System.out.println("Error!! Please enter elements that exist in the Universe.");
					Arrays.fill(arr[i], null);
					i--;
					break;
				}
				if (flag[j].equals(arr[0][k])) {
					arr[i][k] = flag[j];
					j++;

				}

			}
			for (String a : arr[i])
				System.out.println(a);
		}
		for (i = 0; i < num + 1; i++) {
			for (j = 0; j < ua.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		while (true) {
			System.out.println("****************************************");
			System.out.println("Enter The number of the Operation you want to perform:");
			System.out.println("1- Union. ");
			System.out.println("2- Intersection. ");
			System.out.println("3- Compliment. ");
			System.out.println("4- Review a subset element.");
			int op = scan.nextInt();
			int repeat = 0;
			while (op == 1 || repeat == 1) {
				System.out.println("Enter the ordinal numbers of the 2 subsets(Universe ordinal number is 0):");
				int first = scan.nextInt();
				int second = scan.nextInt();
				if (first > num || second > num) {
					System.out.println("Error!! Please enter an ordinal number subset that exist.");
					repeat = 1;
					continue;
				}
				ArrayList<String> U = Operations.Union(arr[first], arr[second]);
				System.out.println(U);
				op = 0;
				repeat = 0;
				System.out.println("_______________________________________");
			}
			while (op == 2 || repeat == 2) {
				System.out.println("Enter the ordinal numbers of the 2 subsets(Universe ordinal number is 0):");
				int first = scan.nextInt();
				int second = scan.nextInt();
				if (first > num || second > num) {
					System.out.println("Error!! Please enter an ordinal number subset that exist.");
					repeat = 2;
					continue;
				}
				ArrayList<String> I = Operations.Intersection(arr[first], arr[second]);
				System.out.println(I);
				op = 0;
				repeat = 0;
				System.out.println("_______________________________________");
			}
			while (op == 3 || repeat == 3) {
				System.out.println("Enter the ordinal number of the subset(Universe ordinal number is 0):");
				int first = scan.nextInt();
				if (first > num) {
					System.out.println("Error!! Please enter an ordinal number subset that exist.");
					repeat = 3;
					continue;
				}
				ArrayList<String> C = Operations.Compliment(arr[0], arr[first]);
				System.out.println(C);
				op = 0;
				repeat = 0;
				System.out.println("_______________________________________");
			}
			while (op == 4 || repeat == 4) {
				System.out.println("Enter the ordinal number of the subset(Universe ordinal number is 0):");
				int first = scan.nextInt();
				if (first > num) {
					System.out.println("Error!! Please enter an ordinal number subset that exist.");
					repeat = 4;
					continue;
				}
				System.out.println(Arrays.toString(arr[first]));
				op = 0;
				repeat = 0;
				System.out.println("_______________________________________");
			}
		}

	}

}
