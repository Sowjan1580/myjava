package myarray;

public class Search {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int s=10,c=0;
		for(int i=0;i<a.length;i++) {
			if(s==a[i]) {
				System.out.println("found");
				c=1;
			}
		}
		if(c==0) {
			System.out.println("not found");
		}
	}

}
