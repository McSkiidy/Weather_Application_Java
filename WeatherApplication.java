/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package weatherapplication;
import java.util.logging.Logger;
import java.awt.*;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author thor
 */
public class WeatherApp extends javax.swing.JFrame {
    // Add the snowfall panel with GUI components
    private final ArrayList<Snowflake> snowflakes;
    private final Random random;
    private Timer timer;

    /**
     * Creates new form WeatherApp
     */
    public WeatherApp() {
        initComponents();
        
        //SnowFlakes components://
        snowflakes = new ArrayList<>();
        random = new Random();
        setLayout(null); // Use null layout for custom positioning

        jPanel2.setBackground(Color.BLACK);

        // Start snowfall animation
        startSnowfall();
      
       
        jTextField1.setToolTipText("Enter the name of a city to get weather information.");
        jButton1.setToolTipText("Click to fetch weather information.");
        jButton2.setToolTipText("Clear the input and output.");
        jButton3.setToolTipText("Exit the application.");

        

        setTitle("Weather Application");
        setResizable(false);
        
         // Set weather-related icon in the title bar
          jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                // Only allow alphabetic characters
                if (!Character.isLetter(c)) {
                    evt.consume(); // Ignore non-alphabetic characters
                }
            }
        });
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Noto Sans Math", 1, 24)); // NOI18N
        setForeground(new java.awt.Color(0, 153, 153));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 24)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jLabel1.setText("Weather Information Application");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 0), 3, true));

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yrsa SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Enter the Location");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 0), new java.awt.Color(153, 255, 0), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jLabel2.setOpaque(true);

        jTextField1.setBackground(new java.awt.Color(0, 255, 51));
        jTextField1.setName(""); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("C059", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Get Weather");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        jButton2.setText("Clear");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("C059", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Exit");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 153, 51));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setAutoscrolls(true);
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Chilanka", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(180, 180, 180)))))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(66, 66, 66)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);  // Call the superclass' paintComponent method
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.WHITE);  // Set the snowflake color

                // Draw all snowflakes
                for (Snowflake snowflake : snowflakes) {
                    g2d.fillOval(snowflake.x, snowflake.y, snowflake.size, snowflake.size);
                }
            }
        };

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        jTextField1.setMargin(new Insets(5,10,5,10));
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String location = jTextField1.getText();
        if (!location.isEmpty()) {
            getWeather(location);
        } else {
            jLabel3.setText("Please enter a location.");
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText("");
        jLabel3.setText("Weather info will appear here...");

    }                                        

    private void formMouseEntered(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
    }                                 

    
     // Method to get the weather information
    
    
    // Method to get the weather information
    
    private void getWeather(String location) {
        try {
            String apiKey = "88ea5541c5bdccd8b5198e21248468aa";
            String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + apiKey + "&units=metric";
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 404) {
                    jLabel3.setText("<html><body><h3 style='color:red;'>Location Not Found</h3><p>Check the city name and try again.</p></body></html>");
                } else if (responseCode == 401) {
                    jLabel3.setText("<html><body><h3 style='color:red;'>Invalid API Key</h3><p>Ensure the API key is correct.</p></body></html>");
                } else {
                    jLabel3.setText("<html><body><h3 style='color:red;'>Error Retrieving Data</h3><p>Try again later.</p></body></html>");
                }
                return;
            }

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
            }
            connection.disconnect();

            // Parse JSON
            JsonObject jsonObject = JsonParser.parseString(content.toString()).getAsJsonObject();
            String weather = jsonObject.getAsJsonArray("weather").get(0).getAsJsonObject().get("description").getAsString();
            String temperature = jsonObject.getAsJsonObject("main").get("temp").getAsString();
            String feelsLike = jsonObject.getAsJsonObject("main").get("feels_like").getAsString();
            String humidity = jsonObject.getAsJsonObject("main").get("humidity").getAsString();
            String visibility = jsonObject.has("visibility") ? jsonObject.get("visibility").getAsString() : "N/A";
            String windSpeed = jsonObject.getAsJsonObject("wind").get("speed").getAsString();
            String latitude = jsonObject.getAsJsonObject("coord").get("lat").getAsString();
            String longitude = jsonObject.getAsJsonObject("coord").get("lon").getAsString();

            // Update JLabel
            String weatherInfo = "<html><body>"
                    + "<h3 style='font-weight:bold;'>Weather Information</h3>"
                    + "<p><b>Weather:</b> " + weather + "</p>"
                    + "<p><b>Temperature:</b> " + temperature + " °C</p>"
                    + "<p><b>Feels Like:</b> " + feelsLike + " °C</p>"
                    + "<p><b>Humidity:</b> " + humidity + "%</p>"
                    + "<p><b>Visibility:</b> " + visibility + " meters</p>"
                    + "<p><b>Wind Speed:</b> " + windSpeed + " m/s</p>"
                    + "<p><b>Latitude:</b> " + latitude + "</p>"
                    + "<p><b>Longitude:</b> " + longitude + "</p>"
                    + "</body></html>";

            jLabel3.setText(weatherInfo);

        } catch (Exception ex) {
            ex.printStackTrace();
            jLabel3.setText("<html><body><h3 style='color:red;'>Error Retrieving Data</h3><p>Check your network connection or API key.</p></body></html>");
        }



    }
    
    // Start the snowfall animation
    private void startSnowfall() {
        // Timer action to update snowflakes position and repaint the panel
        timer = new Timer(30, e -> {
            if (snowflakes.size() < 100) { // Limit number of snowflakes
                snowflakes.add(new Snowflake(random.nextInt(jPanel2.getWidth()), 0, random.nextInt(5) + 5));
            }

            // Update snowflakes position
            for (Snowflake snowflake : snowflakes) {
                snowflake.y += snowflake.speed;
                if (snowflake.y > jPanel2.getHeight()) {
                    snowflake.y = 0; // Reset snowflake to top
                    snowflake.x = random.nextInt(jPanel2.getWidth());
                }
            }

            // Repaint the panel to update the snowflakes on screen
            jPanel2.repaint();  
        });
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WeatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherApp().setVisible(true);
            }
        });
    }

    
    //Snowflakes being in action from here:
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}


// Class representing a single snowflake
class Snowflake {
    int x, y, size, speed;

    public Snowflake(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = size / 2; // Speed based on size for variation
    }
}
