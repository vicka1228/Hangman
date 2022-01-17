import java.util.*;
class ChooseMovie
{   
    public static String getRandom(String[] array) {
    int rnd = (int)(Math.random()*array.length);
    return array[rnd];
}
}