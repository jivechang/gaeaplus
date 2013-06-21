/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WfsPanel.java
 *
 * Created on Jun 21, 2013, 2:14:11 PM
 */
package si.xlab.gaea.core.examples;

import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author Marko
 */
public class WfsPanel extends javax.swing.JPanel
{
    private Color color = new Color(19, 158, 254);

    /** Creates new form WfsPanel */
    public WfsPanel()
    {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sectorGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serviceUrl = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        featureTypeName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sectorGlobal = new javax.swing.JRadioButton();
        sectorCustom = new javax.swing.JRadioButton();
        sectorLbl1 = new javax.swing.JLabel();
        sectorLatFrom = new javax.swing.JTextField();
        sectorLbl2 = new javax.swing.JLabel();
        sectorLatTo = new javax.swing.JTextField();
        sectorLbl3 = new javax.swing.JLabel();
        sectorLonFrom = new javax.swing.JTextField();
        sectorLbl4 = new javax.swing.JLabel();
        sectorLonTo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        maxDistance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tileDelta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnColor = new javax.swing.JButton();
        btnColor.setBackground(color);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Import WFS features"); // NOI18N

        jLabel2.setText("Service URL:"); // NOI18N

        serviceUrl.setText("http://gis.arso.gov.si/geoserver/ows"); // NOI18N

        jLabel3.setText("Feature type name:"); // NOI18N

        featureTypeName.setText("arso:MV_OPZ_KRT_POP_OBM_KAT"); // NOI18N

        jLabel4.setText("Sector:"); // NOI18N

        sectorGroup.add(sectorGlobal);
        sectorGlobal.setSelected(true);
        sectorGlobal.setText("Global"); // NOI18N
        sectorGlobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectorGlobalActionPerformed(evt);
            }
        });

        sectorGroup.add(sectorCustom);
        sectorCustom.setText("Custom:"); // NOI18N
        sectorCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectorCustomActionPerformed(evt);
            }
        });

        sectorLbl1.setText("Latitude  ->  From:"); // NOI18N
        sectorLbl1.setEnabled(false);

        sectorLatFrom.setText("45.1"); // NOI18N
        sectorLatFrom.setEnabled(false);

        sectorLbl2.setText("To:"); // NOI18N
        sectorLbl2.setEnabled(false);

        sectorLatTo.setText("46.9"); // NOI18N
        sectorLatTo.setEnabled(false);

        sectorLbl3.setText("Longitude  ->  From:"); // NOI18N
        sectorLbl3.setEnabled(false);

        sectorLonFrom.setText("13.3"); // NOI18N
        sectorLonFrom.setEnabled(false);

        sectorLbl4.setText("To:"); // NOI18N
        sectorLbl4.setEnabled(false);

        sectorLonTo.setText("16.6"); // NOI18N
        sectorLonTo.setEnabled(false);

        jLabel9.setText("Max visible distance [km]:"); // NOI18N

        maxDistance.setText("200"); // NOI18N

        jLabel5.setText("Tile delta [degrees]:"); // NOI18N

        tileDelta.setText("0.3"); // NOI18N

        jLabel6.setText("Color:"); // NOI18N

        btnOk.setText("OK"); // NOI18N

        btnCancel.setText("Cancel"); // NOI18N

        btnColor.setText(" "); // NOI18N
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serviceUrl, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(featureTypeName, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(sectorGlobal)
                    .addComponent(sectorCustom)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sectorLbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sectorLatFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sectorLbl2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sectorLatTo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sectorLbl3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(maxDistance, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sectorLonFrom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(tileDelta, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sectorLbl4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sectorLonTo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(serviceUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(featureTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sectorGlobal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sectorCustom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectorLbl1)
                    .addComponent(sectorLatFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectorLbl2)
                    .addComponent(sectorLatTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectorLbl3)
                    .addComponent(sectorLonFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectorLbl4)
                    .addComponent(sectorLonTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(maxDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tileDelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sectorCustomActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sectorCustomActionPerformed
    {//GEN-HEADEREND:event_sectorCustomActionPerformed
        if (sectorCustom.isSelected()) {
            sectorLatFrom.setEnabled(true);
            sectorLatTo.setEnabled(true);
            sectorLonFrom.setEnabled(true);
            sectorLonTo.setEnabled(true);
            sectorLbl1.setEnabled(true);
            sectorLbl2.setEnabled(true);
            sectorLbl3.setEnabled(true);
            sectorLbl4.setEnabled(true);
        }
    }//GEN-LAST:event_sectorCustomActionPerformed

    private void sectorGlobalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sectorGlobalActionPerformed
    {//GEN-HEADEREND:event_sectorGlobalActionPerformed
        if (sectorGlobal.isSelected()) {
            sectorLatFrom.setEnabled(false);
            sectorLatTo.setEnabled(false);
            sectorLonFrom.setEnabled(false);
            sectorLonTo.setEnabled(false);
            sectorLbl1.setEnabled(false);
            sectorLbl2.setEnabled(false);
            sectorLbl3.setEnabled(false);
            sectorLbl4.setEnabled(false);
        }
    }//GEN-LAST:event_sectorGlobalActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnColorActionPerformed
    {//GEN-HEADEREND:event_btnColorActionPerformed
        Color c = JColorChooser.showDialog(WfsPanel.this, "Choose layer color", color);
        if (c != null) {
            this.color = c;
            btnColor.setBackground(c);
        }
    }//GEN-LAST:event_btnColorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnOk;
    private javax.swing.JTextField featureTypeName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField maxDistance;
    private javax.swing.JRadioButton sectorCustom;
    private javax.swing.JRadioButton sectorGlobal;
    private javax.swing.ButtonGroup sectorGroup;
    private javax.swing.JTextField sectorLatFrom;
    private javax.swing.JTextField sectorLatTo;
    private javax.swing.JLabel sectorLbl1;
    private javax.swing.JLabel sectorLbl2;
    private javax.swing.JLabel sectorLbl3;
    private javax.swing.JLabel sectorLbl4;
    private javax.swing.JTextField sectorLonFrom;
    private javax.swing.JTextField sectorLonTo;
    private javax.swing.JTextField serviceUrl;
    private javax.swing.JTextField tileDelta;
    // End of variables declaration//GEN-END:variables
}
