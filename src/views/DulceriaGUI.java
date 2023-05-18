package views;

import javax.swing.JFrame;

import controller.DulceriaController;
import models.Dulce;

public class DulceriaGUI extends JFrame implements DulceriaView{
    
    public DulceriaGUI(){
        super("Dulceria GUI");
        setSize(350, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void init(DulceriaController controller) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'init'");
    }

    @Override
    public void actualizarDulce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarDulce'");
    }

    @Override
    public Dulce buscarDulcePorNombre(String nombreDulce) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarDulcePorNombre'");
    }

    @Override
    public Dulce getDulce() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDulce'");
    }

    @Override
    public void actilizarVista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actilizarVista'");
    }
    
}
