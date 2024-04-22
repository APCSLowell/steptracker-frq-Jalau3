import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int minSteps; activeDays; totalSteps;
 StepTracker(int n){
   minSteps = n;
   activeDays = 0;
   totalSteps = 0;
 }
 public void addDailySteps(int steps){
  if(steps >= minSteps){
   totalSteps += steps;
   activeDays++;
  }
 }
 public int activeDays(){
  return activeDays;
 }
 public double averageSteps(){
  return (double)totalSteps/activeDays;
 }
} 
