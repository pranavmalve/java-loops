//multiple dimentional array
public class multiplearray {

	public static void main(String[] args) {
	String[][] cartoons ={
		{"pokemon","shinchan","johny test","courage the coward boy"},
		{"doremon","roll n.o 21","chota bheem"},
		{"mighty raju","Ben 10","power rangers"},
		{"jungle book","dora the explorer","STD"}};
	for(int i =0;i<cartoons.length;i++) {
		System.out.print(cartoons[i][0] + ":");
		for(int j =1;i<cartoons[i].length;j++) {
			System.out.print(cartoons[i][j]+":");
		}
	}
	}
}