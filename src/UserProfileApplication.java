import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserProfileApplication extends JFrame {
    private JTextField nameField;
    private JTextField ageField;
    private JTextField weightField;
    private JCheckBox kgCheckBox;
    private JCheckBox cmCheckBox;
    private JTextField heightField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton createProfileButton;
    private JButton consumeFoodButton;
    private JButton addExerciseButton;
    private JTextArea outputTextArea;
    private UserProfile userProfile;

    public UserProfileApplication() {
        // Set up the JFrame
        setTitle("User Profile Application");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Create a JPanel to hold form components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2));

        // Create and add form components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField(3);
        JLabel weightLabel = new JLabel("Weight:");
        weightField = new JTextField(10);
        kgCheckBox = new JCheckBox("kg");
        cmCheckBox = new JCheckBox("cm");
        JLabel heightLabel = new JLabel("Height:");
        heightField = new JTextField(10);
        JLabel genderLabel = new JLabel("Gender:");
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        createProfileButton = new JButton("Create Profile");
        consumeFoodButton = new JButton("Consume Food");
        addExerciseButton = new JButton("Add Exercise");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(weightLabel);
        panel.add(weightField);
        panel.add(kgCheckBox);
        panel.add(cmCheckBox);
        panel.add(heightLabel);
        panel.add(heightField);
        panel.add(genderLabel);
        panel.add(maleRadioButton);
        panel.add(femaleRadioButton);
        panel.add(createProfileButton);
        panel.add(consumeFoodButton);
        panel.add(addExerciseButton);

        // Add action listeners for buttons
        createProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createUserProfile();
            }
        });

        consumeFoodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consumeFood();
            }
        });

        addExerciseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addExercise();
            }
        });

        // Create a JTextArea for displaying output
        outputTextArea = new JTextArea();
        outputTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputTextArea);

        // Add the panel and output area to the JFrame
        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Display the form
        setVisible(true);
    }

    private void createUserProfile() {
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        double weight = Double.parseDouble(weightField.getText());
        boolean isKg = kgCheckBox.isSelected();
        boolean isCM = cmCheckBox.isSelected();
        double height = Double.parseDouble(heightField.getText());
        char gender = maleRadioButton.isSelected() ? 'M' : 'F';

        //    public UserProfile(String name, int age, boolean isKg,boolean isCM,  double weight, double height, char gender) {
        userProfile = new UserProfile(name, age, isKg, isCM, weight, height, gender);
        outputTextArea.setText("User profile created:\n" + userProfile.toString());
    }

    private void consumeFood() {
        if (userProfile != null) {
            // You can implement the logic to add food items to the user's profile here
            // For example, show a dialog to enter food details and then call userProfile.ConsumeFood()
            // to update the calories intake.
        } else {
            outputTextArea.setText("Please create a user profile first.");
        }
    }

    private void addExercise() {
        if (userProfile != null) {
            // You can implement the logic to add exercise items to the user's profile here
            // For example, show a dialog to enter exercise details and then call userProfile.addExercise()
            // to update the calories intake.
        } else {
            outputTextArea.setText("Please create a user profile first.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserProfileApplication();
            }
        });
    }
}
