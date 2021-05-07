public class Main {

    public static final String INVALID_VALUE_MESSAGE= "Invalid Value";
    //一种表达错误信息的方法；
    public static void main(String[] args) {
        //double centimeters= MethodOverLoading.calcFeetAndInchesToCentimeters(157);
        //if(centimeters<0.0) System.out.println("Invalid parameters");
        System.out.println(getDurationString(1200));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-21));
        
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 || seconds<0 || seconds>59) return INVALID_VALUE_MESSAGE;

        int hours= minutes / 60;
        String hoursString= hours+ "h ";
        if(hours<10) {                              //达到01h 01m 01s 这种格式的一种做法；
            hoursString= "0"+hoursString;
        }

        int remainminutes= minutes % 60;
        String minutesString=  remainminutes+ "m ";
        if(remainminutes<10) {
            minutesString="0"+minutesString;
        }

        String secondString= seconds+ "s";
        if(seconds<10){
            secondString= "0"+ secondString;
        }
        return hoursString +" "+ minutesString +" "+ secondString+ " ";
    }
    public static String getDurationString(int seconds){
        if(seconds<0){
            return INVALID_VALUE_MESSAGE;
        }
        int minutes= seconds / 60;
        int remainsecond= seconds %60;
        return getDurationString(minutes, remainsecond);    //可以在函数中使用另一个函数来达到目的，比如这里second转化成min+sec后
    }                                                      //就可以调用上一个overload的函数把min+sec转换成hours+mins+secs；
}
