public class JavaApplication5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "Manas";
        String b = "Tare";
        String c = "manas";
        String d = " Manas";
        
        System.out.println(a.charAt(0)); //M
        System.out.println(a.charAt(3)); //a
        
        System.out.println(a.indexOf("M")); //0
        System.out.println(a.indexOf("a")); //1
        System.out.println(a.lastIndexOf("a")); //3
        
        System.out.println(a.startsWith("M")); //true
        System.out.println(a.startsWith("Manas")); //true
        System.out.println(a.startsWith("manas")); //false
        
        System.out.println(a.endsWith("s")); //true
        System.out.println(a.endsWith("nas")); //true
        System.out.println(a.endsWith("manas")); //false
        
        System.out.println(a.equals(a)); //true
        System.out.println(a.equals(b)); //false
        System.out.println(a.equals(c)); //false
        
        System.out.println(a.equalsIgnoreCase(c)); //true
          
        System.out.println(d); // Manas
        System.out.println(d.trim()); //Manas
        
        System.out.println(a.replace("a","i")); //Minis
        
        System.out.println(a.substring(0)); //Manas
        System.out.println(a.substring(2)); //nas
        System.out.println(a.substring(0,4)); //Mana
        
        byte b1[] = a.getBytes();
        for(int i=0; i<b1.length;i++){
            System.out.print(b1[i]+" ");
        }
        System.out.println();
        
    }   
}
