package com.ipartek.formacion;

public class OrdenarArray {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] num= {5,8,1,9,6,7,3,4,2};
		int rand = 0;
		int cont = 0;
		int[] num = new int[9];
		for (int i = 0; i < num.length; i++) {
			do {
				cont = 0;
				rand = (int) (Math.random() * num.length + 1);
				for (int j = 0; j < i + 1; j++) {

					if (rand == num[j])
						cont++;
				}
			} while (cont != 0);
			num[i] = rand;

		}
		int seg;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[j] > num[i]) {
					seg = num[i];
					num[i] = num[j];
					num[j] = seg;
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}*/
	
//	public static void main(String[] args) throws Exception {
//		int[] b= {5,3,4,5,6,7,1,6};
//		int[] x=arrayOrd(b);
//		for (int i = 0; i < x.length; i++) {
//			System.out.println(x[i]);
//		}
//	}
	/**
	 * Ordena el array de mayor a menor
	 * @param a es el array que se le pasa
	 * @return devuelve e array ordenado
	 * @throws Exception salta si el array que recibe es nulo
	 */
	public static int[] arrayOrd(int[] a) throws Exception {
		int seg;
		if(a==null)
			throw new Exception("El array es nulo");
		else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if (a[j] > a[i]) {
						seg = a[i];
						a[i] = a[j];
						a[j] = seg;
					}
				}
			}
		}

		return a;
		
	}

}
