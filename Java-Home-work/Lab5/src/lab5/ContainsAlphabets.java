package lab5;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ContainsAlphabets {

    private String mystr;

    public ContainsAlphabets(String mystr) {
        this.mystr = mystr;
    }

    public String getMystr() {
        return mystr;
    }

    public boolean CheckEmpty() {
        return !getMystr().trim().isEmpty();
    }

    public boolean CheckNull() {
        return getMystr()!= null;
    }

    public boolean Check() {
        
        if(CheckEmpty()&&CheckNull()){
          List<Character> chars = getMystr().chars().mapToObj(e -> (char)e).collect(Collectors.toList());
          return chars.stream().allMatch(Character::isLetter);
        }
        else return false;
    }

}
