public class Welcome {

  public static void main (String arg[]) {

     String name = "Viki";
    
     String names[] = {"Viki", "Selva", "Mohan", "Vignesh"} ;
     System.out.println("********************************");
     System.out.println("Welcome to java learning ::: " + name);
     
     for(int i=0; i<names.length; i++) {
       
          System.out.println("Welcome to java learning ::: " + names[i]);
          if ( names[i] == "Mohan") {
            System.out.println("**********Father********");
          }else if( names[i] == "Mohan") {
            System.out.println("**********Uncle**********");
          }else{
            System.out.println("**********Student**********");
          }
       
     }
     System.out.println("********************************");

  }
}
