```java
/* 

AUTHOR: Doreen Irungu
REG NO:BSE-05-0153/2024
DATE 3/JULY,2025
GROUP 3

// An application that uses five radio buttons to let you choose which kind of animal is displayed in a message box
*/

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class RadioButtonDemo extends javax.swing.JFrame {

    public RadioButtonDemo() {
        initComponents();
        ButtonGroup animalGroup = new ButtonGroup();
        animalGroup.add(jRadioButton1);
        animalGroup.add(jRadioButton2);
        animalGroup.add(jRadioButton3);
        animalGroup.add(jRadioButton4);
        animalGroup.add(jRadioButton5);
                
        setTitle("RADIO BUTTON DEMO");
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jRadioButton1.setText("CAT");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("DOG");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("CHICKEN");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("RABBIT");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("FLAMINGO");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(622, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        ImageIcon icon = new ImageIcon("C:/Users/doreen/OneDrive/Documents/NetBeansProjects/RadioButtonDemo/src/images/cat.jpg");
        JOptionPane.showMessageDialog(null, icon, "CAT", INFORMATION_MESSAGE);
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        ImageIcon icon = new ImageIcon("C:/Users/doreen/OneDrive/Documents/NetBeansProjects/RadioButtonDemo/src/images/dog.jpg");
        JOptionPane.showMessageDialog(null, icon, "DOG", INFORMATION_MESSAGE);
    }

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        ImageIcon icon = new ImageIcon("C:/Users/doreen/OneDrive/Documents/NetBeansProjects/RadioButtonDemo/src/images/chicken.jpg");
        JOptionPane.showMessageDialog(null, icon, "CHICKEN", INFORMATION_MESSAGE);
    }

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        ImageIcon icon = new ImageIcon("C:/Users/doreen/OneDrive/Documents/NetBeansProjects/RadioButtonDemo/src/images/rabbit.jpg");
        JOptionPane.showMessageDialog(null, icon, "RABBIT", INFORMATION_MESSAGE);
    }

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        ImageIcon icon = new ImageIcon("C:/Users/doreen/OneDrive/Documents/NetBeansProjects/RadioButtonDemo/src/images/flamingo.jpg");
        JOptionPane.showMessageDialog(null, icon, "FLAMINGO", INFORMATION_MESSAGE);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RadioButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new RadioButtonDemo().setVisible(true);
        });
    }

    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
}
''