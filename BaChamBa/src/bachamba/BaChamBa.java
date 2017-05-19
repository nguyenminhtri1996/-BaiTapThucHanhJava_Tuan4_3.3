/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bachamba;

import javax.swing.JOptionPane;

/**
 *
 * @author Minh Tri
 */
public class BaChamBa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Object[] options = { "+ Có +", "+ Không +" };
            int choice = JOptionPane.showOptionDialog(null, "Bạn chắc chắn muốn xóa sinh viên này chứ ?", "Cảnh báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
      
    }
    
}
