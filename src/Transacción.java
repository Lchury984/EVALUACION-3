import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transacción extends JFrame {
    private JPanel TransacciónPanel;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton salirRB;
    private JRadioButton depósitoRB;
    private JRadioButton retiroRadioButton;

    public Transacción() {
        super("                          TRANSACCIÓN                              ");
        setContentPane(TransacciónPanel);
        getRootPane().setWindowDecorationStyle(JRootPane.COLOR_CHOOSER_DIALOG);
        setUndecorated(true);



        // -------------------------------------------------------- Saldo ---------------------------------------------------------
        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(verSaldoRadioButton.isSelected()){
                    Saldo saldo = new Saldo();
                    saldo.setLocationRelativeTo(null);
                    saldo.setVisible(true);
                    saldo.pack();
                    dispose();
                }
            }
        });
        // -------------------------------------------------------- Deposito ---------------------------------------------------------
        depósitoRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(depósitoRB.isSelected()){
                    Depósito depósito = new Depósito();
                    depósito.setLocationRelativeTo(null);
                    depósito.setVisible(true);
                    depósito.pack();
                    dispose();

                }
            }
        });
        // -------------------------------------------------------- retiro  ---------------------------------------------------------
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(retiroRadioButton.isSelected()){
                    Retiro retiro = new Retiro();
                    retiro.setLocationRelativeTo(null);
                    retiro.setVisible(true);
                    retiro.pack();
                    dispose();

                }

            }
        });
        // -------------------------------------------------------- Salir ---------------------------------------------------------
        salirRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"            Muchas Gracias");
                dispose();
            }
        });
    }

}
