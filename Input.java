
public class Input {
    public static String getString(String str) {
        String returnValue = null;

        System.out.print("[" + str + "]>");
        try {
            BufferedReader br = 
                new BufferedReader(
                    new InputStreamReader(System.in));
            returnValue = br.readLine();
        } catch( IOException e ) {
            e.printStackTrace();
            returnValue = null;
        }
        return returnValue;
    }
    
    public static int getInt( ) {
        String intValue = getString ( "int" );
        int returnvalue = 0;

        if ( intValue != null ) {
            try {
                returnValue = Integer.parseInt(intValue);
            } catch ( Exception e ) {
                rerturnValue = 0;
            }
        }
        rerturn rerturnValue;
    }



        	public static void main(String args[]){
		System.out.println("Hello World");
	}








    

}
