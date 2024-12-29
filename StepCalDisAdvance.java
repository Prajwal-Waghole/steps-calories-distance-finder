import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;


//class to calculate steps---->
class Steps{
   private double stepsF, stepsM, cal, distance, stepsF1, stepsM1;
   private double avgStepF = 0.7;
   private double avgStepM = 0.78;

  // this is to setter to set the distance 
   public void setDistance(int d){
    distance = d;
    stepsF = d/avgStepF;
    stepsM = d/avgStepM;
   }

   //this is a getter to get steps of females through distance 
   public void getStepsDF(){
    System.out.println("Total STEPS you walked is = " + stepsF + " steps");
   }

   // this is a getter to get steps of males through distance.
   public void getStepsDM(){
    System.out.println("Total STEPS you walked is = " + stepsM + " steps");
   }

   // this is a setter to set the calories
   public void setCalories(int c){
    cal = c;
    stepsF1 = c/0.04;
    stepsM1 = c/0.05;
   }

   //this is a getter for females through calories
   public void getStepsCF(){
    System.out.println("Total STEPS you walked is = " + stepsF1 + " steps");
   }

   //this is a getter for males through calories
   public void getStepsCM(){
    System.out.println("Total STEPS you walked is = " + stepsM1 + " steps");
   }
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

//class for female calories---->
class CaloriesF{
  private double steps, dist, flat1, incline1, uneven1,flat2, incline2, uneven2,flat4, incline4, uneven4, flat3, incline3, uneven3, flat5, incline5, uneven5;
  private double avgStepF = 0.7;
  private double flatVLW = 0.02, inclineVLW = 0.026, unevenVLW = 0.024;
  private double flatLW = 0.0285, inclineLW = 0.039, unevenLW = 0.0365;
  private double flatW = 0.036, inclineW = 0.048, unevenW = 0.044;
  private double flatHW = 0.0415, inclineHW = 0.0535, unevenHW = 0.0495;
  private double flatVHW = 0.0475, inclineVHW = 0.0635, unevenVHW = 0.0585;
  
  //these are getter and setter for very light weight category(30-49kg)
    public void setStepsVLW(int s){
      steps = s;
      flat1 = s*flatVLW;
      incline1 = s*inclineVLW;
      uneven1 = s*unevenVLW;
    }

    public void getCalVLW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat1);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline1);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven1);
    }
  
  //these are getter and setter for light weight category(50-59kg)
    public void setStepsLW(int s){
      steps = s;
      flat2 = s*flatLW;
      incline2 = s*inclineLW;
      uneven2 = s*unevenLW;
    }

    public void getCalLW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat2);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline2);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven2);
    }

    //these are getter and setter for MEDIUM weight category(60-69kg)
    public void setStepsW(int s){
      steps = s;
      flat3 = s*flatW;
      incline3 = s*inclineW;
      uneven3 = s*unevenW;
    }

    public void getCalW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat3);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline3);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven3);
    }

    //these are getter and setter for HEAVY weight category(70-79kg)
    public void setStepsHW(int s){
      steps = s;
      flat4 = s*flatHW;
      incline4 = s*inclineHW;
      uneven4 = s*unevenHW;
    }

    public void getCalHW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat4);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline4);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven4);
    }

    //these are getter and setter for VERY HEAVY weight category(80kg and above)
    public void setStepsVHW(int s){
      steps = s;
      flat5 = s*flatVHW;
      incline5 = s*inclineVHW;
      uneven5 = s*unevenVHW;
    }

    public void getCalVHW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat5);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline5);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven5);
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------
    //setting getter and setter to get calroies with distance 
    public void setDistVLW(int d){
      dist = d;
      flat1 = (d/avgStepF)*flatVLW;
      incline1 = (d/avgStepF)*inclineVLW;
      uneven1 = (d/avgStepF)*unevenVLW;
    }

    public void getDistVLW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat1);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline1);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven1);
    }
  
  //these are getter and setter for light weight category(50-59kg)
    public void setDistLW(int d){
      dist = d;
      flat2 = (d/avgStepF)*flatLW;
      incline2 = (d/avgStepF)*inclineLW;
      uneven2 = (d/avgStepF)*unevenLW;
    }

    public void getDistLW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat2);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline2);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven2);
    }

    //these are getter and setter for MEDIUM weight category(60-69kg)
    public void setDistW(int d){
      dist = d;
      flat3 = (d/avgStepF)*flatW;
      incline3 = (d/avgStepF)*inclineW;
      uneven3 = (d/avgStepF)*unevenW;
    }

    public void getDistW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat3);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline3);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven3);
    }

    //these are getter and setter for HEAVY weight category(70-79kg)
    public void setDistHW(int d){
      dist = d;
      flat4 = (d/avgStepF)*flatHW;
      incline4 = (d/avgStepF)*inclineHW;
      uneven4 = (d/avgStepF)*unevenHW;
    }

    public void getDistHW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat4);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline4);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven4);
    }

    //these are getter and setter for VERY HEAVY weight category(80kg and above)
    public void setDistVHW(int d){
      dist = d;
      flat5 = (d/avgStepF)*flatVHW;
      incline5 = (d/avgStepF)*inclineVHW;
      uneven5 = (d/avgStepF)*unevenVHW;
    }

    public void getDistVHW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat5);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline5);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven5);
    }
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------

