package com.kodilla.testing.shape;
import java.util.*;
public class ShapeCollector {
    private List<Shape> figureList =new ArrayList<Shape>();

    public void addFigure(Shape shape){
        figureList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return figureList.remove(shape);
    }

    public Shape getFigure(int n){
        if (n>=0 && n < figureList.size()) {
            return figureList.get(n);
        }else
            return null;
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
