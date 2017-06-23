/**
 * Created by bbencze on 2017.06.20..
 */
public class Water {

    public static void main(String[] args) {
        int waterTemperature = 5;
        boolean isStripersMostActive = false;
        if (waterTemperature >= 69) {
            isStripersMostActive = false;
        } else if (waterTemperature < 69 && waterTemperature > 47) {
            isStripersMostActive = true;
        } else if (waterTemperature <= 47) {
            isStripersMostActive = false;
        }
    }
}
