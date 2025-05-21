import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.geom.AffineTransform;

public class RuletaCasino extends JPanel implements ActionListener {
    private final int NUM_SECTORES = 37; // 0 a 36
    private final Color COLOR_VERDE = new Color(0, 100, 0);
    private double angulo = 0;
    private Timer timer;
    private double velocidad = 0;
    private boolean girando = false;
    private JButton botonGirar;
    private JFrame frame;
    private Personaje personaje;
    private Random rand = new Random();

    public RuletaCasino(Personaje personaje) {
        this.personaje = personaje;
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);

        botonGirar = new JButton("Girar Ruleta Casino");
        botonGirar.addActionListener(e -> iniciarGiro());

        frame = new JFrame("Ruleta Casino");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this, BorderLayout.CENTER);
        frame.add(botonGirar, BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        timer = new Timer(20, this);
    }

    private void iniciarGiro() {
        if (!girando) {
            velocidad = rand.nextDouble() * 15 + 15;
            girando = true;
            timer.start();
            botonGirar.setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (girando) {
            angulo += Math.toRadians(velocidad);
            velocidad *= 0.97;
            if (velocidad < 0.3) {
                girando = false;
                timer.stop();
                mostrarResultado();
                botonGirar.setEnabled(true);
            }
            repaint();
        }
    }

    private void mostrarResultado() {
        int sector = (int)((NUM_SECTORES - ((angulo % (2 * Math.PI)) / (2 * Math.PI)) * NUM_SECTORES) % NUM_SECTORES);
        String mensaje;
        if (sector == 0) {
            mensaje = personaje.getCasoVerde();
        } else if (sector % 2 == 0) {
            mensaje = personaje.getCasoNegro();
        } else {
            mensaje = personaje.getCasoRojo();
        }
        JOptionPane.showMessageDialog(this, "Resultado: " + mensaje);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int size = Math.min(getWidth(), getHeight()) - 20;
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(getWidth()/2, getHeight()/2);
        g2.rotate(angulo);

        double arcAngle = 2 * Math.PI / NUM_SECTORES;
        for (int i = 0; i < NUM_SECTORES; i++) {
            if (i == 0) g2.setColor(COLOR_VERDE);
            else if (i % 2 == 0) g2.setColor(Color.BLACK);
            else g2.setColor(Color.RED);
            g2.fillArc(-size/2, -size/2, size, size, (int)Math.toDegrees(i*arcAngle), (int)Math.toDegrees(arcAngle));
        }

        // Flecha indicadora
        g2.setTransform(new AffineTransform());
        g2.setColor(Color.BLACK);
        int[] x = {getWidth()/2 - 10, getWidth()/2 + 10, getWidth()/2};
        int[] y = {10, 10, 30};
        g2.fillPolygon(x, y, 3);
    }
}
