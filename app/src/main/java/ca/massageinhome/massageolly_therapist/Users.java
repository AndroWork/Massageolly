package ca.massageinhome.massageolly_therapist;

public class Users {

    public String name,type,category,time;

    public int image;
    public Users(int image,String name,String type, String category, String time)
    {
        this.image = image;
        this.name = name;
        this.type = type;
        this.category = category;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
