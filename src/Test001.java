import java.util.ArrayList;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array
		int[] arr = new int[5];
		arr[0]=5;
		arr[1]=10;
		arr[2]=15;
		arr[3]=20;
		arr[4]=30;		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		String[] strarr = {"hari","giri","siri","tony","jhon","steve"};
		for(int j=0;j<strarr.length;j++)
		{
			System.out.println(strarr[j]);
		}
		//ArrayList 
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		list.add(20);
		System.out.println(list.indexOf(10));
		System.out.println(list.get(2));
		//String 
		String str="I am hariprasad rao guntreddi";
		System.out.println(str.length());
		System.out.println(str.charAt(10));
		System.out.println(str.concat("end"));
		System.out.println(str.toUpperCase());
		String[] splitstring= str.split(" ");
		System.out.println(splitstring[0]);
		System.out.println(splitstring[1]);
		System.out.println(splitstring[2]);
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
	}

}
