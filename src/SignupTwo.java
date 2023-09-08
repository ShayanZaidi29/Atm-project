


import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.Random;
import javax.swing.*;
import java.awt.event.*;

public final class SignupTwo extends JFrame implements ActionListener {


    JTextField pan, adhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    String formno;


    JComboBox religion, category, income, occupation, education;

    SignupTwo(String formno) {

        this.formno= formno;

        this.setLayout((LayoutManager) null);

        setTitle("NEW ACCOUNT APPLICATION-PAGE 2");


        JLabel additionalDetails = new JLabel("Page 2:Additional Detials");
        additionalDetails.setFont(new Font("Raleway", 1, 38));
        additionalDetails.setBounds(140, 20, 600, 40);
        this.add(additionalDetails);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", 1, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        this.add(personalDetails);

        JLabel name = new JLabel("Religion: ");
        name.setFont(new Font("Raleway", 1, 20));
        name.setBounds(100, 140, 100, 30);
        this.add(name);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);


        JLabel fname = new JLabel("Category: ");
        fname.setFont(new Font("Raleway", 1, 20));
        fname.setBounds(100, 190, 200, 30);
        this.add(fname);

        String valcategory[] = {"General", "ST", "OBC", "SC", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        this.add(category);

        String incomecategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000 ", "Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        this.add(income);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", 1, 20));
        dob.setBounds(100, 240, 200, 30);
        this.add(dob);


        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", 1, 20));
        gender.setBounds(100, 290, 200, 30);
        this.add(gender);


        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", 1, 20));
        email.setBounds(100, 315, 200, 30);
        this.add(email);

        String educationValues[] = {"Non Graduate", "Graduate", "Post Graduation", "PHD", "Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        this.add(education);


        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", 1, 20));
        marital.setBounds(100, 390, 200, 30);
        this.add(marital);

        String occupationValues[] = {"Salaried", "Self-Employed", "Businessman", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        this.add(occupation);


        JLabel address = new JLabel("Pan Number:");
        address.setFont(new Font("Raleway", 1, 20));
        address.setBounds(100, 440, 200, 30);
        this.add(address);


        pan = new JTextField();
        pan.setFont(new Font("Raleway", 1, 14));
        pan.setBounds(300, 440, 400, 30);
        this.add(pan);

        JLabel city = new JLabel("Adhar Number.:");
        city.setFont(new Font("Raleway", 1, 20));
        city.setBounds(100, 490, 200, 30);
        this.add(city);

        adhar = new JTextField();
        adhar.setFont(new Font("Raleway", 1, 14));
        adhar.setBounds(300, 490, 400, 30);
        this.add(adhar);

        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", 1, 20));
        state.setBounds(100, 540, 200, 30);
        this.add(state);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        this.add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        this.add(sno);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);


        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", 1, 20));
        pincode.setBounds(100, 590, 200, 30);
        this.add(pincode);


        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        this.add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        this.add(eno);

        ButtonGroup existing = new ButtonGroup();
        existing.add(eyes);
        existing.add(eno);

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
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String sseniorcitizen = null;
        if (syes.isSelected()) {
            sseniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            sseniorcitizen = "No";
        }

        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";

        } else if (eno.isSelected()) {
            existingaccount = "No";


            String span = pan.getText();
            String sadhar = adhar.getText();

            try {
                Conn c = new Conn();
                String query = "insert into signuptwo values('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seducation + "','" + soccupation + "','" + span + "','" + sadhar + "','" + sseniorcitizen + "','" + existingaccount + "')";
                c.s.executeUpdate(query);

                //Signup3 Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);

            } catch (Exception f) {
                System.out.println(f);
            }
        }
    }

       public static void main(String args[]){
            new SignupTwo("");
        }
    }
