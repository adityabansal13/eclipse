package lec16;

public class Count_SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		Count_Sub(ques, "");
		System.out.println("\n" + Count_Sub(ques, ""));
		//System.out.println(count);
	}
	//static int count = 0;
	public static int Count_Sub(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int f1 = Count_Sub(ques.substring(1), ans);
		int f2 = Count_Sub(ques.substring(1), ans + ch);
		return f1+f2;
	}

}
