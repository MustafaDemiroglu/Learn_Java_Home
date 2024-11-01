// Compares this object with the specified object for order. 
// Returns a negative integer, zero, or a positive integer 
// as this object is less than, equal to, or greater than 
// the specified object.

// extends war hier nur nötig, damit 
// die Sort Methode sich nicht beschwert :)

// und das ganze Interface war nicht nötig, 
// es sieht genauso aus, wie das Echte ,
// aber was macht man nicht alles zum erklären :D

public interface Comparable<T> extends java.lang.Comparable<T>{
	public int compareTo(T o);
}
