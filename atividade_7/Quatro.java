class Quatro{
	public static void main(String args[]){
		double compra= 309.87;
		double desconto= 12;
		
		double compraf= compra*desconto/100;
		double compraa= compra-compraf;
		System.out.println("Compra com desconto:"+compraa);
	}
}