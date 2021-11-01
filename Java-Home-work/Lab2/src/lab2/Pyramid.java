package lab2;

public class Pyramid {

    String pharaoh;
    String modern_name;
    String site;
    double height;

    public Pyramid(String pharaoh, String modern_name, String site, Double height) {
        this.pharaoh = pharaoh;
        this.modern_name = modern_name;
        this.site = site;
        this.height = height;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(Double height) {

        this.height = height;
    }

    @Override
    public String toString() {
        if (this.getHeight() > 0) {
            return " /" + getPharaoh() + " /" + getModern_name() + " /" + getSite() + " /" + getHeight();
        } else {
            return " /" + getPharaoh() + " /" + getModern_name() + " /" + getSite() + " /unknown Height";
        }
    }

}
