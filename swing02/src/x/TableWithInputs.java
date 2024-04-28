package x;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableWithInputs extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public TableWithInputs() {
        setTitle("Table with Inputs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Tablo modeli oluştur
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Column 1");
        tableModel.addColumn("Column 2");
        tableModel.addColumn("Column 3");
        table = new JTable(tableModel);

        // Input alanları oluştur
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField3 = new JTextField(10);

        // Ekleme butonu
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addRow();
            }
        });

        // Silme butonu
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteRow();
            }
        });

        // Butonları içeren panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);

        // Input alanlarını içeren panel
        JPanel inputPanel = new JPanel();
        inputPanel.add(textField1);
        inputPanel.add(textField2);
        inputPanel.add(textField3);

        // Bileşenleri düzenle
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        getContentPane().add(panel);

    }

    // Yeni bir satır ekleme
    private void addRow() {
        String[] rowData = {
                textField1.getText(),
                textField2.getText(),
                textField3.getText()
        };
        tableModel.addRow(rowData);
    }

    // Seçili satırı silme
    private void deleteRow() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TableWithInputs frame = new TableWithInputs();
            frame.setVisible(true);
        });
    }
}
