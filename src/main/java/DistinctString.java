import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DistinctString {
    public static List<String> getDistinctStrings(List<String> stringList){
        Function<List<String>, List<String>> distinctStrings = str -> str.stream().distinct().sorted().collect(Collectors.toList());
        return distinctStrings.apply(stringList);
    }
    public static void main(String[] args) {
        String finalStr="";

        List<String> list= new ArrayList<>();
        System.out.println("Type all the  words in single line by using white-space");
        Scanner input =new Scanner(System.in);
        String line = input.nextLine();

        String[] stringList3= line.split("\\s");
        for (String str:stringList3) {
            list.add(str);
        }
        for(String string:getDistinctStrings(list)){
            finalStr+=" "+string;
        }
        System.out.println("Distinct Values:"+finalStr);
    }

}
