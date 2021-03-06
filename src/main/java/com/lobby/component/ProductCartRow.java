/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lobby.component;

import javax.swing.JLabel;

/**
 *
 * @author tri.tran
 */
public class ProductCartRow extends javax.swing.JPanel {

    /**
     * Creates new form ProductCartRow
     */
    public ProductCartRow() {
        initComponents();
    }

    public JLabel getDeleteLbl() {
        return deleteLbl;
    }

    public void setDeleteLbl(JLabel deleteLbl) {
        this.deleteLbl = deleteLbl;
    }

    public JLabel getPriceLbl() {
        return priceLbl;
    }

    public void setPriceLbl(JLabel priceLbl) {
        this.priceLbl = priceLbl;
    }

    public JLabel getProductNameLbl() {
        return productNameLbl;
    }

    public void setProductNameLbl(JLabel productNameLbl) {
        this.productNameLbl = productNameLbl;
    }

    public JLabel getQuantityLbl() {
        return quantityLbl;
    }

    public void setQuantityLbl(JLabel quantityLbl) {
        this.quantityLbl = quantityLbl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productNameLbl = new javax.swing.JLabel();
        quantityLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        deleteLbl = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        setMaximumSize(new java.awt.Dimension(329, 35));
        setMinimumSize(new java.awt.Dimension(329, 35));
        setPreferredSize(new java.awt.Dimension(329, 35));

        productNameLbl.setText("jLabel1");

        quantityLbl.setText("jLabel2");

        priceLbl.setText("jLabel3");

        deleteLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_search.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quantityLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteLbl)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameLbl)
                    .addComponent(quantityLbl)
                    .addComponent(priceLbl)
                    .addComponent(deleteLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deleteLbl;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JLabel productNameLbl;
    private javax.swing.JLabel quantityLbl;
    // End of variables declaration//GEN-END:variables
}
