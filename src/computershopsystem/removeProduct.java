package computershopsystem;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class removeProduct {

    public static final Font MY_FONT = new Font("Times New Roman", Font.BOLD, 24);
    public static final Font MY_FONT2 = new Font("Times New Roman", Font.PLAIN, 18);

    JPanel panel = new JPanel();
    JLabel label1 = new JLabel("Search By Name");
    JLabel label2 = new JLabel("Search By Category");
    JLabel label3 = new JLabel("Enter Product Id");
    JTextField tx1 = new JTextField();
    String category[] = {"Select Category", "Laptops", "Desktops", "Computer Accessories", "MultiMedia", "Other"};
    JComboBox tx2 = new JComboBox(category);
    JTextField tx3 = new JTextField();
    JButton b1 = new JButton("Search");
    JButton b2 = new JButton("Search");
    JButton b3 = new JButton("Remove Product");
    Object columns[] = {"Product ID", "Name", "Category", "Company", "Price", "Description", "Quantity"};

    DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable();
    JScrollPane pane = new JScrollPane(table);

    removeProduct() {
        panel.setBackground(new Color(0.f, 0.f, 0.f, 0.6f));
        panel.setLayout(null);

        //Label1
        label1.setBounds(200, 30, 250, 30);
        label1.setFont(MY_FONT);
        label1.setForeground(Color.white);

        //Label2
        label2.setBounds(600, 30, 250, 30);
        label2.setFont(MY_FONT);
        label2.setForeground(Color.white);

        //TextField 1
        tx1.setBounds(200, 80, 200, 30);
        tx1.setFont(MY_FONT2);
        tx1.setForeground(Color.black);

        //BUTTON 1
        b1.setBounds(225, 130, 150, 40);
        b1.setFont(MY_FONT);
        b1.setBackground(new Color(222, 224, 227));

        //TextField 2
        tx2.setBounds(600, 80, 200, 30);
        tx2.setFont(MY_FONT2);
        tx2.setForeground(Color.black);

        //BUTTON 2
        b2.setBounds(625, 130, 150, 40);
        b2.setFont(MY_FONT);
        b2.setBackground(new Color(222, 224, 227));

        //pane+TABLE
        pane.setBounds(0, 180, 1000, 200);
        model.setColumnIdentifiers(columns);
        table.setRowHeight(20);
        table.setModel(model);
        table.setFont(MY_FONT2);
        table.getTableHeader().setFont(MY_FONT2);
        table.getTableHeader().setBackground(Color.darkGray);
        table.getTableHeader().setForeground(Color.white);

        //Label 3
        label3.setBounds(390, 390, 250, 30);
        label3.setFont(MY_FONT);
        label3.setForeground(Color.white);

        //TEXTFIELD 3
        tx3.setBounds(380, 430, 200, 30);
        tx3.setFont(MY_FONT2);
        tx3.setForeground(Color.black);

        //BUTTON 3
        b3.setBounds(370, 480, 220, 40);
        b3.setFont(MY_FONT);
        b3.setBackground(new Color(222, 224, 227));

        //EVENT LISTENERS
        panel.add(label1);
        panel.add(label2);
        panel.add(tx1);
        panel.add(tx2);
        panel.add(b1);
        panel.add(b2);
        panel.add(pane);
        panel.add(label3);
        panel.add(tx3);
        panel.add(b3);

    }

}
