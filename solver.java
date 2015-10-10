import java.util.Scanner;


public class solver {

	int white = 0;
	int yellow = 1;
	int blue = 2;
	int orange = 3;
	int green = 4;
	int red = 5;
	
	static int r = 3;    //r = rows
	static int c= 3;	  //c = columns
	
	public static void main(String[] args){
		
		
		System.out.println("0 for white");
		System.out.println("1 for yellow");
		System.out.println("2 for blue");
		System.out.println("3 for orange");
		System.out.println("4 for green");
		System.out.println("5 for red");
		
		topSolve();
		bottomSolve();
		side1Solve();
		frontSolve();
		side2Solve();
		backSolve();
		
		while(getTop(top[0][0]) != 2){
		step1();
		}

	}
	

		
private static void topSolve() {
		
	int[][] top = new int[r][c];
	Scanner topInput = new Scanner(System.in);
	
	System.out.println("\n" + "enter the elements for the top face of the cube (middle color is blue)" + "\n" );
	
	    for(int i=0; i<r; i++){

	        for(int j=0; j<c; j++){

	            top[i][j]=topInput.nextInt();
	            System.out.print(top[i][j] + " ");
	            
	            if (i == 0 && j == 2){
	            	System.out.println("\n");
	            }
	            
	            if (i == 1 && j == 2){
	            	System.out.println("\n");
	            }
	            }
	        }
	
	return;
	}


private static void bottomSolve() {
		
	
	int[][] bottom = new int[r][c];
	Scanner bottomInput = new Scanner(System.in);
	
	System.out.println("\n\n" + "enter the elements for the bottom face of the cube (middle color is green)");
	
	    for(int i=0; i<r; i++){

	        for(int j=0; j<c; j++){

	            bottom[i][j]=bottomInput.nextInt();
	            System.out.print(bottom[i][j]  + " ");
	            
	            if (i == 0 && j == 2){
	            	System.out.println("\n");
	            }
	            
	            if (i == 1 && j == 2){
	            	System.out.println("\n");
	            }
	            }
	        }
	
	return;
	}


private static void side1Solve() {
	int[][] side1= new int[r][c];
	Scanner in = new Scanner(System.in);
	
	System.out.println("\n\n" + "enter the elements for the left side of the cube (middle color is orange)");
	
	    for(int i=0; i<r; i++){

	        for(int j=0; j<c; j++){

	            side1[i][j]=in.nextInt();
	            System.out.print(side1[i][j]  + " ");
	            if (i == 0 && j == 2){
	            	System.out.println("\n");
	            }
	            
	            if (i == 1 && j == 2){
	            	System.out.println("\n");
	            }
	            }
	        }
	
	return;
	}


private static void frontSolve() {
	int[][] front= new int[r][c];
	Scanner in = new Scanner(System.in);
	
	System.out.println("\n\n" + "enter the elements for the front side of the cube (middle color is white)");
	
	    for(int i=0; i<r; i++){										//r = rows = 3 

	        for(int j=0; j<c; j++){									//c = columns = 3

	        	front[i][j]=in.nextInt();							//takes user input row by row 
	            System.out.print(front[i][j] + " ");				//prints user input row by row 
	            if (i == 0 && j == 2){								//
	            	System.out.println("\n");						//spacing for the printing row by row
	            }													//
	            													//
	            if (i == 1 && j == 2){								//
	            	System.out.println("\n");						//
	            }													//
	            }
	        }
	    

	
	return;
	}


private static void side2Solve() {
	int[][] side2= new int[r][c];
	Scanner in = new Scanner(System.in);
	
	System.out.println("\n\n" + "enter the elements for the right side of the cube (middle color is red)");
	
	    for(int i=0; i<r; i++){

	        for(int j=0; j<c; j++){

	            side2[i][j]=in.nextInt();
	            System.out.print(side2[i][j]  + " ");
	            if (i == 0 && j == 2){
	            	System.out.println("\n");
	            }
	            
	            if (i == 1 && j == 2){
	            	System.out.println("\n");
	            }
	            }
	        }
	
	return;
	}


private static void backSolve() {
	int[][] back= new int[r][c];
	Scanner in = new Scanner(System.in);
	
	System.out.println("\n\n" + "enter the elements for the back side of the cube (middle color is yellow)");
	
	    for(int i=0; i<r; i++){

	        for(int j=0; j<c; j++){

	            back[i][j]=in.nextInt();
	            System.out.print(back[i][j]  + " ");
	            if (i == 0 && j == 2){
	            	System.out.println("\n");
	            }
	            
	            if (i == 1 && j == 2){
	            	System.out.println("\n");
	            }
	            }
	        }
	
	return;
	}

public void setTop(int[][]top){
	this.top[][] = top[][];

}

public static void getTop(int[][]top){
	return;

}


private static void step1() {
int stepone = 0;



switch (stepone){
case 1: System.out.println("rotate column 3 down, rotate row 3 left, rotate column 3 up.");
		break;
case 2: System.out.println("rotate bottom row left, rotate right column down, rotate bottom row right, rotate right column up.");
		break;
case 3: System.out.println("rotate right column down, rotate bottom row right, rotate right column up, rotate bottom row, rotate bottom row, rotate right column down, rotate bottom row left, rotate right column up.");
		break;
case 4: System.out.println("rotate front face clockwise, rotate bottom row right, rotate front face counter-clockwise, rotate bottom row right, rotate bottom row right, rotate right column down, rotate bottom row right, rotate right column up.");
		break;
case 5: System.out.println("rotate right column down, rotate bottom row left, rotate right column up, rotate bottom row right, rotate right column down, rotate bottom row left, rotate right column up.");
		break;
default: System.out.println("step 1 complete.");
		break;
}
return;

}


private static void step2() {
int stepone = 0;



switch (stepone){
case 1: System.out.println("rotate middle column down, rotate bottom row left, rotate bottom row left, rotate middle column up.");
		break;
case 2: System.out.println("rotate bottom row left, rotate middle column down, rotate bottom row right, rotate middle column up.");
		break;
case 3: System.out.println("rotate middle row right, rotate front face clockwise, rotate middle row left, rotate front face counter-clockwise.");
		break;
case 4: System.out.println("rotate middle row right, rotate front face counter-clockwise, rotate middle row left, rotate middle row left, rotate front row clockwise.");
		break;
case 5: System.out.println("rotate middle column down, rotate bottom row left, rotate bottom row left, rotate middle column up, rotate bottom row left, rotate middle column down, rotate bottom row right, rotate middle column up.");
		break;
default: System.out.println("step 1 complete.");
		break;
}
return;

}

}
