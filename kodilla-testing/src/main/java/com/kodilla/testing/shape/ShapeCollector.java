package com.kodilla.testing.shape;
import java.util.*;
public class ShapeCollector {
    List<Shape> figureList =new ArrayList<Shape>();
    private Shape figure ;


    public void addFigure(Shape shape){
        figureList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figureList.contains(shape)) {
            figureList.remove(shape);
            result = true ;
        }
        return result;
    }

    public Shape getFigure(int n){
        figure = figureList.get(n);
        return figure;
    }
    public int getFigureListSize(){
        return  figureList.size();
    }

    public void showFigures(){
        for (Shape figur : figureList) {
            System.out.println("This is " + figur.getShapeName());
        }
    }
}
