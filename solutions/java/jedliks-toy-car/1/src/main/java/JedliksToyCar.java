public class JedliksToyCar {
    int distance = 0;
    int battery = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        if(distance == 0){
            return "Driven 0 meters";
        }
        return "Driven "+distance+" meters";
    }

    public String batteryDisplay() {
        if(battery == 100){
            return "Battery at "+battery+"%";
        }
        else if (battery == 0){
            return "Battery empty";
        } 
        return "Battery at "+battery+"%";
    }

    public void drive() {
        if (battery == 0){
            System.out.println("Battery empty");
        } 
        else{
            distance+=20;
            battery-=1;
        }
        
    }
}
