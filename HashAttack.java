public class HashAttack{
	final static String[] f = new String[]{"Aa","BB"};
	public static void main(String[] args){
		final int N = Integer.parseInt(args[0]);
		for(String i:getStrings(N))System.out.println(i);
	}
	public static String[] getStrings(int N){
		String[] foo = new String[N*N];
		for(int i = 0; i<N*N;i++){
			String s= "";
			for(int j = 0; j<N/2;j++){
				s+=f[(int)(Math.random()*2.0)];
			}
			foo[i] = s;
		}
		return foo;
	}
}