
public class NamePattern {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<100;j++) {
				if((i == 0 && j < 5) || j == 2 || (i == 9 && j < 5)  ) {
					System.out.print("*"); // I
				}
				
				else if( j == 7 || j- i == 7 && j > 6  || j == 16  ) {
					System.out.print("*");  // N
				} 
				else if (j == 18 || (i == 0 && j >= 18 && j<24  || i== 5 && j >= 18 && j<24  || i==9 && j >= 18 && j<24) ) {
					System.out.print("*"); //E
				}
				else if( j == 25 || j == 30 || i == 9 && j > 24 && j < 31) {
					System.out.print("*"); //U	
				}
				else if(  j == 32 || i == 0 && j > 31 && j <= 38 || j == 38 && i < 6 || i== 5 && j > 31 && j <= 38 || j-i == 33 && i>= 5) {
					System.out.print("*"); //R
				}
				else if( j == 44 || j == 50 || i == 0 && j > 44 && j < 50 || i == 9 && j > 43 && j < 50) {
					System.out.print("*"); //O
				}
				else if( j == 52 || j- i == 52 && j > 51  || j == 61  ) {
					System.out.print("*");  // N
				} 
				
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
