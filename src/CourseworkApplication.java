import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CourseworkApplication extends JFrame{

    // GUI Component dimensions.
    private final int CANVAS_INITIAL_WIDTH = 800;
    private final int CANVAS_INITIAL_HEIGHT = 640;
    private final int CONTROL_PANEL_WIDTH = 200;
    private final int MESSAGE_AREA_HEIGHT = 100;

    private JPanel controlPanel, modePanel, inputPanel, operationPanel, dataDisplay;
    private JLabel hopsLabel;
    private JButton serveButton, getHeadButton, emptyButton, onQueue;
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
        // next line changes the cursor's rendering whenever the mouse drifts onto the canvas
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
        // the following two lines put the control panel in a scroll pane (nicer?).
        JScrollPane controlPanelScrollPane = new JScrollPane(controlPanel);
        controlPanelScrollPane.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH + 30, CANVAS_INITIAL_HEIGHT));
        add(controlPanelScrollPane, BorderLayout.LINE_START);


        // Hops Panel panel
        JPanel hopsPanel = new JPanel();
        hopsPanel.setBorder(new TitledBorder(new EtchedBorder(), "Number of Hops"));
        hopsPanel.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH - 20, 60));
        hopsLabel = new JLabel();
        hopsPanel.add(hopsLabel);
        hopsLabel.setText("0");
        controlPanel.add(hopsPanel);

        // Input Section
        

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

        // Input Section
        inputPanel = new JPanel();
        inputPanel.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH - 20, 90));
        inputPanel.setLayout(new GridLayout(0,1));
        inputPanel.setBorder(new TitledBorder(new EtchedBorder(), "Input"));
        controlPanel.add(inputPanel);

        onQueue = new JButton();
        onQueue.setText("onQueue");
        emptyButton = new JButton();
        emptyButton.setText("Empty");
        getHeadButton = new JButton();
        getHeadButton.setText("getHead");
        serveButton = new JButton();
        serveButton.setText("serve");
        inputPanel.add(onQueue);
        inputPanel.add(getHeadButton);
        inputPanel.add(serveButton);
        inputPanel.add(emptyButton);

        // Message area
        messageArea = new JTextArea();
        messageArea.setEditable(false);
        messageArea.setBackground(dataDisplay.getBackground());
        JScrollPane textAreaScrollPane = new JScrollPane(messageArea);
        textAreaScrollPane.setBorder(new TitledBorder(new EtchedBorder(), "Message Area"));
        textAreaScrollPane.setPreferredSize(new Dimension(CONTROL_PANEL_WIDTH + CANVAS_INITIAL_WIDTH, MESSAGE_AREA_HEIGHT));
        add(textAreaScrollPane, BorderLayout.PAGE_END);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();
        setVisible(true);



    }  // end of constructor method

    // start of main method
    public static void main(String args[]){
        CourseworkApplication applicationInstance = new CourseworkApplication();
        //LinkedList birthdayReminder = new LinkedList();
        //LinkedList phoneNoInfo = new LinkedList();
    }  // end of main method

}  // end of CourseworkApplication class
