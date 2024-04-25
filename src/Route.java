import java.util.Objects;

public class Route {

    String origin;
    String destination;

    public Route(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.origin);
        hash = 97 * hash + Objects.hashCode(this.destination);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Route other = (Route) obj;
        if (!Objects.equals(this.origin, other.origin)) {
            return false;
        }
        return Objects.equals(this.destination, other.destination);
    }


}
