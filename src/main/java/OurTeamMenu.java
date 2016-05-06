import java.util.ArrayList;
import java.util.List;

/**
 * Created by vshevchenko on 26/04/2016.
 */
public enum OurTeamMenu {

    OUR_TEAM("Наша команда"),
    BLOG("Блог");

    private String nodeName;

    OurTeamMenu(String nodeName) {
        this.nodeName = nodeName;
    }

    String getNodeName(){
        return nodeName;
    }

    public static List<String> getNodeNameList() {
        List<String> result = new ArrayList<>();
        OurTeamMenu[] ourTeamMenus = OurTeamMenu.values();
        for (OurTeamMenu ourTeamMenu : ourTeamMenus) {
            result.add(ourTeamMenu.getNodeName());
        }
        return result;
    }

}
