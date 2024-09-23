package sample;

public class Main {

	public static void main(String[] args) {
		int[][] sampleMatrix = {

				{1,2,3,4},
				{5,6,7,9},
				{9,10,10,12}

		};

		for(int i=0; i < sampleMatrix.length; i++) {
			for(int j=0; j<sampleMatrix[i].length;j++) {
				System.out.print(sampleMatrix[i][j]+" ");
			}
			System.out.println();

		}




	}

}