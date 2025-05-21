import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.geom.AffineTransform;

public class RuletaPersonajes extends JPanel implements ActionListener {
    private final String[] personajes = {
        "Fiestero", "Mala Copa", "Despechado", "Ligador", "Borracho", "Ladron"
    };
    private final Color[] colores = {
        Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA, Color.CYAN
    };
    private double angulo = 0;
    private Timer timer;
    private double velocidad = 0;
    private boolean girando = false;
    private JButton botonGirar;
    private JFrame frame;

    public RuletaPersonajes() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);

        botonGirar = new JButton("Girar Ruleta de Personajes");
        botonGirar.addActionListener(e -> iniciarGiro());

        frame = new JFrame("Ruleta de Personajes");
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
            velocidad = new Random().nextDouble() * 10 + 10;
            girando = true;
            timer.start();
            botonGirar.setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (girando) {
            angulo += Math.toRadians(velocidad);
            velocidad *= 0.98;
            if (velocidad < 0.2) {
                girando = false;
                timer.stop();
                mostrarResultado();
                botonGirar.setEnabled(true);
            }
            repaint();
        }
    }

    private void mostrarResultado() {
        int numSectores = personajes.length;
        int sector = (int)((numSectores - ((angulo % (2 * Math.PI)) / (2 * Math.PI)) * numSectores) % numSectores);
        String ganador = personajes[sector];
        JOptionPane.showMessageDialog(this, "¡Ganó: " + ganador + "!");

        frame.dispose();

        Personaje personajeSeleccionado;
        switch (ganador) {
            case "Fiestero":
                personajeSeleccionado = new Fiestero();
                break;
            case "Mala Copa":
                personajeSeleccionado = new MalaCopa();
                break;
            case "Ligador":
                personajeSeleccionado = new Ligador();
                break;
            case "Despechado":
                personajeSeleccionado = new Despechado();
                break;
            case "Borracho":
                personajeSeleccionado = new Borracho();
                break;
            case "Ladron":
                personajeSeleccionado = new Ladron();
                break;
            default:
                personajeSeleccionado = null;
        }

        if (personajeSeleccionado != null) {
            SwingUtilities.invokeLater(() -> new RuletaCasino(personajeSeleccionado));
        } else {
            JOptionPane.showMessageDialog(null, "Personaje no definido, ruleta casino no iniciada.");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int numSectores = personajes.length;
        int size = Math.min(getWidth(), getHeight()) - 20;
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(getWidth() / 2, getHeight() / 2);
        g2.rotate(angulo);

        double arcAngle = 2 * Math.PI / numSectores;

        for (int i = 0; i < numSectores; i++) {
            g2.setColor(colores[i % colores.length]);
            g2.fillArc(-size / 2, -size / 2, size, size,
                (int) Math.toDegrees(i * arcAngle),
                (int) Math.toDegrees(arcAngle));
        }

        // Flecha
        g2.setTransform(new AffineTransform());
        g2.setColor(Color.BLACK);
        int[] x = {getWidth() / 2 - 10, getWidth() / 2 + 10, getWidth() / 2};
        int[] y = {10, 10, 30};
        g2.fillPolygon(x, y, 3);
    }
}
