package View;

import Entity.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class Transaksi extends javax.swing.JFrame {

    private Statement stm;
    private ResultSet res;

    /**
     * Creates new form Register
     */
    public Transaksi() {
        initComponents();
        try {

            Connection connection = Koneksi.getConnection();
            stm = connection.createStatement();

            tampiltabel();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        sewa.addPropertyChangeListener("date", new DateChangeListener());
        kembali.addPropertyChangeListener("date", new DateChangeListener());
        txtnoplatmobil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateHarga();
            }
        });
    }

    private void tampiltabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No Plat Mobil");
        model.addColumn("Merk Mobil");
        model.addColumn("Harga Mobil");
        jTable1.setModel(model);
        try {
            Connection connection = Koneksi.getConnection();
            res = stm.executeQuery("SELECT noPlatMobil, merkMobil, hargaMobil FROM tbmobil");
            while (res.next()) {
                model.addRow(new Object[]{
                    res.getInt("noPlatMobil"),
                    res.getString("merkMobil"),
                    res.getInt("hargaMobil"),});

            }
        } catch (Exception e) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        durasisewa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        merkmobil = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nik = new javax.swing.JLabel();
        txtdurasisewa = new javax.swing.JTextField();
        txtnik = new javax.swing.JTextField();
        txttotalharga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnoplatmobil = new javax.swing.JTextField();
        sewa = new com.toedter.calendar.JDateChooser();
        kembali = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btkeluar = new javax.swing.JButton();
        btlogin = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        durasisewa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        durasisewa.setForeground(new java.awt.Color(255, 153, 153));
        durasisewa.setText("Durasi Sewa");
        getContentPane().add(durasisewa);
        durasisewa.setBounds(200, 280, 120, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setText("Hari");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 280, 60, 30);

        merkmobil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        merkmobil.setForeground(new java.awt.Color(255, 153, 153));
        merkmobil.setText("No Plat Mobil");
        getContentPane().add(merkmobil);
        merkmobil.setBounds(200, 220, 120, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setText("Tanggal Sewa");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(610, 160, 130, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("Total Harga");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(610, 280, 150, 30);

        nik.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nik.setForeground(new java.awt.Color(255, 153, 153));
        nik.setText("NIK");
        getContentPane().add(nik);
        nik.setBounds(200, 160, 60, 30);

        txtdurasisewa.setEditable(false);
        txtdurasisewa.setBackground(new java.awt.Color(255, 255, 255));
        txtdurasisewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdurasisewaActionPerformed(evt);
            }
        });
        getContentPane().add(txtdurasisewa);
        txtdurasisewa.setBounds(340, 280, 80, 40);

        txtnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnikActionPerformed(evt);
            }
        });
        getContentPane().add(txtnik);
        txtnik.setBounds(340, 160, 200, 40);

        txttotalharga.setEditable(false);
        txttotalharga.setBackground(new java.awt.Color(255, 255, 255));
        txttotalharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalhargaActionPerformed(evt);
            }
        });
        getContentPane().add(txttotalharga);
        txttotalharga.setBounds(780, 280, 210, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("TRANSAKSI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 60, 210, 100);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 153));
        jLabel8.setText("Tanggal Kembali");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(610, 220, 150, 30);

        txtnoplatmobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoplatmobilActionPerformed(evt);
            }
        });
        getContentPane().add(txtnoplatmobil);
        txtnoplatmobil.setBounds(340, 220, 200, 40);
        getContentPane().add(sewa);
        sewa.setBounds(780, 160, 210, 40);
        getContentPane().add(kembali);
        kembali.setBounds(780, 220, 210, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 420, 940, 200);

        btkeluar.setBackground(new java.awt.Color(255, 0, 0));
        btkeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btkeluar.setForeground(new java.awt.Color(255, 255, 255));
        btkeluar.setText("Keluar");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btkeluar);
        btkeluar.setBounds(1100, 10, 70, 30);

        btlogin.setBackground(new java.awt.Color(255, 153, 153));
        btlogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btlogin.setForeground(new java.awt.Color(255, 255, 255));
        btlogin.setText("Bayar");
        btlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btloginActionPerformed(evt);
            }
        });
        getContentPane().add(btlogin);
        btlogin.setBounds(500, 340, 170, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Entity/bg.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1280, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdurasisewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdurasisewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdurasisewaActionPerformed

    private void txtnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnikActionPerformed

    private void txttotalhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalhargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalhargaActionPerformed

    private void txtnoplatmobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoplatmobilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoplatmobilActionPerformed

    private void btloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btloginActionPerformed
        PreparedStatement preparedStatement = null;
        try {
            Connection connection = Koneksi.getConnection();
            System.out.println("Database connected successfully!");

            String query = "INSERT INTO tbtransaksi (NIK,noPlatMobil,durasiSewa,"
                    + "tanggalSewa,tanggalKembali,totalHarga) VALUES ( ?, ?, ?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, txtnik.getText());
            preparedStatement.setString(2, txtnoplatmobil.getText()); // Assuming noPlatMobil is a String
            preparedStatement.setInt(3, Integer.parseInt(txtdurasisewa.getText()));

            // Convert java.util.Date to java.sql.Date
            java.util.Date sewaDate = sewa.getDate();
            java.util.Date kembaliDate = kembali.getDate();

            if (sewaDate != null && kembaliDate != null) {
                preparedStatement.setDate(4, new java.sql.Date(sewaDate.getTime()));
                preparedStatement.setDate(5, new java.sql.Date(kembaliDate.getTime()));
            } else {
                System.out.println("Please select valid dates.");
                return;
            }

            preparedStatement.setDouble(6, Double.parseDouble(txttotalharga.getText()));

            int rowsInserted = preparedStatement.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Transaksi Berhasil!");
                System.out.println("Data berhasil ditambahkan ke tabel transaksi.");
                Transaksi transaksi = new Transaksi();
                transaksi.setVisible(true);
                this.setVisible(false);
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
    }//GEN-LAST:event_btloginActionPerformed

    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
        LandingPage lp = new LandingPage();
        lp.setSize(1181, 700);
        lp.setResizable(false);
        lp.setVisible(true);
        lp.setExtendedState(JFrame.NORMAL);
        this.dispose();
    }//GEN-LAST:event_btkeluarActionPerformed
    public void propertyChange(PropertyChangeEvent evt) {
        updateDateDifference();
    }

    private class DateChangeListener implements PropertyChangeListener {

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            updateDateDifference();
        }
    }

    private void updateDateDifference() {
        java.util.Date sewaDate = sewa.getDate();
        java.util.Date kembaliDate = kembali.getDate();

        if (sewaDate != null && kembaliDate != null) {
            long diffInMillis = kembaliDate.getTime() + 1 - sewaDate.getTime();
            long diffInDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
            txtdurasisewa.setText(String.valueOf(diffInDays));
        } else {
            txtdurasisewa.setText("");
        }
    }

    private void updateHarga() {
        String noPlatMobil = txtnoplatmobil.getText();
        Connection conn = null;
        if (noPlatMobil.isEmpty()) {
            return;
        }

        try {

            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/dbrental";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            String query = "SELECT hargaMobil FROM tbmobil WHERE noPlatMobil = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, noPlatMobil);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                double hargaMobil = rs.getDouble("hargaMobil");
                String diffText = txtdurasisewa.getText();
                if (!diffText.isEmpty()) {
                    long diffInDays = Long.parseLong(diffText);
                    double totalHarga = hargaMobil * diffInDays;
                    txttotalharga.setText(String.valueOf(totalHarga));
                } else {
                    txttotalharga.setText("");
                }
            } else {
                txttotalharga.setText("No Plat Not Found");
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            txttotalharga.setText("Error");
        }
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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btlogin;
    private javax.swing.JLabel durasisewa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser kembali;
    private javax.swing.JLabel merkmobil;
    private javax.swing.JLabel nik;
    private com.toedter.calendar.JDateChooser sewa;
    private javax.swing.JTextField txtdurasisewa;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtnoplatmobil;
    private javax.swing.JTextField txttotalharga;
    // End of variables declaration//GEN-END:variables
}
