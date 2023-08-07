
package studentinformation;

/**
 *
 * @author Administrator
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DisplayTableFrame extends JFrame {

    private final JTable table;
    private final JButton backButton, deleteButton;
    private final DefaultTableModel model;

    DisplayTableFrame(DefaultTableModel model) {
        this.model = model;
        setTitle("Table Display");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel(new BorderLayout());

        backButton = new JButton("Back");
        backButton.setBackground(Color.GREEN);
        backButton.setForeground(Color.white);
        backButton.setFocusable(false);
        buttonPanel.add(backButton, BorderLayout.WEST);

        deleteButton = new JButton("Delete");
        deleteButton.setBackground(Color.RED);
        deleteButton.setForeground(Color.white);
        deleteButton.setFocusable(false);
        buttonPanel.add(deleteButton, BorderLayout.EAST);

        add(buttonPanel, BorderLayout.NORTH);

        // Create the table and add it to the frame
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(DisplayTableFrame.this, "Are you sure you want to go back?", "Confirm Back", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    dispose(); // Close the current frame
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    int result = JOptionPane.showConfirmDialog(DisplayTableFrame.this, "Are you sure you want to delete the selected row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION) {
                        model.removeRow(selectedRow); // Remove the selected row from the model
                    }
                } else {
                    JOptionPane.showMessageDialog(DisplayTableFrame.this, "No row selected.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
