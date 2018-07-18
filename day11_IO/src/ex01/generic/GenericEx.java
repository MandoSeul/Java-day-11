package ex01.generic;

public class GenericEx<T> {
	T[] v; // ¸â¹öº¯¼ö
	public void set(T[] v){//¸â¹öÇÔ¼ö
		this.v = v;
	}
	public void print(){
		for(T item : v){
			System.out.println(item);
		}
	}
}