//class for male calories---->
class CaloriesM{
  private double steps, dist, flat1, incline1, uneven1,flat2, incline2, uneven2,flat4, incline4, uneven4, flat3, incline3, uneven3, flat5, incline5, uneven5;
  private double avgStepM = 0.78;
  private double flatVLW = 0.021, inclineVLW = 0.029, unevenVLW = 0.025;
  private double flatLW = 0.0325, inclineLW = 0.0445, unevenLW = 0.041;
  private double flatW = 0.039, inclineW = 0.052, unevenW = 0.096;
  private double flatHW = 0.0455, inclineHW = 0.0595, unevenHW = 0.056;
  private double flatVHW = 0.052, inclineVHW = 0.07, unevenVHW = 0.065;
  
  //these are getter and setter for very light weight category(30-49kg)
    public void setStepsVLW(int s){
      steps = s;
      flat1 = s*flatVLW;
      incline1 = s*inclineVLW;
      uneven1 = s*unevenVLW;
    }

    public void getCalVLW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat1);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline1);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven1);
    }
  
  //these are getter and setter for light weight category(50-59kg)
    public void setStepsLW(int s){
      steps = s;
      flat2 = s*flatLW;
      incline2 = s*inclineLW;
      uneven2 = s*unevenLW;
    }

    public void getCalLW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat2);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline2);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven2);
    }

    //these are getter and setter for MEDIUM weight category(60-69kg)
    public void setStepsW(int s){
      steps = s;
      flat3 = s*flatW;
      incline3 = s*inclineW;
      uneven3 = s*unevenW;
    }

    public void getCalW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat3);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline3);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven3);
    }

    //these are getter and setter for HEAVY weight category(70-79kg)
    public void setStepsHW(int s){
      steps = s;
      flat4 = s*flatHW;
      incline4 = s*inclineHW;
      uneven4 = s*unevenHW;
    }

    public void getCalHW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat4);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline4);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven4);
    }

    //these are getter and setter for VERY HEAVY weight category(80kg and above)
    public void setStepsVHW(int s){
      steps = s;
      flat5 = s*flatVHW;
      incline5 = s*inclineVHW;
      uneven5 = s*unevenVHW;
    }

    public void getCalVHW(){
      System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat5);
      System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline5);
      System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven5);
    }
//---------------------------------------------------------------------------------------------------------------------------------------------------
  //setting getter and setter to get calroies with distance 
  public void setDistVLW(int d){
    dist = d;
    flat1 = (d/avgStepM)*flatVLW;
    incline1 = (d/avgStepM)*inclineVLW;
    uneven1 = (d/avgStepM)*unevenVLW;
  }

  public void getDistVLW(){
    System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat1);
    System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline1);
    System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven1);
  }

