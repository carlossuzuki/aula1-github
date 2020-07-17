package application;

import java.util.Scanner;

import entities.EmployeeList;

public class ProgramMatriz2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j);
					int left = j - 1;
					if (left >= 0) {
						System.out.println("Left: " + mat[i][left]);
					}
					int up = i - 1;
					if (up >= 0) {
						System.out.println("Up: " + mat[up][j]);
					}
					int right = j + 1;
					if (right <= n) {
						System.out.println("Right: " + mat[i][right]);
					}
					int down = i + 1;
					if (down <= m) {
						System.out.println("Down: " + mat[down][j]);
					}
				}
			}
		}

		sc.close();
	}

}
