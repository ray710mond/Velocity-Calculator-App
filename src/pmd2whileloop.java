import java.util.Scanner;
public class pmd2whileloop{
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        Scanner kb2 = new Scanner(System.in);
        double d, vx, vy, v, t, s;
        boolean repeat = true;
        System.out.println("This application calculates the speed of a projectile in mph.");
        System.out.println();
        System.out.println("Instructions:");
        System.out.println("Record a video of a projectile with two marking points in frame. Take note of the distance between the 2 points and the time it takes the projectile to pass from point 1 to point 2. Input those results.");
        while (repeat == true)
        {
          System.out.println();
          System.out.println(); 
          while(true)
          {
            try
            {
              System.out.println("Please enter the distance between the 2 marking points in feet: ");
              d = kb.nextDouble();
              if (d > 0)
              {
                break;
              }
              else
              {
                System.out.print("Not a valid input. ");
                kb.nextLine();
              }
            }
            catch(java.util.InputMismatchException e)
            {
              System.out.print("Not a valid input. ");
              kb.nextLine();
            }
          }
          System.out.println();
          while(true)
          {
            try
            {
              System.out.println("Please enter the time in the video it took the projectile to travel between the 2 marking points in seconds: ");
              t = kb.nextDouble();
              if (t > 0)
              {
                break;
              }
              else
              {
                System.out.print("Not a valid input. ");
                kb.nextLine();
              }
            }
            catch(java.util.InputMismatchException e)
            {
              System.out.print("Not a valid input. ");
              kb.nextLine();
            }
          }
          System.out.println();
          while(true)
          {
            try
            {
              System.out.println("Please enter the speed of the video. ");
              System.out.println("e.g. the standard slo-mo speed for iphone is twice normal time so you would enter '2'. If you are recording normal speed video enter '1': ");
              s = kb.nextDouble();
              if (s > 0)
              {
                break;
              }
              else
              {
                System.out.print("Not a valid input. ");
                kb.nextLine();
              }
            }
            catch(java.util.InputMismatchException e)
            {
              System.out.print("Not a valid input. ");
              kb.nextLine();
            }
          }
          System.out.println();
          t = t / s;
          vx = d / t;
          vx = vx * 3600;
          vx = vx / 5280.0;
          vy = (-9.8*3.28084) * t;
          v = Math.sqrt(Math.pow(vx, 2)+ Math.pow(vy, 2));
          v = Math.round(v);
          int f = (int) v;
          System.out.println("The speed of the projectile is " + f + "mph");
          System.out.println();
          String rptinput;
          while(true)
          {
            try
            {
              System.out.println("Enter 'Yes' to try again, or enter 'No' to stop: ");
              rptinput = kb2.nextLine();
              if ((rptinput.equalsIgnoreCase("Yes")) || (rptinput.equalsIgnoreCase("No")))
              {
                break;
              }
              else
              {
                System.out.print("Not a valid input. ");
              }
            }
            catch(java.util.InputMismatchException e)
            {
              System.out.print("Not a valid input. ");
              kb.nextLine();
            }
          }
          System.out.println();
          while(rptinput.equalsIgnoreCase("Yes"))
            {
              repeat = true;
              rptinput = "End";
            }
          while(rptinput.equalsIgnoreCase("No"))
            {
              repeat = false;
	            System.out.println();
              System.out.println("Bye!");
              rptinput = "End";
              kb.close();
	      kb2.close();
            }
          }
        }
}