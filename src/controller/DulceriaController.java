package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Dulceria;
import views.DulceriaView;

public class DulceriaController implements  ActionListener {
    DulceriaView view;
    Dulceria dulceria;
    public DulceriaController(){

    }

    public void init(DulceriaView view, Dulceria dulceria){
        this.view = view;
        this.dulceria = dulceria;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
