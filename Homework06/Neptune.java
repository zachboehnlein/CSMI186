import java.text.DecimalFormat;

public class Neptune {



  /**
   * neptune constructor
   * @param gofast this would have been the input for the constructor arguments to do the neptune problem
   * @throws IllegalArgumentException me being sorry
   *
   */

   public Neptune( String gofast ) {
      try{ BrobInt gofaster = new BrobInt(gofast); }


      catch( IllegalArgumentException iae ) {
        System.out.println("make sure they are no letters in the BrobInt created as the brobint cannot be created, needs only numbers");
      }
}
   /**
    * main mathod
    *  @param args[] array arguments
    */
    public static void main( String args[] ) {
      System.out.println( "Neptune Program temporarily shutdown..." );
      System.out.println( "Didn't have enough time to finish this up with all my other school stuff, im sowwwy" );

}
 }
