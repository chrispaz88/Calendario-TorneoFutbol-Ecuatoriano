/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import calendariotorneo.Musica;
import calendariotorneo.Torneo;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author dell
 */
public class jFCalendario extends javax.swing.JFrame {

    Torneo calendarioTorneo;
    DefaultTableModel dtmTablaPosiciones;
    FondoAgencia fondoe = new FondoAgencia();
    Musica musica = new Musica();

    public jFCalendario() {
        this.setContentPane(fondoe);
        initComponents();
        calendarioTorneo = new Torneo();
        dtmTablaPosiciones = new DefaultTableModel();
        crearColumnas(dtmTablaPosiciones);
        actualizarTablaPosiciones();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("LIGA PRO");
        this.jBJugar2Fase.setVisible(false);
        this.jBMostrar2fase.setVisible(false);   
        //musica.playMusica();
    }
    
  
    public void crearColumnas(DefaultTableModel dtmTabla){
        dtmTabla.addColumn("Club");
        dtmTabla.addColumn("PJ");
        dtmTabla.addColumn("PG");
        dtmTabla.addColumn("PE");
        dtmTabla.addColumn("PP");
        dtmTabla.addColumn("GF");
        dtmTabla.addColumn("GC");
        dtmTabla.addColumn("DG");
        dtmTabla.addColumn("PTS");      
    }
    //Actulizar Tabla
    public void actualizarTablaPosiciones(){
    DefaultTableModel dtmTablaPosicionesAux = new DefaultTableModel();
    crearColumnas(dtmTablaPosicionesAux);
    for (int i = 0; i < calendarioTorneo.tablaPosiciones.length; i++) {
            dtmTablaPosicionesAux.addRow(new Object[]{calendarioTorneo.tablaPosiciones[i][0],
            calendarioTorneo.tablaPosiciones[i][1],calendarioTorneo.tablaPosiciones[i][2],
            calendarioTorneo.tablaPosiciones[i][3],calendarioTorneo.tablaPosiciones[i][4],
            calendarioTorneo.tablaPosiciones[i][5],calendarioTorneo.tablaPosiciones[i][6],
            calendarioTorneo.tablaPosiciones[i][7],calendarioTorneo.tablaPosiciones[i][8],});        
        }
        this.jTable1.setModel(dtmTablaPosicionesAux);
    }
    
    class FondoAgencia extends JPanel {
         private Image fondoAgencia;
        @Override
        public void paint(Graphics g) {
        fondoAgencia = new ImageIcon(getClass().getResource("/Imagen/FondoFutbol.jpg")).getImage();
        g.drawImage(fondoAgencia, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
        }
}
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBJugar1Partido = new javax.swing.JButton();
        jBJugarTodosPartidos = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAMostrarJornada = new javax.swing.JTextArea();
        JBMostrarFechas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBMostrar2fase = new javax.swing.JButton();
        jBJugar2Fase = new javax.swing.JButton();
        iconoLiga = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setForeground(new java.awt.Color(51, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setEnabled(false);
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 780, 290));

