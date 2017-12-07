import arc.*;

public class Grade12Review1{
  public static void main(String[] args){
    Console con = new Console();
    
    int intMonth;
    int intDate;
    int intDayOfTheYear;
    intDayOfTheYear = 0;
    con.println("Enter the month number:");
    intMonth = con.readInt();
    con.println("Enter the date:");
    intDate = con.readInt();
    if(intMonth == 1){
      intDayOfTheYear = 0;
    }else if(intMonth == 2){
      intDayOfTheYear = 31;
    }else if(intMonth == 3){
      intDayOfTheYear = 59;
    }else if(intMonth == 4){
      intDayOfTheYear = 90;
    }else if(intMonth == 5){
      intDayOfTheYear = 120;
    }else if(intMonth == 6){
      intDayOfTheYear = 151;
    }else if(intMonth == 7){
      intDayOfTheYear = 181;
    }else if(intMonth == 8){
      intDayOfTheYear = 212;
    }else if(intMonth == 9){
      intDayOfTheYear = 243;
    }else if(intMonth == 10){
      intDayOfTheYear = 273;
    }else if(intMonth == 11){
      intDayOfTheYear = 304;
    }else if(intMonth == 12){
      intDayOfTheYear = 334;
    }
    
    intDayOfTheYear = intDayOfTheYear + intDate;
    con.println(intDayOfTheYear);
    
  }
}