//these are getter and setter for light weight category(50-59kg)
  public void setDistLW(int d){
    dist = d;
    flat2 = (d/avgStepM)*flatLW;
    incline2 = (d/avgStepM)*inclineLW;
    uneven2 = (d/avgStepM)*unevenLW;
  }

  public void getDistLW(){
    System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat2);
    System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline2);
    System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven2);
  }

  //these are getter and setter for MEDIUM weight category(60-69kg)
  public void setDistW(int d){
    dist = d;
    flat3 = (d/avgStepM)*flatW;
    incline3 = (d/avgStepM)*inclineW;
    uneven3 = (d/avgStepM)*unevenW;
  }

  public void getDistW(){
    System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat3);
    System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline3);
    System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven3);
  }

  //these are getter and setter for HEAVY weight category(70-79kg)
  public void setDistHW(int d){
    dist = d;
    flat4 = (d/avgStepM)*flatHW;
    incline4 = (d/avgStepM)*inclineHW;
    uneven4 = (d/avgStepM)*unevenHW;
  }

  public void getDistHW(){
    System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat4);
    System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline4);
    System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven4);
  }

  //these are getter and setter for VERY HEAVY weight category(80kg and above)
  public void setDistVHW(int d){
    dist = d;
    flat5 = (d/avgStepM)*flatVHW;
    incline5 = (d/avgStepM)*inclineVHW;
    uneven5 = (d/avgStepM)*unevenVHW;
  }

  public void getDistVHW(){
    System.out.println("The total calories you burned  if you walked/run on flat surface: " + flat5);
    System.out.println("The total calories you burned  if you walked/run on incline surface: " + incline5);
    System.out.println("The total calories you burned  if you walked/run on uneven surface: " + uneven5);
  }

}

//-----------------------------------------------------------------------------------------------------------------------------------------------------
//class to calculate distance---->
class Distance{
   private double cal, steps, distF, distM,  distF1, distM1;
   private double avgStepF = 0.7;
   private double avgStepM = 0.78;

   //creating a setter to set the steps
   public void setSteps(int s){
        steps = s;
        distF = avgStepF*s;
        distM = avgStepM*s;
    }

    //this is a getter to get distance  of females through steps
   public void getDistSF(){
    System.out.println("Total DISTANCE you covered is: " + distF + " meters");
   }

   // this is a getter to get steps of males through distance.
   public void getDistSM(){
    System.out.println("Total DISTANCE you covered is: " + distM + " meters");
   }

   // this is a setter to set the calories
   public void setCalories(int c){
        cal = c;
        distF1 = (c*avgStepF)/0.04;
        distM1 = (c*avgStepM)/0.05;
    }

   //this is a getter for females through calories
   public void getDistCF(){
    System.out.println("Total DISTANCE you covered is: " + distF1 + " meters");
   }

   //this is a getter for males through calories
   public void getDistCM(){
    System.out.println("Total DISTANCE you covered is: " + distM1 + " meters");
   }
}