        jBJugar1Partido.setText("JUGAR UNA FECHA");
        jBJugar1Partido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJugar1PartidoActionPerformed(evt);
            }
        });
        getContentPane().add(jBJugar1Partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 180, -1));

        jBJugarTodosPartidos.setText("JUGAR TODOS PARTIDOS");
        jBJugarTodosPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJugarTodosPartidosActionPerformed(evt);
            }
        });
        getContentPane().add(jBJugarTodosPartidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 180, -1));

        jBNuevo.setText("NUEVO");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jBNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTAMostrarJornada.setEditable(false);
        jTAMostrarJornada.setColumns(20);
        jTAMostrarJornada.setRows(5);
        jTAMostrarJornada.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTAMostrarJornada);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 360, 280));

        JBMostrarFechas.setText("MOSTRAR SIGUIENTE FECHA");
        JBMostrarFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMostrarFechasActionPerformed(evt);
            }
        });
        getContentPane().add(JBMostrarFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 180, -1));

        jLabel1.setBackground(java.awt.SystemColor.textHighlightText);
        jLabel1.setFont(new java.awt.Font("Stencil Std", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("LIGA ECUATORIANA DE FUTBOL ");
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Stencil Std", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("TABLA DE POSICIONES");
        jLabel2.setFocusable(false);
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, -1, -1));

        jBMostrar2fase.setText("MOSTRAR SEGUNDA FASE");
        jBMostrar2fase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrar2faseActionPerformed(evt);
            }
        });
        getContentPane().add(jBMostrar2fase, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 180, -1));

        jBJugar2Fase.setText("JUGAR SEGUNDA FASE");
        jBJugar2Fase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJugar2FaseActionPerformed(evt);
            }
        });
        getContentPane().add(jBJugar2Fase, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 180, -1));

        iconoLiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/LigaPro2.png"))); // NOI18N
        iconoLiga.setMaximumSize(new java.awt.Dimension(100, 100));
        iconoLiga.setMinimumSize(new java.awt.Dimension(100, 100));
        getContentPane().add(iconoLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 130, 130));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Frankz Alarcón, Jonathan Amagua, Christian Pazmiño   ");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/epn.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jBJugar1PartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJugar1PartidoActionPerformed
        this.jTAMostrarJornada.setText(calendarioTorneo.jugarUnaFecha());
        actualizarTablaPosiciones();
        if(calendarioTorneo.numJornadas==15){
            jBJugar1Partido.setEnabled(false);
            JBMostrarFechas.setEnabled(false);
            jBMostrar2fase.setVisible(true);
            jBJugarTodosPartidos.setEnabled(false);
            calendarioTorneo.numJornadas=0;
        }
    }//GEN-LAST:event_jBJugar1PartidoActionPerformed

    private void jBJugarTodosPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJugarTodosPartidosActionPerformed
        this.jTAMostrarJornada.setText(calendarioTorneo.jugarTodasFechas());
        actualizarTablaPosiciones();
        this.JBMostrarFechas.setEnabled(false);
        this.jBMostrar2fase.setVisible(true);
        this.jBJugar1Partido.setEnabled(false);
        jBJugarTodosPartidos.setEnabled(false);
        calendarioTorneo.numJornadas=0;
    }//GEN-LAST:event_jBJugarTodosPartidosActionPerformed

    private void JBMostrarFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMostrarFechasActionPerformed
        // TODO add your handling code here:
       
        JOptionPane.showMessageDialog(null, calendarioTorneo.mostrarSiguienteFecha(), "Jornadas",0);
        
    }//GEN-LAST:event_JBMostrarFechasActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        calendarioTorneo = new Torneo();
        jTAMostrarJornada.setText("");
        this.JBMostrarFechas.setVisible(true);
        JBMostrarFechas.setEnabled(true);
        jBJugarTodosPartidos.setEnabled(true);
        jBMostrar2fase.setEnabled(true);
        this.jBJugar2Fase.setVisible(false);
        this.jBMostrar2fase.setVisible(false); 
        this.jBJugar1Partido.setEnabled(true);
        jBJugar2Fase.setEnabled(true);
        actualizarTablaPosiciones();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBMostrar2faseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrar2faseActionPerformed
        // TODO add your handling code here:
        jBJugar2Fase.setVisible(true);
        jBMostrar2fase.setEnabled(false);
        calendarioTorneo.encontrarFinalistas();
        jTAMostrarJornada.setText(calendarioTorneo.mostrarCuadrangular());
    }//GEN-LAST:event_jBMostrar2faseActionPerformed

    private void jBJugar2FaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJugar2FaseActionPerformed
        // TODO add your handling code here:
        jTAMostrarJornada.setText(jTAMostrarJornada.getText() + "\nSemifinal 1\n" + calendarioTorneo.jugarCruadrangular(0, 3) + "\n");
        jTAMostrarJornada.setText(jTAMostrarJornada.getText() + "\nSemifinal 2\n" + calendarioTorneo.jugarCruadrangular(1, 2) + "\n");
        jTAMostrarJornada.setText(jTAMostrarJornada.getText() + "\nFinal 3ro y 4to lugar\n" + calendarioTorneo.jugarCruadrangular(2, 3) + "\n");
        jTAMostrarJornada.setText(jTAMostrarJornada.getText() + "\n***** Gran Final *****\n" + calendarioTorneo.jugarCruadrangular(0, 1) + "\n");  
        Toolkit.getDefaultToolkit().beep(); //Sonido de Campana
        JOptionPane.showMessageDialog(null, "**** EL EQUIPO CAMPEÓN ES: " + calendarioTorneo.finalistas[0].getNombreEquipo() + " ****");
        jBJugar2Fase.setEnabled(false);
    }//GEN-LAST:event_jBJugar2FaseActionPerformed

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
            java.util.logging.Logger.getLogger(jFCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFCalendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFCalendario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBMostrarFechas;
    private javax.swing.JLabel iconoLiga;
    private javax.swing.JButton jBJugar1Partido;
    private javax.swing.JButton jBJugar2Fase;
    private javax.swing.JButton jBJugarTodosPartidos;
    private javax.swing.JButton jBMostrar2fase;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAMostrarJornada;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
