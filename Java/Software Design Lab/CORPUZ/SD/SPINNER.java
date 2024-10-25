import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SPINNER extends JFrame {
    private JPanel contentPane;
    private ClockPanel clockPanel;
    private JLabel dateLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SPINNER frame = new SPINNER();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public SPINNER() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 431, 654); // Set the bounds of the frame
        contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(34, 139, 34)); // Forest green color (RGB: 34, 139, 34)
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        clockPanel = new ClockPanel();
        contentPane.add(clockPanel, BorderLayout.CENTER);

        dateLabel = new JLabel();
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);

        dateLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 23)); // Set the font for the date label
        int labelWidth = 200;
        int labelHeight = 30;
        int labelX = (getWidth() - labelWidth) / 2; // Center the label horizontally
        int labelY = 70; // Set the desired y position of the label
        dateLabel.setBounds(labelX, labelY, labelWidth, labelHeight); // Set the bounds of the date label
        contentPane.add(dateLabel);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start();

        // Position the clock and date at the center of the frame
        contentPane.add(Box.createVerticalStrut(20), BorderLayout.NORTH); // Add spacing above the date label
        contentPane.add(Box.createHorizontalGlue(), BorderLayout.WEST);
        contentPane.add(Box.createHorizontalGlue(), BorderLayout.EAST);
        contentPane.add(Box.createVerticalGlue(), BorderLayout.SOUTH);
        contentPane.add(clockPanel, BorderLayout.CENTER);
        contentPane.add(dateLabel, BorderLayout.NORTH);
    }

    private void updateTime() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        dateLabel.setText(dateFormat.format(now));
        clockPanel.setCurrentTime(now);
    }

    private class ClockPanel extends JPanel {
        private Date currentTime;
        private int dotX;
        private int dotY;
        private int dotSize;
        private int dotSpeedX;
        private int dotSpeedY;

        public ClockPanel() {
            dotX = 100; // Initial X position of the dot
            dotY = 100; // Initial Y position of the dot
            dotSize = 30; // Size of the dot
            dotSpeedX = 2; // Speed of the dot in the X direction
            dotSpeedY = 2; // Speed of the dot in the Y direction

            Timer dotTimer = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    updateDotPosition();
                    repaint();
                }
            });
            dotTimer.start();
        }

        public void setCurrentTime(Date currentTime) {
            this.currentTime = currentTime;
            repaint();
        }

        private void updateDotPosition() {
            // Update the dot's position based on the speed
            dotX += dotSpeedX;
            dotY += dotSpeedY;

            // Check for collision with the boundaries of the panel
            if (dotX <= 0 || dotX >= getWidth() - dotSize) {
                dotSpeedX = -dotSpeedX; // Reverse the X direction
            }
            if (dotY <= 0 || dotY >= getHeight() - dotSize) {
                dotSpeedY = -dotSpeedY; // Reverse the Y direction
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
            int radius = Math.min(centerX, centerY) - 70;

            // Draw clock circle
            g.setColor(Color.BLACK);
            g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

            // Draw clock numbers
            g.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 14));
            FontMetrics fm = g.getFontMetrics();
            int numRadius = radius - 20;
            for (int i = 1; i <= 12; i++) {
                double angle = Math.toRadians((i * 30) - 90);
                int numX = (int) (centerX + numRadius * Math.cos(angle) - fm.stringWidth(String.valueOf(i)) / 2);
                int numY = (int) (centerY + numRadius * Math.sin(angle) + fm.getAscent() / 2);

                // Adjust the position for 12, 6, 9, and 3
                if (i == 12 || i == 6 || i == 9 || i == 3) {
                    int offset = fm.stringWidth(String.valueOf(i)) / 2;
                    numX -= offset;
                    numY += offset;
                }

                g.drawString(String.valueOf(i), numX, numY);
            }

            // Draw clock hands
            if (currentTime != null) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(2));

                // Hour hand
                int hours = currentTime.getHours() % 12;
                double hourAngle = Math.toRadians((hours * 30) - 90);
                int hourHandLength = (int) (radius * 0.5);
                int hourX = (int) (centerX + hourHandLength * Math.cos(hourAngle));
                int hourY = (int) (centerY + hourHandLength * Math.sin(hourAngle));
                g2d.drawLine(centerX, centerY, hourX, hourY);

                // Minute hand
                int minutes = currentTime.getMinutes();
                double minuteAngle = Math.toRadians((minutes * 6) - 90);
                int minuteHandLength = (int) (radius * 0.7);
                int minuteX = (int) (centerX + minuteHandLength * Math.cos(minuteAngle));
                int minuteY = (int) (centerY + minuteHandLength * Math.sin(minuteAngle));
                g2d.drawLine(centerX, centerY, minuteX, minuteY);

                // Second hand
                int seconds = currentTime.getSeconds();
                double secondAngle = Math.toRadians((seconds * 6) - 90);
                int secondHandLength = (int) (radius * 0.9);
                int secondX = (int) (centerX + secondHandLength * Math.cos(secondAngle));
                int secondY = (int) (centerY + secondHandLength * Math.sin(secondAngle));
                g2d.setColor(Color.RED);
                g2d.drawLine(centerX, centerY, secondX, secondY);
            }

            // Draw the bouncing dot
            g.setColor(Color.BLUE);
            g.fillOval(dotX, dotY, dotSize, dotSize);
        }
    }
}
