//one dimentional array
public class testarray {

	public static void main(String[] args) {
		double[]mylist= {1.9,2.6,3.5,8.6};
		//print array element
		for (int i=0;i<mylist.length;i++) {
			System.out.print(mylist[i]+" ");
		}
		//summing of all element
double total = 0;
for (int i=0;i<mylist.length;i++) {
	total+=mylist[i];
}
System.out.print("\n"+"Total is "+total);
}
}



