package ventanas;

import java.sql.*;
import clases.Conexion;
import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Registro_Usuario extends javax.swing.JFrame {

    String user;

    public Registro_Usuario() {
        initComponents();
        setSize(612, 382);
        setLocationRelativeTo(null);
        setResizable(false);
        user = Login.user;
        setTitle("Registro de Nuevo Usuario - Sesion de " + user);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
//sirve para cerrar solo la actual interfaz y dejar la anterior. así evitamos q se cierren todas las interf. 
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel_footer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cmb_niveles = new javax.swing.JComboBox<>();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel5.setBackground(new java.awt.Color(153, 153, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Permisos de:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jLabel7.setBackground(new java.awt.Color(153, 153, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, 30));

        txt_email.setBackground(new java.awt.Color(153, 153, 255));
        txt_email.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 240, 30));

        txt_telefono.setBackground(new java.awt.Color(153, 153, 255));
        txt_telefono.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 240, 30));

        txt_username.setBackground(new java.awt.Color(153, 153, 255));
        txt_username.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 240, 30));

        txt_password.setBackground(new java.awt.Color(153, 153, 255));
        txt_password.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 240, 30));

        jLabel_footer.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel_footer.setText("Creado por Luna Fabio");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 120, 100));

        cmb_niveles.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capturista", "Tecnico" }));
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//creamos var. para guardar lo q tenga cada txt_field.
        int permisos_cmb, validacion = 0;//la var. validacion sirve como var. bandera.
        String nombre, email, telefono, username, pass, permisos_string = "";

        nombre = txt_nombre.getText().trim();
        email = txt_email.getText().trim();
        telefono = txt_telefono.getText().trim();
        username = txt_username.getText().trim();
        pass = txt_password.getText().trim();
//guardamos en la var. la seleccion del indice de combobox y le vamos sumando 1 a las selecciones.
        permisos_cmb = cmb_niveles.getSelectedIndex() + 1;
//si las var. estan vacias se pintaran de rojo.
        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
//más adelante usaremos a esta var. como una condicion para q el program se siga ejecutando.
            validacion++;
        }
        if (email.equals("")) {
            txt_email.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);
            validacion++;
        }
        if (username.equals("")) {
            txt_username.setBackground(Color.red);
            validacion++;
        }
        if (pass.equals("")) {
            txt_password.setBackground(Color.red);
            validacion++;
        }
//si la var. es igaul a 1 entonces se guardará en la var. permiso_string la palabra "Administrador"
//es importante q escribamos bien la palabra ya q esta palabra irá luego a la bd.
        if (permisos_cmb == 1) {
            permisos_string = "Administrador";
        } else if (permisos_cmb == 2) {
            permisos_string = "Capturista";
        } else if (permisos_cmb == 3) {
            permisos_string = "Tecnico";
        }
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select username from usuarios where username = '" + username + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
//se pintará el txt_u. ya q el username es el mismo q esta en la bd.
                txt_username.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible.");
                cn.close();//cierre de conexion.
            } else {
                cn.close();
//esto signif. q no hubo ningun campo de texto vacio por eso pasamos a esta estruct. conficional.
                if (validacion == 0) {
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement(
//los ??? es xq no sabes q valores insertaremos dentro de los campos de la tabla. hasta el paso siguiente.
                                "insert into usuarios values (?,?,?,?,?,?,?,?,?)");
//estos valores irán en cada campo de la tabla.
                        pst2.setInt(1, 0);
                        pst2.setString(2, nombre);
                        pst2.setString(3, email);
                        pst2.setString(4, telefono);
                        pst2.setString(5, username);
                        pst2.setString(6, pass);
                        pst2.setString(7, permisos_string);
                        pst2.setString(8, "Activo");
                        pst2.setString(9, user);

                        pst2.executeUpdate();//ejecutar actualizacion
                        cn2.close();
//creamos este metod. para limpiar los txt_filed. A este metod lo programamos al final de estas lineas de codigo.
                        Limpiar();
//si todo esta correcto pintamos d verde los txt_field
                        txt_email.setBackground(Color.GREEN);
                        txt_nombre.setBackground(Color.GREEN);
                        txt_password.setBackground(Color.GREEN);
                        txt_telefono.setBackground(Color.GREEN);
                        txt_username.setBackground(Color.GREEN);

                        JOptionPane.showMessageDialog(null, "Registro exitoso.");
//la palabra reservada this junto al metod. hacen q se cierre la interfaz luego de registrar un usuario new.
                        this.dispose();

                    } catch (SQLException e) {
                        System.err.println("ERROR al registrar usuario." + e);
                        JOptionPane.showMessageDialog(null, "ERROR al Registrar Usuario. Contacte al administrador.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
                }
            }
        } catch (SQLException e) {
            System.err.println("ERROR en validar nombre de usuario. " + e);
            JOptionPane.showMessageDialog(null, "Error al comparar usuario, contacte al administrador");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
//es el metodo q creamos para limpirar los txt_field.
    public void Limpiar() {
        txt_email.setText("");
        txt_nombre.setText("");
        txt_password.setText("");
        txt_telefono.setText("");
        txt_username.setText("");
//seleccionamos del combobox el inice q queremos q se coloque luego de registar user 
        cmb_niveles.setSelectedIndex(0);
    }
}