/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weight_keeper;

/**
 *
 * @author jim
 */
import javax.swing.JList;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class foodLogListbox extends JList{
    
    public DefaultListModel LogList;
    
    // foodLogListbox init ###############################################
    // ###################################################################
    
   public foodLogListbox() {
       super(new DefaultListModel());
       
        LogList = (DefaultListModel)this.getModel();
       LogList.addElement("ok jim");
    } // end of init 
    
    
    
} // end of class foodLogListbox

