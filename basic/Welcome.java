public class Welcome {

  public static void main (String arg[]) {

     String name = "Viki"; 
     String names[] = {"Viki", "Selva", "Mohan", "Vignesh"} ;
     int totalMark = 100;
     int NoOfMarks[] = {70,50,50,40,50};
    
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
     int earnedMarks = 0;
     for(int i=0; i<NoOfMarks.length; i++) {
       
          System.out.println("Mark::: " + NoOfMarks[i]);
          earnedMarks = earnedMarks + NoOfMarks[i];
  
     }
    
     System.out.println("Total Mark:" + earnedMarks);
     System.out.println("Avg Mark:" + ((earnedMarks/5)*100));

  }
}
