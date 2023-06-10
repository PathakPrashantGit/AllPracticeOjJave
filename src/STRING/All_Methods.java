package STRING;

public class All_Methods {
	public static void main(String[] args) 
	{
		String h ="Prashant Pathak";
		String k =" prashant";
		String l =" Great Man";
		String p ="";
		
//		String a =l.substring(2,8);
//		
//		int y =Integer.parseInt(a);
//		System.out.println(y);
		System.out.println(h.length());
		System.out.println(h.charAt(5)); 
		System.out.println(h.contains("anty"));
		System.out.println(h.equals(k));
		System.out.println(h.equalsIgnoreCase(k));
		System.out.println(l.concat(" Pathak"));
		System.out.println(h.concat(l));
		System.out.println(h.substring(8));
		System.out.println(h.substring(2, 8));
		System.out.println(h.indexOf('P'));
		System.out.println(h.indexOf('P', 8));//find the Second P
		System.out.println(k.trim());
		System.out.println(p.isEmpty());
		
		System.out.println(k.toUpperCase());
		System.out.println(l.toLowerCase());
		System.out.println(k.replace(' ', 'P'));
		System.out.println(h.replace("Pathak", "Ghatak"));
		
		
	}

}
