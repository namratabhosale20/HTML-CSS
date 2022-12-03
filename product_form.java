import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class product_form extends Frame implements ActionListener {
    Label lb_title, lb_product_no, lb_product_name, lb_product_type, lb_product_measure, lb_product_cost;
    TextField tf_no, tf_name, tf_measure, tf_cost;
    Button but_add, but_close;
    CheckboxGroup cbg;
    Checkbox rb1, rb2, rb3;

    product_form() {
        setSize(1200, 800);
        setVisible(true);
        setLayout(null);
        lb_title = new Label("Product information form");
        lb_product_no = new Label("Product No");
        lb_product_name = new Label("Product Name");
        lb_product_type = new Label("Product Type");
        lb_product_measure = new Label("Product measurement");
        lb_product_cost = new Label("Product Cost");
        but_add = new Button("add new product");
        but_close = new Button("close form");
        tf_no = new TextField();
        tf_name = new TextField();
        tf_measure = new TextField();
        tf_cost = new TextField();
        cbg = new CheckboxGroup();
        rb1 = new Checkbox("Export");
        rb2 = new Checkbox("Branded");
        rb3 = new Checkbox("Domestic");
        Font f1 = new Font("Arial", Font.BOLD, 32);
        Font f2 = new Font("Times new romen", Font.BOLD, 24);
        Font f3 = new Font("times new romen", Font.BOLD, 18);
        lb_title.setFont(f1);
        lb_product_no.setFont(f2);
        lb_product_name.setFont(f2);
        lb_product_measure.setFont(f2);
        lb_product_cost.setFont(f2);
        lb_product_type.setFont(f2);
        rb1.setFont(f3);
        rb2.setFont(f3);
        rb3.setFont(f3);
        add(lb_title);
        add(lb_product_no);
        add(lb_product_name);
        add(lb_product_measure);
        add(lb_product_type);
        add(lb_product_cost);
        add(tf_no);
        add(tf_name);
        add(tf_measure);
        add(tf_cost);
        add(rb1);
        add(rb2);
        add(rb3);
        add(but_add);
        add(but_close);
        but_add.setFont(f3);
        but_close.setFont(f3);
        but_add.addActionListener(this);
        but_close.addActionListener(this);

        lb_title.setBounds(450, 50, 400, 45);
        lb_product_no.setBounds(350, 250, 160, 35);
        tf_no.setBounds(550, 250, 100, 30);
        lb_product_name.setBounds(350, 300, 180, 35);
        tf_name.setBounds(550, 300, 300, 30);
        lb_product_type.setBounds(350, 350, 180, 35);
        rb1.setBounds(550, 350, 180, 35);
        rb2.setBounds(730, 350, 180, 35);
        rb3.setBounds(910, 350, 180, 35);
        lb_product_measure.setBounds(350, 400, 260, 35);
        tf_measure.setBounds(660, 400, 100, 30);
        lb_product_cost.setBounds(350, 450, 160, 35);
        tf_cost.setBounds(550, 450, 100, 30);
        but_add.setBounds(350, 550, 200, 30);
        but_close.setBounds(650, 550, 200, 30);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == but_add)
         {
             if(tf_no.getText().length()==0)
             {
                 JOptionPane.showMessageDialog(this, "please enter number");
                 tf_no.requestFocus();
             }
             else if (!(Double.parseDouble(tf_cost.getText()) >= 2500)) {
                JOptionPane.showMessageDialog(this, "cost must be above 2500");

             }
        

    }
    else if (ae.getSource() == but_close) {
        dispose();
    }
}

    public static void main(String args[]) {
        product_form ob = new product_form();
    }
}

