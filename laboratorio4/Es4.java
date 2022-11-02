package laboratorio4;

import java.util.Scanner;

public class Es4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int capacity, fill = 0, objects = 0, maxWeight = 0, minWeight, avgWeight = 0;
		do {
			capacity = input.nextInt();
		} while (capacity < 1);
		minWeight = capacity;
		while (fill < capacity) {
			int objWeight = input.nextInt();
			if (fill + objWeight > capacity || objWeight == 0) {
				break;
			} else {
				objects++;
				fill += objWeight;
				if (objWeight > maxWeight) {
					maxWeight = objWeight;
				}
				if (objWeight < minWeight) {
					minWeight = objWeight;
				}
				avgWeight += objWeight;
			}
		}
		input.close();

		avgWeight /= objects;

		System.out.println("capacità " + capacity);
		System.out.println("numero " + objects);
		System.out.println("peso " + fill);
		System.out.println("max " + maxWeight);
		System.out.println("min " + minWeight);
		System.out.println("avg " + avgWeight);

	}
}
