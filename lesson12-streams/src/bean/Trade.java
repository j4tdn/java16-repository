package bean;

import java.util.Objects;

public class Trade {
    private String name;
    private String city;

    public Trade(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public boolean equals(Object obj) {
    	if(this == obj) {
    		return true;
    		
    	}
    	if(!(obj instanceof Trade)) {
    		return false;
    	}
    	Trade that = (Trade)obj;
    	return this.getName().equals(that.getName());
    }
    
    @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Trade{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
