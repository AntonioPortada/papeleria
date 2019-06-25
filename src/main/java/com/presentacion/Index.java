package com.presentacion;

import javax.swing.JMenu;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Administrador
 */
public class Index extends JFrame {
    
    public Index(int level){
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
        menuProduct.add(itemInsertProduct);
        menuProduct.add(itemDeleteProduct);
        menuProduct.add(itemEditProduct);
        menuProduct.add(itemDiscount);
        
        //items Options
        JMenuItem itemExit = new JMenuItem("Salir");
        menuOptions.add(itemExit);
        
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
        
        setExtendedState(MAXIMIZED_BOTH);
    }
}
