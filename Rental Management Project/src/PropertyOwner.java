import java.util.ArrayList;
import java.util.List;

public class PropertyOwner {
    private User user;
    private List<Property> listOfProperties;

    public PropertyOwner(User user) {
        this.user = user;
        this.listOfProperties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        listOfProperties.add(property);
    }

    public void removeProperty(Property property) {
        listOfProperties.remove(property);
    }

    public List<Property> getProperties() {
        return listOfProperties;
    }
}
