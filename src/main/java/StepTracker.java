import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int minSteps, activeDays, totalSteps, days;
 StepTracker(int n){
   minSteps = n;
   activeDays = 0;
   totalSteps = 0;
   days = 0;
 }
 public void addDailySteps(int steps){
  if(steps >= minSteps)
   activeDays++;
  totalSteps += steps;
  days++;
 }
 public int activeDays(){
  return activeDays;
 }
 public double averageSteps(){
  if(totalSteps = 0)
    return 0.0;
  return (double)(totalSteps)/days;
 }
} 
