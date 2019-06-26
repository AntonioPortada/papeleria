package com.presentacion;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Administrador
 */
public class Index extends JFrame {
    
    protected static int level;
    
    public Index(){
        JMenuBar bar = new JMenuBar();
        
        //Menus
        JMenu menuUser = new JMenu("Usuario");
        JMenu menuRol = new JMenu("Roles");
        JMenu menuProduct = new JMenu("Producto");
        JMenu menuOptions = new JMenu("Opciones");
        
        //items User
        JMenuItem itemInsertUser = new JMenuItem("Insertar");
        JMenuItem itemDeleteUser = new JMenuItem("Borrar");
        JMenuItem itemEditUser = new JMenuItem("Editar");
        menuUser.add(itemInsertUser);
        menuUser.add(itemDeleteUser);
        menuUser.add(itemEditUser);
        
        //items Rol
        JMenuItem itemInserRol = new JMenuItem("Insertar");
        JMenuItem itemDeleteRol = new JMenuItem("Borrar");
        JMenuItem itemEditRol = new JMenuItem("Editar");
        menuRol.add(itemInserRol);
        menuRol.add(itemDeleteRol);
        menuRol.add(itemEditRol);
        
        //items Product
        JMenuItem itemInsertProduct = new JMenuItem("Insertar");
        JMenuItem itemDeleteProduct = new JMenuItem("Borrar");
        JMenuItem itemEditProduct = new JMenuItem("Editar");
        JMenuItem itemDiscount = new JMenuItem("Descuentos");
        JMenuItem itemCotizacion = new JMenuItem("Cotización");
        menuProduct.add(itemInsertProduct);
        menuProduct.add(itemDeleteProduct);
        menuProduct.add(itemEditProduct);
        menuProduct.add(itemDiscount);
        menuProduct.add(itemCotizacion);
        
        //items Options
        JMenuItem itemExit = new JMenuItem("Salir");
        JMenuItem itemHelp = new JMenuItem("Ayuda");
        menuOptions.add(itemExit);
        menuOptions.add(itemHelp);
        
        bar.add(menuUser);
        bar.add(menuRol);
        bar.add(menuProduct);
        bar.add(menuOptions);
        setJMenuBar(bar);
        
        /*if(2 == level)
            menuRol.setEnabled(false);*/
        
        itemExit.addActionListener(event -> {
            System.exit(0);
        });
        
        setBackground(Color.WHITE);
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    public int getLevel(){ return level; }
    
    public void setLevel(int level){ this.level = level; } 
}
