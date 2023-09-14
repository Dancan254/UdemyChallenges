package Generics.Exercise;

import java.util.Arrays;

public interface Mappable {

    void render();
    static double[] StringToLocation(String location){
        var splits = location.split(",");
        double lat = Double.parseDouble(splits[0]);
        double lng = Double.parseDouble(splits[1]);
        return new double[]{lat, lng};
    }
}

abstract class Point implements Mappable{

    private double[] location = new double[2];

    @Override
    public void render() {

        System.out.println("Render " + this + " as POINT (" + location() + ")");
    }

    private String location(){
        return Arrays.toString(location);
    }
}