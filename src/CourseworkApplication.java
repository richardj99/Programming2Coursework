import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class CourseworkApplication extends JFrame{

        // GUI Component dimensions.
        private final int CANVAS_INITIAL_WIDTH = 1000;
        private final int CANVAS_INITIAL_HEIGHT = 640;
        private final int CONTROL_PANEL_WIDTH = 200;
        private final int MESSAGE_AREA_HEIGHT = 100;

        private JPanel controlPanel, modePanel, operationsPanel, inputPanel, dataDisplay, hopsPanel;
        private JLabel hopsLabel;
        private JButton serveButton, getHeadButton, emptyButton, enQueue;
        private JTextField nameTextField, secondaryInfoTextField;
        private JRadioButton birthdayRadioButton, phoneNoRadioButton;
        private ButtonGroup modeButtonGroup;


        private JTextArea messageArea;

        private JMenuBar menuBar;

        private JOptionPane optionPane;

        //Constructor method
        public CourseworkApplication()
        {
            setTitle("Birthday and Phone Number Store");
            setLayout(new BorderLayout());  // Layout manager for the frame.

            // Data Display Frame
            dataDisplay = new JPanel();
            dataDisplay.setBorder(new TitledBorder(new EtchedBorder(), "Canvas"));
            dataDisplay.setPreferredSize(new Dimension(CANVAS_INITIAL_WIDTH, CANVAS_INITIAL_HEIGHT));
            dataDisplay.setCursor(new Cursor(Cursor.TEXT_CURSOR));
            add(dataDisplay, BorderLayout.CENTER);


            // Menu bar
            menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");
            JMenuItem fileSaveMenuItem = new JMenuItem("Save");
            fileMenu.add(fileSaveMenuItem);
            JMenuItem fileLoadMenuItem = new JMenuItem("Load");
            fileMenu.add(fileLoadMenuItem);
            fileMenu.addSeparator();
            JMenuItem fileExitMenuItem = new JMenuItem("Exit");
            fileMenu.add(fileExitMenuItem);
            menuBar.add(fileMenu);
            JMenu helpMenu = new JMenu("Help");
            JMenuItem helpAboutMenuItem = new JMenuItem("About");
            helpMenu.add(helpAboutMenuItem);
            menuBar.add(helpMenu);
            add(menuBar, BorderLayout.PAGE_START);


            // Control Panel
            controlPanel = new JPanel();
            controlPanel.setBorder(new TitledBorder(new EtchedBorder(), "Control Panel"));
            controlPanel.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH, CANVAS_INITIAL_HEIGHT));
            // put control panel into scroll pane
            JScrollPane controlPanelScrollPane = new JScrollPane(controlPanel);
            controlPanelScrollPane.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH + 30, CANVAS_INITIAL_HEIGHT));
            add(controlPanelScrollPane, BorderLayout.LINE_START);

            // Hops panel
            hopsPanel = new JPanel();
            hopsPanel.setBorder(new TitledBorder(new EtchedBorder(), "Number of Hops"));
            hopsPanel.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH - 20, 60));
            hopsLabel = new JLabel();
            hopsPanel.add(hopsLabel);
            hopsLabel.setText("0");
            controlPanel.add(hopsPanel);

            // Input Section
            inputPanel = new JPanel();
            inputPanel.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH - 20, 90));
            inputPanel.setLayout(new GridLayout(0, 1));
            inputPanel.setBorder(new TitledBorder(new EtchedBorder(), "Input"));
            controlPanel.add(inputPanel);
            // contents of Input Panel
            JLabel nameLabel = new JLabel();
            nameLabel.setText("Contact Name:");
            nameTextField = new JTextField();
            nameTextField.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH-20, 10));
            JLabel secondaryInfoLabel = new JLabel();
            secondaryInfoLabel.setText("Birthday");


            inputPanel.add(nameLabel);
            inputPanel.add(nameTextField);

            // Mode Chooser Section
            modePanel = new JPanel();
            modePanel.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH - 20, 90));
            modePanel.setLayout(new GridLayout(0, 1));
            modePanel.setBorder(new TitledBorder(new EtchedBorder(), "Mode"));
            controlPanel.add(modePanel);

            birthdayRadioButton = new JRadioButton();
            birthdayRadioButton.setText("Birthday Reminder");
            phoneNoRadioButton = new JRadioButton();
            phoneNoRadioButton.setText("Phone Numbers");

            modePanel.add(birthdayRadioButton);
            modePanel.add(phoneNoRadioButton);

            modeButtonGroup = new ButtonGroup();
            modeButtonGroup.add(birthdayRadioButton);
            modeButtonGroup.add(phoneNoRadioButton);

            // Operations Panel
            operationsPanel = new JPanel();
            operationsPanel.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH - 20, 220));
            operationsPanel.setLayout(new GridLayout(0,1));
            operationsPanel.setBorder(new TitledBorder(new EtchedBorder(), "Commands"));
            controlPanel.add(operationsPanel);
            // buttons code:
            enQueue = new JButton();
            enQueue.setText("enQueue");
            emptyButton = new JButton();
            emptyButton.setText("Empty");
            getHeadButton = new JButton();
            getHeadButton.setText("getHead");
            serveButton = new JButton();
            serveButton.setText("serve");
            operationsPanel.add(enQueue);
            operationsPanel.add(getHeadButton);
            operationsPanel.add(serveButton);
            operationsPanel.add(emptyButton);

            // Message area
            messageArea = new JTextArea();
            messageArea.setEditable(false);
            messageArea.setBackground(dataDisplay.getBackground());
            JScrollPane textAreaScrollPane = new JScrollPane(messageArea);
            textAreaScrollPane.setBorder(new TitledBorder(new EtchedBorder(), "Message Area"));
            textAreaScrollPane.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH + CANVAS_INITIAL_WIDTH, MESSAGE_AREA_HEIGHT));
            add(textAreaScrollPane, BorderLayout.PAGE_END);


            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            pack();  // pack frame with contents to adhere to preferred sizes
            setVisible(true);  // window set to visible

        }  // end of constructor method

        // start of main method
        public static void main(String args[]){
            CourseworkApplication applicationInstance = new CourseworkApplication();
            //LinkedList birthdayReminder = new LinkedList();
            //LinkedList phoneNoInfo = new LinkedList();
        }  // end of main method

        // start of listener class for 'mode chooser' radio buttons
        class ModeRadioButtonActionListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event){
                ;
            }

        }  // end of listener class for 'mode chooser' radio buttons

}  // end of CourseworkApplication class
