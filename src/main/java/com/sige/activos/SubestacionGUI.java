/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sige.activos;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


/**
 *
 * @author daveybtw
 */
public class SubestacionGUI extends javax.swing.JFrame {

    ArrayList<JTextField> Components = new ArrayList<JTextField>();
    ControlSubestacion controlador = new ControlSubestacion();
    public SubestacionGUI() {
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(100, 30);
        FrameDragListener frameDragListener = new FrameDragListener(this);
        this.addMouseListener(frameDragListener);
        this.addMouseMotionListener(frameDragListener);
        initComponents();
        Components.add(text_encargado);
        Components.add(text_ciudad);
        Components.add(text_direccion);
        changeBorders(Components);
        // ---------------------------------------------
        
        // ----------------------------------------------
    }
    
    public void changeBorders(ArrayList<JTextField> Componentes){
        for(int i = 0; i < Componentes.size(); i++){
            Componentes.get(i).setBorder(BorderFactory.createCompoundBorder(
            Componentes.get(i).getBorder(), 
            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
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

        left_menu = new javax.swing.JPanel();
        left_footer = new javax.swing.JPanel();
        left_header = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        left_options = new javax.swing.JPanel();
        registrar_usuarios = new javax.swing.JLabel();
        inicio_left = new javax.swing.JLabel();
        modificar_left = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        min_btn = new javax.swing.JLabel();
        cls_btn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        content_panel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_encargado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_ciudad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        text_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combo_estado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btn_registro = new javax.swing.JLabel();
        Cerrar_Sesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 254));
        setUndecorated(true);
        setResizable(false);

        left_menu.setBackground(new java.awt.Color(50, 55, 61));
        left_menu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));