//-------------------------------------------------------------------------------------------------------------------------------------------------
//main class to get all values + user inputs
public class StepCalDisAdvance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to my Steps/ Calories/ Distance calculator");

    //calling and creating variable for (class Steps)
    Steps st = new Steps();

    //calling and creating variable for (class Calories)
    CaloriesF cF = new CaloriesF();
    CaloriesM cM = new CaloriesM();

    //calling and creating variable for (class Steps)
    Distance di = new Distance();

    System.out.println("What you want to find? \n1)Steps 2) Calories 3) Distance, Type below: ");
    String choice = sc.nextLine();

    //setting (if statements) for vaious choice
      if(choice.equalsIgnoreCase("steps") || choice.equalsIgnoreCase("Steps")){

        //check if user is male/female
        System.out.println("What is your Gender (M or F)? type below: ");
        String chG = sc.nextLine();

        if(chG.equalsIgnoreCase("F") || chG.equalsIgnoreCase("f")){

          //now check what user have distance or calories
          System.out.println("Do you want to find Steps with Distance(D) or Calories(C), type below: ");
          String ch = sc.nextLine();

          //now call getter and setter accroding to choice of users ie distance or calories
          if(ch.equalsIgnoreCase("D") || ch.equalsIgnoreCase("d")){
            System.out.println("Enter the Distance in meters: ");
            int D = sc.nextInt();
            
            //calling getter and setter 
            st.setDistance(D);
            st.getStepsDF();

          }

          else if(ch.equalsIgnoreCase("C") || ch.equalsIgnoreCase("c")){
            System.out.println("Enter the Calories: ");
            int C = sc.nextInt();

            st.setCalories(C);
            st.getStepsCF();
          }

          else{
            System.out.println("Invalid Entry !!!");
          }
        }

        else if(chG.equalsIgnoreCase("M") || chG.equalsIgnoreCase("m")){

          //now check what user have distance or calories
          System.out.println("Do you want to find Steps with Distance(D) or Calories(C), type below: ");
          String ch = sc.nextLine();

          //now call getter and setter accroding to choice of users ie distance or calories
          if(ch.equalsIgnoreCase("D") || ch.equalsIgnoreCase("d")){
            System.out.println("Enter the Distance in meters: ");
            int D = sc.nextInt();
            
            //calling getter and setter 
            st.setDistance(D);
            st.getStepsDM();

          }

          else if(ch.equalsIgnoreCase("C") || ch.equalsIgnoreCase("c")){
            System.out.println("Enter the Calories: ");
            int C = sc.nextInt();

            st.setCalories(C);
            st.getStepsCM();
          }

          else{
            System.out.println("Invalid Entry !!!");
          }
        }
      }
      
      //now if statement for distance 
      else if(choice.equalsIgnoreCase("Distance") || choice.equalsIgnoreCase("distance")){

        //now check the gender of the user
        System.out.println("What is your Gender (M or F)? type below: ");
        String chG = sc.nextLine();

        if(chG.equalsIgnoreCase("F") || chG.equalsIgnoreCase("f")){

          //now check what user have steps or calories
          System.out.println("Do you want to find Distance with Steps(S) or Calories(C), type below: ");
          String ch = sc.nextLine();

          if(ch.equalsIgnoreCase("S") || ch.equalsIgnoreCase("s")){
            System.out.println("Enter the Steps below: ");
            int S = sc.nextInt();
            
            //calling getter and setter 
            di.setSteps(S);
            di.getDistSF();
          }

          else if(ch.equalsIgnoreCase("C") || ch.equalsIgnoreCase("c")){
            System.out.println("Enter the Calories: ");
            int C = sc.nextInt();

            di.setCalories(C);
            di.getDistCF();
          }

          else{
            System.out.println("Invalid Entry !!!");
          }
        }

        else if(chG.equalsIgnoreCase("M")){

          //now check what user have distance or calories
          System.out.println("Do you want to find Distance with Steps(S) or Calories(C), type below: ");
          String ch = sc.nextLine();

          if(ch.equalsIgnoreCase("S") || ch.equalsIgnoreCase("s")){
            System.out.println("Enter the Steps below: ");
            int S = sc.nextInt();
            
            //calling getter and setter 
            di.setSteps(S);
            di.getDistSM();
          }

          else if(ch.equalsIgnoreCase("C") || ch.equalsIgnoreCase("c")){
            System.out.println("Enter the Calories: ");
            int C = sc.nextInt();

            di.setCalories(C);
            di.getDistCM();
          }

          else{
            System.out.println("Invalid Entry !!!");
          }
        }
      }

      //now if statemnet for Calories--->
      else if(choice.equalsIgnoreCase("Calories") || choice.equalsIgnoreCase("calories")){

        //now check the gender of the user
        System.out.println("What is your Gender (M or F)? type below: ");
        String chG = sc.nextLine();

        if(chG.equalsIgnoreCase("F") || chG.equalsIgnoreCase("f")){

          //now check what user have steps or calories
          System.out.println("Do you want to find Calories with Steps(S) or Distance(D), type below: ");
          String ch = sc.nextLine();

          if(ch.equalsIgnoreCase("S") || ch.equalsIgnoreCase("s")){

            //enter user weight cateogory
            System.out.println("Enter you weight category 1)30-49kg 2)50-59kg 3)60-69kg 4)70-79kg 5) 80 and above : ");
            int ch1 = sc.nextInt();

            //if statement for user input
            if(ch1 == 1){
              System.out.println("Enter the steps: ");
              int s = sc.nextInt();
              cF.setStepsVLW(s);
              cF.getCalVLW();
            }

            else if(ch1==2){
              System.out.println("Enter the steps: ");
              int s = sc.nextInt();
              cF.setStepsLW(s);
              cF.getCalLW();
            }

            else if(ch1==3){
              System.out.println("Enter the steps: ");
              int s = sc.nextInt();
              cF.setStepsW(s);
              cF.getCalW();
            }

            else if(ch1==4){
              System.out.println("Enter the steps: ");
              int s = sc.nextInt();
              cF.setStepsHW(s);
              cF.getCalHW();
            }

            else if(ch1==5){
              System.out.println("Enter the steps: ");
              int s = sc.nextInt();
              cF.setStepsVHW(s);
              cF.getCalVHW();
            }

            else{
              System.out.println("Invalid input !!!");
            }
          }

          else if(ch.equalsIgnoreCase("D") || ch.equalsIgnoreCase("d")){
            System.out.println("Enter you weight category 1)30-49kg 2)50-59kg 3)60-69kg 4)70-79kg 5) 80 and above :");
            int ch1 = sc.nextInt();

            //if statement for user input
            if(ch1 == 1){
              System.out.println("Enter the distance in meters: ");
              int d = sc.nextInt();
              cF.setDistVLW(d);
              cF.getDistVLW();
            }

            else if(ch1 ==2){
              System.out.println("Enter the distance in meters: ");
              int d = sc.nextInt();
              cF.setDistLW(d);
              cF.getDistLW();
            }

            else if(ch1 ==3){
              System.out.println("Enter the distance in meters: ");
              int d = sc.nextInt();
              cF.setDistW(d);
              cF.getDistW();
            }

            else if(ch1 ==4){
              System.out.println("Enter the distance in meters: ");
              int d = sc.nextInt();
              cF.setDistHW(d);
              cF.getDistHW();
            }

            else if(ch1 ==5){
              System.out.println("Enter the distance in meters: ");
              int d = sc.nextInt();
              cF.setDistVHW(d);
              cF.getDistVHW();
            }

            else{
              System.out.println("Invalid input !!!");
            }
          }

          else{
            System.out.println("Invalid input !!!");
          }
        }
//-----------------------------------------------------------------------------------------------------------------------------
        else if(chG.equalsIgnoreCase("M") || chG.equalsIgnoreCase("m")){
          //now check what user have steps or calories
          System.out.println("Do you want to find Calories with Steps(S) or Distance(D), type below: ");
          String ch = sc.nextLine();

          if(ch.equalsIgnoreCase("S") || ch.equalsIgnoreCase("s")){

            //enter user weight cateogory
            System.out.println("Enter you weight category 1)30-49kg 2)50-59kg 3)60-69kg 4)70-79kg 5) 80 and above : ");
            int ch1 = sc.nextInt();

            //if statement for user input
            if(ch1 == 1){
              System.out.println("Enter the steps: ");
              int s = sc.nextInt();
              cM.setStepsVLW(s);
              cM.getCalVLW();
            }

            else if(ch1==2){
              System.out.println("Enter the steps: ");
              int s = sc.nextInt();
              cM.setStepsLW(s);
              cM.getCalLW();
            }

            else if(ch1==3){
              System.out.println("Enter the steps: ");
              int s = sc.nextInt();
              cM.setStepsW(s);
              cM.getCalW();
            }

            else if(ch1==4){
              System.out.println("Enter the steps: ");
              int s = sc.nextInt();
              cM.setStepsHW(s);
              cM.getCalHW();
            }

            else if(ch1==5){
              System.out.println("Enter the steps: ");
              int s = sc.nextInt();
              cM.setStepsVHW(s);
              cM.getCalVHW();
            }

            else{
              System.out.println("Invalid input !!!");
            }
          }

          else if(ch.equalsIgnoreCase("D") || ch.equalsIgnoreCase("d")){
            System.out.println("Enter you weight category 1)30-49kg 2)50-59kg 3)60-69kg 4)70-79kg 5) 80 and above : ");
            int ch1 = sc.nextInt();

            //if statement for user input
            if(ch1 == 1){
              System.out.println("Enter the distance in meters: ");
              int d = sc.nextInt();
              cM.setDistVLW(d);
              cM.getDistVLW();
            }

            else if(ch1 ==2){
              System.out.println("Enter the distance in meters: ");
              int d = sc.nextInt();
              cM.setDistLW(d);
              cM.getDistLW();
            }

            else if(ch1 ==3){
              System.out.println("Enter the distance in meters: ");
              int d = sc.nextInt();
              cM.setDistW(d);
              cM.getDistW();
            }

            else if(ch1 ==4){
              System.out.println("Enter the distance in meters: ");
              int d = sc.nextInt();
              cM.setDistHW(d);
              cM.getDistHW();
            }

            else if(ch1 ==5){
              System.out.println("Enter the distance in meters: ");
              int d = sc.nextInt();
              cM.setDistVHW(d);
              cM.getDistVHW();
            }

            else{
              System.out.println("Invalid input !!!");
            }
          }

          else{
            System.out.println("Invalid input !!!");
          }
        }
      }

      else{
        System.out.println("Invalid input !!!");
      }
//---------------------------------------------------------------------------------------------------------------------------------------
 System.out.println("\nThis Calculation is 90% correct...some factors may influnce change in calculations !!!");
 }
}
