/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda;

/**
 *
 * @author dydej
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        try{
            //dataSource ����
            
            
            
            dWCombineTable2.setDataSource("ORACLE_YOUNGRACLE");
            
            dWCombineTable2.select("http", "192.168.0.74", 8081);
            
            //dWCombineTable3.select("http", "192.168.0.74", 8081);
            //rowCount = dWCombineTable2.selectTotalRowCount("http", "192.168.0.20", 8080);
        }catch(Exception e){
            System.err.println(e);
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

        dWCombineTable2 = new com.arisystem.beans.combinetable.DWCombineTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dWCombineTable2.setBodyRenderer(new com.arisystem.beans.combinetable.BodyRenderer( new com.arisystem.beans.combinetable.BodyCombineCell[] {
            new com.arisystem.beans.combinetable.BodyCombineCell("__ROW_STATUS__", new com.arisystem.beans.combinetable.CellInfo(0,0), new com.arisystem.beans.combinetable.CellInfo(0,0), null, com.arisystem.beans.combinetable.CombineCell.LEFT_ALIGNMENT, com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null, null, null, "com.arisystem.beans.datawizard.DWStatusCombineCellEditor", "com.arisystem.beans.datawizard.DWStatusCombineCellPainter",null),
            new com.arisystem.beans.combinetable.BodyCombineCell("NOTEST", new com.arisystem.beans.combinetable.CellInfo(1,0), new com.arisystem.beans.combinetable.CellInfo(1,0), null, com.arisystem.beans.combinetable.CombineCell.RIGHT_ALIGNMENT, com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null, null, null, "com.arisystem.beans.combinetable.NumberCombineCellEditor", "com.arisystem.beans.combinetable.NumberCombineCellPainter",null),
            new com.arisystem.beans.combinetable.BodyCombineCell("DATATEST", new com.arisystem.beans.combinetable.CellInfo(2,0), new com.arisystem.beans.combinetable.CellInfo(2,0), null, com.arisystem.beans.combinetable.CombineCell.LEFT_ALIGNMENT, com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null, null, null, "com.arisystem.beans.combinetable.StringCombineCellEditor", "",null),
        }));
        dWCombineTable2.setCellWidths(new int[] {162, 162, 162, 162, 146});
        dWCombineTable2.setErdObjectLocations(new com.arisystem.beans.datawizard.DWErdObjectLocation[]{new com.arisystem.beans.datawizard.DWErdObjectLocation("TESTTABLE",30,0)});
        dWCombineTable2.setGroupBy("");
        dWCombineTable2.setHeaderRenderer(new com.arisystem.beans.combinetable.HeaderRenderer( new com.arisystem.beans.combinetable.HeaderCombineCell[] {
            new com.arisystem.beans.combinetable.HeaderCombineCell("__ROW_STATUS__",new com.arisystem.beans.combinetable.CellInfo(0,0),new com.arisystem.beans.combinetable.CellInfo(0,0),null,com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT,com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null,null,null,"com.arisystem.beans.combinetable.CheckBoxCombineCellPainter",null),
            new com.arisystem.beans.combinetable.HeaderCombineCell("NOTEST",new com.arisystem.beans.combinetable.CellInfo(1,0),new com.arisystem.beans.combinetable.CellInfo(1,0),"NOTEST",com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT,com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null,null,null,"",null),
            new com.arisystem.beans.combinetable.HeaderCombineCell("DATATEST",new com.arisystem.beans.combinetable.CellInfo(2,0),new com.arisystem.beans.combinetable.CellInfo(2,0),"DATATEST",com.arisystem.beans.combinetable.CombineCell.CENTER_ALIGNMENT,com.arisystem.beans.combinetable.CombineCell.HORIZONTAL,null,null,null,"",null),
        }));
        dWCombineTable2.setJoinConditions(new com.arisystem.beans.datawizard.DWJoinCondition[] {
            new com.arisystem.beans.datawizard.DWNotJoinCondition(new com.arisystem.beans.datawizard.DWTable("YOUNGRACLE","TESTTABLE","TESTTABLE"))});
    dWCombineTable2.setMainTable(new com.arisystem.beans.datawizard.DWTable("YOUNGRACLE","TESTTABLE","TESTTABLE"));
    dWCombineTable2.setOrderBy("");
    dWCombineTable2.setSelectFieldObjects(new com.arisystem.beans.datawizard.DWAliasFieldObject[]{
        new com.arisystem.beans.datawizard.DWAliasFieldObject(new com.arisystem.beans.datawizard.DWTable("null","TESTTABLE","TESTTABLE"),"NOTEST",com.arisystem.beans.datawizard.DWFieldObject.DATA_FIELD_LARGE_NORMAL,"NOTEST") ,
        new com.arisystem.beans.datawizard.DWAliasFieldObject(new com.arisystem.beans.datawizard.DWTable("null","TESTTABLE","TESTTABLE"),"DATATEST",com.arisystem.beans.datawizard.DWFieldObject.DATA_FIELD_LARGE_NORMAL,"DATATEST") });
dWCombineTable2.setWhereContition(new com.arisystem.beans.datawizard.DWWhereCondition(""));

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
        .addGap(37, 37, 37)
        .addComponent(dWCombineTable2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(40, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(93, 93, 93)
            .addComponent(dWCombineTable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(107, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.arisystem.beans.combinetable.DWCombineTable dWCombineTable2;
    // End of variables declaration//GEN-END:variables
}
