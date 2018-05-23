import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise_10
{

    public Set<String> removeOddLength(Set<String> set1 )
    {
        List<String> tempList = new ArrayList<>();
        tempList.addAll(set1);
        set1.clear();

        for (String element : tempList )
        {
            if (element.length()%2!=0)
            {
                set1.add(element);
            }

        }


        return set1;
    }


    public static void main(String[] args)
    {
        Exercise_10 exercise_10 = new Exercise_10();
        Set<String> set = new HashSet<>();

        set.add("1");
        set.add("11");
        set.add("111");
        set.add("1111");
        set.add("11111");

        System.out.println(exercise_10.removeOddLength(set));


    }
}
