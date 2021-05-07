public class TeenNumberChecker {
    public static boolean hasTeen(int Teen1, int Teen2, int Teen3){
        if( (Teen1<=19 && Teen1>=13)
                || (Teen2<=19 && Teen2>=13)
                || (Teen3<=19 && Teen3>=13) ) return true;
        // return (Teen1 <= 19 && Teen1 >= 13) || (Teen2 <= 19 && Teen2 >= 13) || (Teen3 <= 19 && Teen3 >= 13);
        else return false;
    }
    public static boolean isTeen(int Teen4){
        return (Teen4>=13&&Teen4<=19);
    }
}
