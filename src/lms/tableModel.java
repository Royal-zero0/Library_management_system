/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lms;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.AbstractAction;
import javax.swing.AbstractCellEditor;
/**
 *
 * @author anonymous
 */

    
    /**
     *
     */
    public class tableModel{
    public tableModel() {
        super();
    }


    class viewButton extends JPanel {
        public JButton viewbtnp = new JButton("View");
        protected viewButton() {
            setOpaque(true);
            setFocusable(false);
            add(viewbtnp);
        }
    }

    class viewRenderer implements TableCellRenderer {
        private final viewButton panel = new viewButton() {
            @Override
            public void updateUI() {
            super.updateUI();
            setName("Table.cellRenderer");
            }
        };

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
            panel.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
            return panel;
        }
    }

    class ViewAction extends AbstractAction {
        private final JTable table;

        protected ViewAction(JTable table) {
            super("view");
            this.table = table;     
        }

        
        @Override
        public void actionPerformed(ActionEvent e) {

        //--------------------------- Create your own function on what you want the button to do when button is clicked -------------
            System.out.println("Clicked ");
        }
    }

    class ButtonsEditorView extends AbstractCellEditor implements TableCellEditor {
        protected final viewButton panel = new viewButton();
        protected final JTable table;

        protected ButtonsEditorView(JTable table) {
            super();
            this.table = table;
            panel.viewbtnp.setAction(new ViewAction(table));
        }

       
        @Override
        public Component getTableCellEditorComponent(JTable tbl, Object value, boolean isSelected, int row,
            int column) {
            panel.setBackground(tbl.getSelectionBackground());
            return panel;
        }

     
        @Override
        public Object getCellEditorValue() {
            return "";
        }
    }
}

    

