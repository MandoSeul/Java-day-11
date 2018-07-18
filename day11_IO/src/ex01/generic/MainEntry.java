package ex01.generic;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx();
		String[] str = {"abc", "seul","teacher"};
		t1.set(str);
		t1.print();
		System.out.println("---------------구별---------------");
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = {1,67,5,3,4,6,3};
		t2.set(num); t2.print();
		System.out.println("---------------구별---------------");
		GenericEx<Double> t3 = new GenericEx();
		Double[] doub = {1.45,67.3,5.6,3.22,4.16,6.4,3.7};
		t3.set(doub); t3.print();
	}
}
