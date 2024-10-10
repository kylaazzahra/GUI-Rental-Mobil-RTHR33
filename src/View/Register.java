package View;

import Entity.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    private JComboBox<String> userRole;

    /**
     * Creates new form Register
     */
    public Register() {
        setAlwaysOnTop(false);
        initComponents();
        combobox();
    }

    private void combobox() {
        // Create JComboBox
        userRole = new JComboBox<>();

        // Add items to JComboBox
        userRole.addItem("Pemilik");
        userRole.addItem("Pelanggan");
    }

    ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NIK = new javax.swing.JLabel();
        txtnik = new javax.swing.JTextField();
        role = new javax.swing.JLabel();
        txtpw = new javax.swing.JPasswordField();
        nama = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        nohp = new javax.swing.JLabel();
        txtnohp = new javax.swing.JTextField();
        btdaftar = new javax.swing.JButton();
        daftar = new javax.swing.JLabel();
        judul1 = new javax.swing.JLabel();
        judul2 = new javax.swing.JLabel();
        judul3 = new javax.swing.JLabel();
        password1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        NIK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NIK.setForeground(new java.awt.Color(255, 153, 153));
        NIK.setText("NIK");
        getContentPane().add(NIK);
        NIK.setBounds(700, 100, 180, 25);

        txtnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnikActionPerformed(evt);
            }
        });
        getContentPane().add(txtnik);
        txtnik.setBounds(700, 140, 320, 40);

        role.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        role.setForeground(new java.awt.Color(255, 153, 153));
        role.setText("Sebagai");
        getContentPane().add(role);
        role.setBounds(700, 500, 110, 25);

        txtpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpwActionPerformed(evt);
            }
        });
        getContentPane().add(txtpw);
        txtpw.setBounds(700, 440, 320, 40);

        nama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 153, 153));
        nama.setText("Nama");
        getContentPane().add(nama);
        nama.setBounds(700, 200, 70, 25);

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama);
        txtnama.setBounds(700, 240, 320, 40);

        nohp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nohp.setForeground(new java.awt.Color(255, 153, 153));
        nohp.setText("Nomor Handphone");
        getContentPane().add(nohp);
        nohp.setBounds(700, 300, 180, 25);

        txtnohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnohpActionPerformed(evt);
            }
        });
        getContentPane().add(txtnohp);
        txtnohp.setBounds(700, 340, 320, 40);

        btdaftar.setBackground(new java.awt.Color(255, 153, 153));
        btdaftar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btdaftar.setForeground(new java.awt.Color(255, 255, 255));
        btdaftar.setText("Daftar");
        btdaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdaftarActionPerformed(evt);
            }
        });
        getContentPane().add(btdaftar);
        btdaftar.setBounds(790, 590, 170, 50);

        daftar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        daftar.setForeground(new java.awt.Color(255, 153, 153));
        daftar.setText("Daftar");
        getContentPane().add(daftar);
        daftar.setBounds(840, 60, 80, 30);

        judul1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        judul1.setText("Selamat Datang");
        getContentPane().add(judul1);
        judul1.setBounds(130, 130, 310, 50);

        judul2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        judul2.setText("di Aplikasi Rental Mobil");
        getContentPane().add(judul2);
        judul2.setBounds(130, 180, 420, 50);

        judul3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        judul3.setText("Berkoh Rent");
        getContentPane().add(judul3);
        judul3.setBounds(130, 230, 420, 50);

        password1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        password1.setForeground(new java.awt.Color(255, 153, 153));
        password1.setText("Password");
        getContentPane().add(password1);
        password1.setBounds(700, 400, 110, 25);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemilik", "Pelanggan" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(700, 540, 320, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Entity/sign in (1).png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1280, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnikActionPerformed

    private void txtpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpwActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtnohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnohpActionPerformed

    private void btdaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdaftarActionPerformed
        PreparedStatement preparedStatement = null;
        try {
            if (txtnik.getText().isEmpty() || txtnama.getText().isEmpty() || txtnohp.getText().isEmpty() || txtpw.getPassword().length == 0) {
                JOptionPane.showMessageDialog(null, "Gagal Daftar, isi data lengkap!");
            } else {
                Connection connection = Koneksi.getConnection();
                System.out.println("Database connected successfully!");

                // Jika rolenya adalah Pelanggan
                if ("Pelanggan".equals((String) jComboBox1.getSelectedItem())) {
                    String query = "INSERT INTO tbuser (NIK, namaUser, nohpUser, passwordUser) VALUES (?, ?, ?, ?)";
                    preparedStatement = connection.prepareStatement(query);
                } // Jika rolenya adalah Pemilik
                else if ("Pemilik".equals((String) jComboBox1.getSelectedItem())) {
                    String query = "INSERT INTO tbadmin (NIK, nama, nohp, password) VALUES (?, ?, ?, ?)";
                    preparedStatement = connection.prepareStatement(query);
                }

                preparedStatement.setString(1, txtnik.getText());
                preparedStatement.setString(2, txtnama.getText());
                preparedStatement.setString(3, txtnohp.getText());
                preparedStatement.setString(4, new String(txtpw.getPassword()));

                int rowsInserted = preparedStatement.executeUpdate();
                System.out.println("Rows inserted: " + rowsInserted);

                if (rowsInserted > 0 && txtnik.getText() != null) {
                    System.out.println("Data berhasil ditambahkan ke tabel pengguna.");

                    // Alirkan ke kelas yang sesuai berdasarkan peran pengguna
                    if ("Pelanggan".equals((String) jComboBox1.getSelectedItem())) {
                        Transaksi tr = new Transaksi();
                        tr.setSize(1181, 700);
                        tr.setResizable(false);
                        tr.setVisible(true);
                        tr.setExtendedState(JFrame.NORMAL);
                        this.dispose();
                    } else if ("Pemilik".equals((String) jComboBox1.getSelectedItem())) {
                        UserManagement um = new UserManagement();
                        um.setSize(1181, 700);
                        um.setResizable(false);
                        um.setVisible(true);
                        um.setExtendedState(JFrame.NORMAL);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid NIK or Password");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btdaftarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIK;
    private javax.swing.JLabel background;
    private javax.swing.JButton btdaftar;
    private javax.swing.JLabel daftar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel judul3;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nohp;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel role;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtnohp;
    private javax.swing.JPasswordField txtpw;
    // End of variables declaration//GEN-END:variables
}
