
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jsant
 */

public class Interfaz extends javax.swing.JFrame {

    public static String img1 = "src/Imagenes/Arenita Ruleta.png";
    public static String img2 = "src/Imagenes/Bob Ruleta.png";
    public static String img3 = "src/Imagenes/Calamardo Ruleta.png";
    public static String img4 = "src/Imagenes/Formula Ruleta.png";
    public static String img5 = "src/Imagenes/Gary Ruleta.png";
    public static String img6 = "src/Imagenes/Patricio Ruleta.png";
    Imagen1 hilo1 = new Imagen1();
    Imagen2 hilo2 = new Imagen2();
    Imagen3 hilo3 = new Imagen3();
    int z=0;
    
    public Interfaz() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        jLabel1.setIcon(new ImageIcon(img1));
        jLabel2.setIcon(new ImageIcon(img2));
        jLabel3.setIcon(new ImageIcon(img3));
       
    }
    
    public class Imagen1 extends Thread{
        boolean activo = true;
        int c;
        
        @Override
        public void run(){
            Random img = new Random();
            int i;
            Random tiem = new Random();
            int tiempo = 0;
   
            while(activo == true){
                i = img.nextInt(6)+1;
                tiempo=tiem.nextInt(100);
               
                if(i == 1){
                    jLabel1.setIcon(new ImageIcon(img1));
                    c = 1;
                }
                if(i == 2){
                    jLabel1.setIcon(new ImageIcon(img2));
                    
                    c = 2;
                }
                if(i == 3){
                    jLabel1.setIcon(new ImageIcon(img3));
                    c = 3;
                }
                if(i == 4){
                    jLabel1.setIcon(new ImageIcon(img4));
                    c = 4;
                }
                if(i == 5){
                    jLabel1.setIcon(new ImageIcon(img5));
                    c = 5;
                }
                 if(i == 6){
                    jLabel1.setIcon(new ImageIcon(img6));
                    c = 6;
                }
                try{
                    sleep(tiempo);
                }catch(InterruptedException e){}
            }
        }
    }
    
    public class Imagen2 extends Thread{
        boolean activo=true;
        Random img = new Random();
        Random tiem = new Random();
        int i=0;
        int tiempo=0;
        int c=0;
        
        @Override
        public void run(){
            while(activo==true){
                i=img.nextInt(6)+1;
                tiempo=tiem.nextInt(100);
                
                if(i==1){
                    jLabel2.setIcon(new ImageIcon(img1));
                    c = 1;
                }
                if(i==2){
                    jLabel2.setIcon(new ImageIcon(img2));
                    c = 2;
                }
                if(i==3){
                    jLabel2.setIcon(new ImageIcon(img3));
                    c = 3;
                }
                if(i==4){
                    jLabel2.setIcon(new ImageIcon(img4));
                    c = 4;
                }
                if(i==5){
                    jLabel2.setIcon(new ImageIcon(img5));
                    c = 5;
                }
                 if(i == 6){
                    jLabel2.setIcon(new ImageIcon(img6));
                    c = 6;
                }
                try{
                    sleep(tiempo);
                }catch(InterruptedException e){}
            }
        }
    }
    
    public class Imagen3 extends Thread{
        boolean activo=true;
        Random img = new Random();
        Random tiem = new Random();
        int i=0;
        int tiempo=0;
        int c=0;
        
        @Override
        public void run(){
            while(activo==true){
                i=img.nextInt(6)+1;
                tiempo=tiem.nextInt(100);
                
                if(i == 1){
                    jLabel3.setIcon(new ImageIcon(img1));
                    c = 1;
                }
                if(i==2){
                    jLabel3.setIcon(new ImageIcon(img2));
                    c = 2;
                }
                if(i==3){
                    jLabel3.setIcon(new ImageIcon(img3));
                    c = 3;
                }
                if(i==4){
                    jLabel3.setIcon(new ImageIcon(img4));
                    c =4;
                }
                if(i==5){
                    jLabel3.setIcon(new ImageIcon(img5));;
                    c = 5;
                }
                 if(i == 6){
                    jLabel3.setIcon(new ImageIcon(img6));
                    c = 6;
                }
                try{
                    sleep(tiempo);
                }catch(InterruptedException e){}
            }
        }
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 100, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 200)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Arenita Ruleta.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 240, 260));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 200)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bob Ruleta.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 200)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gary Ruleta.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 240, 270));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BOTON MEDUSA.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 200, 80));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BOTON MEDUSA.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 200, 80));

        jButton5.setBackground(new java.awt.Color(0, 255, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Iniciar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 710, 130, 50));

        jButton6.setBackground(new java.awt.Color(0, 0, 51));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Detener");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, 130, 50));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BOTON MEDUSA.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 200, 80));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrustacioC.jpg"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here
        if(hilo1.isAlive() == false){
            if(hilo2.isAlive() == false){
                if(hilo3.isAlive() == false){
                    hilo1 = new Imagen1();
                    hilo2 = new Imagen2();
                    hilo3 = new Imagen3();
                    hilo1.activo=true;
                    hilo2.activo=true;
                    hilo3.activo=true;
                    hilo1.start();
                    hilo2.start();
                    hilo3.start();
                    z=1;
                }
            }
        }
  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(z==1){
            hilo1.activo=false;
            hilo2.activo=false;
            hilo3.activo=false;
            if(hilo1.c == hilo2.c){
                if(hilo2.c == hilo3.c){
                    JOptionPane.showMessageDialog(Interfaz.this," FELICIDADES, GANADOR!!!");
                }
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        hilo1.activo=false;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        hilo2.activo=false;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        hilo3.activo=false;
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelfondo;
    // End of variables declaration//GEN-END:variables
}