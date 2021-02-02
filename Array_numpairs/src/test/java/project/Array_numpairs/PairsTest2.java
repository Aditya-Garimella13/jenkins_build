package project.Array_numpairs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PairsTest2 {
	@Test
	public void Pair_present() {
		int []a= {1,2,3,4,5};
		Pairs p=new Pairs();
		assertEquals(1,p.pair_sum(a, a.length, 5));
	}
	@Test
	public void pair_not_present() {
		int []a= {1,2,3,4,5};
		Pairs p=new Pairs();
		assertEquals(-1, p.pair_sum(a, a.length, 10));
	}
	@Test
	public void pair_array_less_size() {
		int []a= {1};
		Pairs p=new Pairs();
		IllegalArgumentException ex=assertThrows(IllegalArgumentException.class,()->p.pair_sum(a,a.length,10));
		assertEquals("array should be greater than 1",ex.getMessage());
	}
	@Test
	public void Triplet_present() {
		int []a= {1,2,3,4,5};
		Pairs p=new Pairs();
		assertEquals(1,p.triplets_sum(a, a.length, 6));
	}
	@Test
	public void Triplet_not_present() {
		int []a= {1,2,3,4,5};
		Pairs p=new Pairs();
		assertEquals(0, p.triplets_sum(a, a.length, 5));
	}
	@Test
	public void triplet_array_less_size() {
		int []a= {1,2};
		Pairs p=new Pairs();
		IllegalArgumentException ex=assertThrows(IllegalArgumentException.class,()->p.triplets_sum(a,a.length,10));
		assertEquals("array should be greater than 2",ex.getMessage());
	}

}