        left_footer.setBackground(new java.awt.Color(50, 55, 61));
        left_footer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout left_footerLayout = new javax.swing.GroupLayout(left_footer);
        left_footer.setLayout(left_footerLayout);
        left_footerLayout.setHorizontalGroup(
            left_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        left_footerLayout.setVerticalGroup(
            left_footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ds_ims/avatar.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(1, 1, 1));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ds_ims/bg_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout left_headerLayout = new javax.swing.GroupLayout(left_header);
        left_header.setLayout(left_headerLayout);
        left_headerLayout.setHorizontalGroup(
            left_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(left_headerLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        left_headerLayout.setVerticalGroup(
            left_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_headerLayout.createSequentialGroup()
                .addGroup(left_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(left_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(left_headerLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9))))
        );

        left_options.setBackground(new java.awt.Color(50, 55, 61));

        registrar_usuarios.setForeground(new java.awt.Color(254, 254, 254));
        registrar_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrar_usuarios.setText("Registrar usuarios");
        registrar_usuarios.setAlignmentX(0.6F);
        registrar_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registrar_usuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrar_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrar_usuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrar_usuariosMouseExited(evt);
            }
        });

        inicio_left.setForeground(new java.awt.Color(254, 254, 254));
        inicio_left.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio_left.setText("Inicio");
        inicio_left.setAlignmentX(0.6F);
        inicio_left.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inicio_left.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inicio_left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inicio_leftMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inicio_leftMouseExited(evt);
            }
        });

        modificar_left.setForeground(new java.awt.Color(254, 254, 254));
        modificar_left.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificar_left.setText("Modificar usuarios");
        modificar_left.setAlignmentX(0.6F);
        modificar_left.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        modificar_left.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modificar_left.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificar_leftMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificar_leftMouseExited(evt);
            }
        });

        javax.swing.GroupLayout left_optionsLayout = new javax.swing.GroupLayout(left_options);
        left_options.setLayout(left_optionsLayout);
        left_optionsLayout.setHorizontalGroup(
            left_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio_left, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(modificar_left, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(registrar_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        left_optionsLayout.setVerticalGroup(
            left_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_optionsLayout.createSequentialGroup()
                .addComponent(inicio_left, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(modificar_left, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(registrar_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout left_menuLayout = new javax.swing.GroupLayout(left_menu);
        left_menu.setLayout(left_menuLayout);
        left_menuLayout.setHorizontalGroup(
            left_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left_header, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(left_options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(left_footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        left_menuLayout.setVerticalGroup(
            left_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_menuLayout.createSequentialGroup()
                .addComponent(left_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(left_options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(left_footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(50, 55, 61));
        jPanel8.setBorder(new javax.swing.border.MatteBorder(null));

        min_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ds_ims/btn_minimize.png"))); // NOI18N
        min_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                min_btnMouseClicked(evt);
            }
        });

        cls_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ds_ims/btn_close.png"))); // NOI18N
        cls_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cls_btnMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SiGE");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(559, 559, 559)
                .addComponent(jLabel2)
                .addGap(459, 459, 459)
                .addComponent(min_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cls_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(min_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(cls_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        content_panel.setBackground(java.awt.Color.white);
        content_panel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));

        Title.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Title.setText("Adicion de nuevas subestaciones de energia");

        jLabel3.setText("Documento del encargado");

        text_encargado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Ciudad donde se encuentra la subestacion");

        text_ciudad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Direccion donde se encuentra la subestacion");

        text_direccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Estado de la subestacion");

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registrar subestacion");

        btn_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ds_ims/button.png"))); // NOI18N
        btn_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout content_panelLayout = new javax.swing.GroupLayout(content_panel);
        content_panel.setLayout(content_panelLayout);
        content_panelLayout.setHorizontalGroup(
            content_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_panelLayout.createSequentialGroup()
                .addGroup(content_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(content_panelLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(Title))
                    .addGroup(content_panelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3)
                        .addGap(230, 230, 230)
                        .addComponent(jLabel6))
                    .addGroup(content_panelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(text_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(content_panelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4))
                    .addGroup(content_panelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(text_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(content_panelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel5))
                    .addGroup(content_panelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(text_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(content_panelLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(btn_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(content_panelLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel7)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        content_panelLayout.setVerticalGroup(
            content_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content_panelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Title)
                .addGap(33, 33, 33)
                .addGroup(content_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(1, 1, 1)
                .addGroup(content_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_encargado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(text_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(text_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btn_registro)
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        Cerrar_Sesion.setBackground(new java.awt.Color(254, 254, 254));
        Cerrar_Sesion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cerrar_Sesion.setForeground(new java.awt.Color(254, 254, 254));
        Cerrar_Sesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar_Sesion.setText("Cerrar Sesion");
        Cerrar_Sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cerrar_Sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cerrar_SesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cerrar_SesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cerrar_SesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(left_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Cerrar_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(content_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(left_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(content_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrar_usuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrar_usuariosMouseEntered
        registrar_usuarios.setOpaque(true);
        registrar_usuarios.setBackground(new Color(2, 143, 224));// TODO add your handling code here:
    }//GEN-LAST:event_registrar_usuariosMouseEntered

    private void registrar_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrar_usuariosMouseExited
        registrar_usuarios.setOpaque(false);
        registrar_usuarios.setBackground(new Color(50,55,61));// TODO add your handling code here:
    }//GEN-LAST:event_registrar_usuariosMouseExited

    private void inicio_leftMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_leftMouseEntered
        inicio_left.setOpaque(true);
        inicio_left.setBackground(new Color(2, 143, 224));// TODO add your handling code here:
    }//GEN-LAST:event_inicio_leftMouseEntered

    private void inicio_leftMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicio_leftMouseExited
        inicio_left.setOpaque(false);
        inicio_left.setBackground(new Color(50,55,61));// TODO add your handling code here:
    }//GEN-LAST:event_inicio_leftMouseExited

    private void modificar_leftMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_leftMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_leftMouseEntered

    private void modificar_leftMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_leftMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_leftMouseExited

    private void cls_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cls_btnMouseClicked
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_cls_btnMouseClicked

    private void Cerrar_SesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar_SesionMouseExited
        Cerrar_Sesion.setOpaque(false);
        Cerrar_Sesion.setBackground(new Color(50,55,61));
        // TODO add your handling code here:
    }//GEN-LAST:event_Cerrar_SesionMouseExited

    private void Cerrar_SesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar_SesionMouseEntered

        Cerrar_Sesion.setOpaque(true);
        Cerrar_Sesion.setBackground(new Color(2, 143, 224));
    }//GEN-LAST:event_Cerrar_SesionMouseEntered

    private void Cerrar_SesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cerrar_SesionMouseClicked
        this.dispose();
    }//GEN-LAST:event_Cerrar_SesionMouseClicked

    private void min_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min_btnMouseClicked
        this.setState(JFrame.ICONIFIED);// TODO add your handling code here:
    }//GEN-LAST:event_min_btnMouseClicked

    private void btn_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registroMouseClicked
        switch(controlador.createNewSubestacion(Components, text_encargado.getText(), text_ciudad.getText(), text_direccion.getText(), String.valueOf(combo_estado.getSelectedItem()))){
            case 0:
                JOptionPane.showMessageDialog(this, "Fallo la creacion de la nueva subestacion");
                break;
            case 1:
                JOptionPane.showMessageDialog(this, "Creacion de la subestacion completa");
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Llene todos los campos e intente nuevamente");
                break;
            case 3:
                JOptionPane.showMessageDialog(this, "El campo 'Documento del encargado' debe ser llenado unicamente con numeros");
                break;
        }
    }//GEN-LAST:event_btn_registroMouseClicked

    
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
            java.util.logging.Logger.getLogger(SubestacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubestacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubestacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubestacionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new SubestacionGUI().setVisible(true);
            }
        });
    }
    
    public static class FrameDragListener extends MouseAdapter {

        private final JFrame frame;
        private Point mouseDownCompCoords = null;

        public FrameDragListener(JFrame frame) {
            this.frame = frame;
        }

        public void mouseReleased(MouseEvent e) {
            mouseDownCompCoords = null;
        }

        public void mousePressed(MouseEvent e) {
            mouseDownCompCoords = e.getPoint();
        }

        public void mouseDragged(MouseEvent e) {
            Point currCoords = e.getLocationOnScreen();
            frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar_Sesion;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel btn_registro;
    private javax.swing.JLabel cls_btn;
    private javax.swing.JComboBox<String> combo_estado;
    private javax.swing.JPanel content_panel;
    private javax.swing.JLabel inicio_left;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel left_footer;
    private javax.swing.JPanel left_header;
    private javax.swing.JPanel left_menu;
    private javax.swing.JPanel left_options;
    private javax.swing.JLabel min_btn;
    private javax.swing.JLabel modificar_left;
    private javax.swing.JLabel registrar_usuarios;
    private javax.swing.JTextField text_ciudad;
    private javax.swing.JTextField text_direccion;
    private javax.swing.JTextField text_encargado;
    // End of variables declaration//GEN-END:variables
}