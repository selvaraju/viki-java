public class Welcome {

  public static void main (String arg[]) {

     String name = "Viki"; 
     String names[] = {"Viki", "Selva", "Mohan", "Vignesh"} ;
     int totalMark = 100;
     int NoOfMarks[] = {70,50,50,40}
    
     System.out.println("********************************");
     System.out.println("Welcome to java learning ::: " + name);
     
     for(int i=0; i<names.length; i++) {
       
          System.out.println("Welcome to java learning ::: " + names[i]);
          if ( names[i] == "Mohan") {
            System.out.println("**********Father********");
          }else if( names[i] == "Selva") {
            System.out.println("**********Uncle**********");
          }else{
            System.out.println("**********Student**********");
          }
       
     }
    
     for(int i=0; i<NoOfMarks.length; i++) {
       
          System.out.println("Mark::: " + NoOfMarks[i]);
  
     }
    
     System.out.println("********************************");

  }
}
