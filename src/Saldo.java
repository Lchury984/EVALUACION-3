import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Saldo extends JFrame {

    private JPanel SaldoPanel;
    private JButton VolverButton;
    private JLabel ValorSaldoLabel;
    static double ValorSaldo=200;


    public static double getValorSaldo() {
        return ValorSaldo;
    }

    public Saldo(){
        super("                                              SALDO                                              ");
        setContentPane(SaldoPanel);
        getRootPane().setWindowDecorationStyle(JRootPane.COLOR_CHOOSER_DIALOG);
        setUndecorated(true);

        VolverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transacción transaccion = new Transacción();
                transaccion.setLocationRelativeTo(null);
                transaccion.setVisible(true);
                transaccion.pack();

                dispose();


            }
        });
        ValorSaldoLabel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                ValorSaldoLabel.setText(String.valueOf(ValorSaldo));

            }
        });
    }
    public static void Retiro(double SaldoRetiro){
        ValorSaldo=ValorSaldo-SaldoRetiro;

    }
    public static void Depósito(double SaldoDepósito){
        ValorSaldo=ValorSaldo+SaldoDepósito;


    }

}