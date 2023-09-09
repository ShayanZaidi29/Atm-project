import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.Random;
import javax.swing.*;
import java.awt.event.*;

public final class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;

    SignupOne() {

        this.setLayout((LayoutManager) null);

        Random ran = new Random();

        random = Math.abs(ran.nextLong() % 9000L + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", 1, 38));
        formno.setBounds(140, 20, 600, 40);
        this.add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", 1, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        this.add(personalDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", 1, 20));
        name.setBounds(100, 140, 100, 30);
        this.add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", 1, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        this.add(nameTextField);

        JLabel fname = new JLabel("Surname Name: ");
        fname.setFont(new Font("Raleway", 1, 20));
        fname.setBounds(100, 190, 200, 30);
        this.add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", 1, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        this.add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", 1, 20));
        dob.setBounds(100, 240, 200, 30);
        this.add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        this.add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", 1, 20));
        gender.setBounds(100, 290, 200, 30);
        this.add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        this.add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        this.add(female);

        ButtonGroup gendergroup = new ButtonGroup();

        gendergroup.add(male);

        gendergroup.add(female);

        JLabel email = new JLabel("Email Id:");
        email.setFont(new Font("Raleway", 1, 20));
        email.setBounds(100, 340, 200, 30);
        this.add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", 1, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        this.add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", 1, 20));
        marital.setBounds(100, 390, 200, 30);
        this.add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        this.add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        this.add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        this.add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", 1, 20));
        address.setBounds(100, 440, 200, 30);
        this.add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", 1, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        this.add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", 1, 20));
        city.setBounds(100, 490, 200, 30);
        this.add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", 1, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        this.add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", 1, 20));
        state.setBounds(100, 540, 200, 30);
        this.add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", 1, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        this.add(stateTextField);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", 1, 20));
        pincode.setBounds(100, 590, 200, 30);
        this.add(pincode);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", 1, 14));
        pinTextField.setBounds(300, 590, 400, 30);
        this.add(pinTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", 1, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        this.add(next);

        this.getContentPane().setBackground(Color.WHITE);

        this.setSize(850, 800);

        this.setLocation(350, 10);

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = "" + random; //long
        String name = nameTextField.getText(); //setText
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";

        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + pin + "','" + state + "')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception f) {
            System.out.println(f);
        }
    }

    public static void main(String[] args) {

        new SignupOne();
    }
}